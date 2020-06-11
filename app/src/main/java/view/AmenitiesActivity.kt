package view

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import hancock.julie.temp452project.R
import help.MasterModel
import kotlinx.android.synthetic.main.activity_address.skipBtn
import kotlinx.android.synthetic.main.activity_amenities.*
import kotlinx.android.synthetic.main.activity_amenities.optionalText

class AmenitiesActivity : AppCompatActivity() {

    var parking = true
    var furnished = true
    var pets = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_amenities)
        setupOptional()
        setupListeners()
    }

    private fun setupOptional() {
        if(MasterModel.isComparing){
            skipBtn.visibility = View.VISIBLE
            optionalText.text = "OPTIONAL amenities info"
            seeResults.text = "VIEW COMPARISON!!!"
        }
        else {
            skipBtn.visibility = View.GONE
            optionalText.text = "Amenities Info"
            seeResults.text = "ADD POSTING!"
        }
    }

    private fun setupListeners() {
        parkingValue.setOnCheckedChangeListener{_, isChecked ->
            parking = isChecked
        }
        furnishedValue.setOnCheckedChangeListener{_, isChecked ->
            furnished = isChecked
        }
        petFriendlyValue.setOnCheckedChangeListener{_, isChecked ->
            pets = isChecked
        }


        seeResults.setOnClickListener{
            MasterModel.fifthScreen(parking, furnished, pets)
            startActivity(Intent(this, EndActivity::class.java))
        }
        skipBtn.setOnClickListener{
            startActivity(Intent(this, EndActivity::class.java))
        }
    }

}