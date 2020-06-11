package view

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import hancock.julie.temp452project.R
import help.*
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.rxkotlin.subscribeBy
import io.reactivex.schedulers.Schedulers
import kotlinx.android.synthetic.main.activity_end.*

class EndActivity : AppCompatActivity() {

    var rating = ""
    var reasoning = ""
    var color : Int = 0
    private var finalRating = Rating.YIKES


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_end)
        color = resources.getColor(R.color.yikes)
        getDecision()
    }

    @SuppressLint("CheckResult")
    private fun getDecision(){
        MasterModel.rating = Rating.BELOW
        if(MasterModel.isComparing){
            setupDecision()
        } else {
            Interactor().postPosting(this)
                    .subscribeOn(Schedulers.io())
                    .observeOn(AndroidSchedulers.mainThread())
                    .doOnSubscribe {
                        ProgressLoader.show(this)
                    }
                    .subscribeBy(
                            onSuccess = {
                                ProgressLoader.hide()
                                setupDecision()
                            },
                            onError = {
                                ProgressLoader.hide()
                                setupDecision()
                            }
                    )
        }

    }



    private fun setupDecision() {

        if(MasterModel.isComparing) {
            reasoning = when (MasterModel.importance) {
                Importance.Rent -> {
                    setRent()
                    resources.getString(R.string.based_rent)
                }
                Importance.Laundry -> {
                    setLaundry()
                    resources.getString(R.string.based_laundry)
                }
                Importance.Bedrooms -> {
                    setBedrooms()
                    resources.getString(R.string.based_bedroom)
                }
            }

            when (finalRating) {
                Rating.ABOVE -> {
                    rating = resources.getString(R.string.above_avg)
                    color = resources.getColor(R.color.above_avg)
                }
                Rating.AVERAGE -> {
                    rating = resources.getString(R.string.is_avg)
                    color = resources.getColor(R.color.is_avg)
                }
                Rating.BELOW -> {
                    rating = resources.getString(R.string.below_avg)
                    color = resources.getColor(R.color.below_avg)
                }
            }
        }
        else{
            rating = "Added posting!"
            reasoning = "thank you!"
            color = resources.getColor(R.color.selected)
        }

        avgCompText.text = rating
        basedOffText.text = reasoning
        endRoot.setBackgroundColor(color)

    }

    private fun setBedrooms() {
        val num = MasterModel.rental.numBedrooms
        finalRating = when{
            num > .9 && num < 2.5 -> Rating.AVERAGE
            num >= 2.5 -> Rating.ABOVE
            else -> Rating.BELOW
        }
    }

    private fun setLaundry() {
        finalRating = when{
            MasterModel.amenities.hasWasherDryer -> Rating.ABOVE
            else -> Rating.BELOW
        }
    }

    private fun setRent() {
        val num = MasterModel.financial.monthlyRent
        finalRating = when{
            num > 777 && num < 1451 -> Rating.AVERAGE
            num >= 1451 -> Rating.BELOW
            else -> Rating.ABOVE
        }
    }

}