package view

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import hancock.julie.temp452project.R
import help.MasterModel
import kotlinx.android.synthetic.main.activity_address.*

class AddressActivity : AppCompatActivity() {

    var address = ""
    var aptNum = ""
    var zipCode = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_address)
        toolbar.setNavigationOnClickListener { onBackPressed() }
        setupOptional()
        setupListeners()
    }

    private fun setupOptional() {
        if(MasterModel.isComparing){
            skipBtn.visibility = View.VISIBLE
            optionalText.text = "OPTIONAL address info"
        }
        else {
            skipBtn.visibility = View.GONE
            optionalText.text = "Address Info"
        }
    }

    private fun setupListeners() {
        addressValue.afterTextChanged { if(it.isNotBlank()) address = it }
        aptNumValue.afterTextChanged { if(it.isNotBlank()) aptNum = it }
        zipValue.afterTextChanged { if(it.isNotBlank()) zipCode = it.toInt() }

        mainNextArrow.setOnClickListener{
            if(isFilledOut()){
                MasterModel.thirdScreen(address, aptNum, zipCode)
                startActivity(Intent(this, FinancialActivity::class.java))
            } else {
                Toast.makeText(this, "Sorry, please fill out all information before continuing, or hit skip at the top.", Toast.LENGTH_LONG).show()
            }
        }
        skipBtn.setOnClickListener{
            startActivity(Intent(this, FinancialActivity::class.java))
        }
    }

    private fun isFilledOut(): Boolean {
        return address.isNotBlank() && zipCode > 0
    }

}