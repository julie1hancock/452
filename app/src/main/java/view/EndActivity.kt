package view

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import hancock.julie.temp452project.R
import help.*
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.rxkotlin.subscribeBy
import io.reactivex.schedulers.Schedulers
import kotlinx.android.synthetic.main.activity_address.*
import kotlinx.android.synthetic.main.activity_address.toolbar
import kotlinx.android.synthetic.main.activity_end.*

class EndActivity : AppCompatActivity() {

    var rating = ""
    var reasoning = ""
    var color : Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_end)
        color = resources.getColor(R.color.yikes)
        getDecision()
//        setupDecision()
//        setupView()

    }

    private fun setupView() {
        avgCompText.text = rating
        basedOffText.text = reasoning
        endRoot.setBackgroundColor(color)
    }

    @SuppressLint("CheckResult")
    private fun getDecision(){
        Interactor().getIsScrewed(this)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .doOnSubscribe {
                    ProgressLoader.show(this)
                }
                .subscribeBy(
                        onSuccess = {
                            ProgressLoader.hide()
                            MasterModel.rating = Rating.ABOVE
                            setupDecision()
                        },
                        onError = {
                            MasterModel.rating = Rating.BELOW
                            setupDecision()
                        }
                )
    }


    @SuppressLint("CheckResult")
    private fun setupDecision() {

        when (MasterModel.rating) {
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
        reasoning = when (MasterModel.importance){
            Importance.Rent -> {
                resources.getString(R.string.based_rent)
            }
            Importance.Laundry -> {
                resources.getString(R.string.based_laundry)
            }
            Importance.Bedrooms -> {
                resources.getString(R.string.based_bedroom)
            }
        }
        setupView()
    }

}