package view

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import hancock.julie.temp452project.R
import help.MasterModel
import kotlinx.android.synthetic.main.activity_rental.*

class RentalActivity : AppCompatActivity() {

    var isComplex = true
    var isBasement = false
    var isHouse = false
    var numMonths = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_rental)
        toolbar.setNavigationOnClickListener { onBackPressed() }
        setupListeners()
    }

    private fun setupListeners() {
        complexValue.setOnCheckedChangeListener{ _, isChecked ->
            isComplex = isChecked
        }
        basementValue.setOnCheckedChangeListener{ _, isChecked ->
            isBasement = isChecked
        }
        houseValue.setOnCheckedChangeListener{ _, isChecked ->
            isHouse = isChecked
        }
        lengthValue.afterTextChanged { if(it.isNotBlank()) numMonths = it.toInt() }

        mainNextArrow.setOnClickListener{
            if(isFilledOut()){
                MasterModel.secondScreen(isComplex, isBasement, isHouse, numMonths)
                startActivity(Intent(this, AddressActivity::class.java))
            } else {
                Toast.makeText(this, "Sorry, please fill out all information before continuing, or hit skip at the top.", Toast.LENGTH_LONG).show()
            }
        }
        skipBtn.setOnClickListener{
            startActivity(Intent(this, AddressActivity::class.java))
        }
    }

    private fun isFilledOut(): Boolean {
        return numMonths > 0
    }
}