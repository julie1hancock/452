package view

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import hancock.julie.temp452project.R
import help.MasterModel
import kotlinx.android.synthetic.main.activity_financial.*
import kotlinx.android.synthetic.main.activity_financial.mainNextArrow
import kotlinx.android.synthetic.main.activity_financial.optionalText
import kotlinx.android.synthetic.main.activity_financial.skipBtn
import kotlinx.android.synthetic.main.activity_financial.toolbar
import kotlinx.android.synthetic.main.activity_rental.*

class FinancialActivity : AppCompatActivity() {

    var utils = 0.0
    var deposit = 0.0
    var parking = 0.0
    var appFee = 0.0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_financial)
        toolbar.setNavigationOnClickListener { onBackPressed() }
        setupOptional()
        setupListeners()
    }

    private fun setupOptional() {
        if(MasterModel.isComparing){
            skipBtn.visibility = View.VISIBLE
            optionalText.text = "OPTIONAL financial info"
        }
        else {
            skipBtn.visibility = View.GONE
            optionalText.text = "Financial Info"
        }
    }

    private fun setupListeners() {
        utilValue.afterTextChanged { if(it.isNotBlank()) utils = it.toDouble() }
        securityDepoValue.afterTextChanged { if(it.isNotBlank()) deposit = it.toDouble() }
        parkingValue.afterTextChanged { if(it.isNotBlank()) parking = it.toDouble() }
        appFeeValue.afterTextChanged { if(it.isNotBlank()) appFee = it.toDouble() }

        mainNextArrow.setOnClickListener{
            MasterModel.fourthScreen(utils, deposit, parking, appFee)
            startActivity(Intent(this, AmenitiesActivity::class.java))
        }
        skipBtn.setOnClickListener{
            startActivity(Intent(this, AmenitiesActivity::class.java))
        }
    }

}