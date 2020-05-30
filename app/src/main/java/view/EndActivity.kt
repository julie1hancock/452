package view

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import hancock.julie.temp452project.R
import help.Importance
import help.MasterModel
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

        setupDecision()
        setupView()

    }

    private fun setupView() {
        avgCompText.text = rating
        basedOffText.text = reasoning
        endRoot.setBackgroundColor(color)
    }

    private fun setupDecision() {
        when {
            MasterModel.importance == Importance.Rent -> {
                rating = resources.getString(R.string.above_avg)
                color = resources.getColor(R.color.above_avg)
                reasoning = resources.getString(R.string.based_rent)
            }
            MasterModel.importance == Importance.Laundry -> {
                rating = resources.getString(R.string.is_avg)
                color = resources.getColor(R.color.is_avg)
                reasoning = resources.getString(R.string.based_laundry)
            }
            MasterModel.importance == Importance.Bedrooms -> {
                rating = resources.getString(R.string.below_avg)
                color = resources.getColor(R.color.below_avg)
                reasoning = resources.getString(R.string.based_bedroom)
            }
        }
    }

}