package view

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import hancock.julie.temp452project.R
import help.MasterModel
import kotlinx.android.synthetic.main.activity_address.skipBtn
import kotlinx.android.synthetic.main.activity_amenities.*

class AmenitiesActivity : AppCompatActivity() {

    var parking = true
    var furnished = true
    var pets = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_amenities)
        setupListeners()
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