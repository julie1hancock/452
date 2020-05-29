package view

import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import hancock.julie.temp452project.R
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var importantSelected = 1
    var citySelected = 1
    var monthlyRent = 0.0
    var hasWasherDryer = true
    var numBedrooms = 0
    var numBathrooms = 0.0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        toolbar.setNavigationOnClickListener { onBackPressed() }
        setupListeners()
    }

    private fun setupListeners() {
        setupImportantToggle()
        setupCityToggle()
        monthlyRentValue.afterTextChanged { monthlyRent = it.toDouble() }
        numBedroomsValue.afterTextChanged { numBedrooms = it.toInt() }
        numBathroomsValue.afterTextChanged { numBathrooms = it.toDouble() }
        washerDryerValue.setOnCheckedChangeListener{ _, isChecked ->
            hasWasherDryer = isChecked
        }

    }

    private fun setupImportantToggle() {
        mostImportantOption1.setOnCheckedChangeListener{ _, _ ->
            importantSelected = 1
            mostImportantOption1.setBackgroundColor(resources.getColor(R.color.selected))
            mostImportantOption2.setBackgroundColor(resources.getColor(R.color.not_selected))
            mostImportantOption3.setBackgroundColor(resources.getColor(R.color.not_selected))
        }
        mostImportantOption2.setOnCheckedChangeListener{ _, _ ->
            importantSelected = 2
            mostImportantOption1.setBackgroundColor(resources.getColor(R.color.not_selected))
            mostImportantOption2.setBackgroundColor(resources.getColor(R.color.selected))
            mostImportantOption3.setBackgroundColor(resources.getColor(R.color.not_selected))
        }
        mostImportantOption3.setOnCheckedChangeListener{ _, _ ->
            importantSelected = 3
            mostImportantOption1.setBackgroundColor(resources.getColor(R.color.not_selected))
            mostImportantOption2.setBackgroundColor(resources.getColor(R.color.not_selected))
            mostImportantOption3.setBackgroundColor(resources.getColor(R.color.selected))
        }
        mostImportantOption1.isChecked = true //first

    }

    private fun setupCityToggle() {
        city1.setOnCheckedChangeListener{ _, _ ->
            citySelected = 1
            city1.setBackgroundColor(resources.getColor(R.color.selected))
            city2.setBackgroundColor(resources.getColor(R.color.not_selected))
        }
        city2.setOnCheckedChangeListener{ _, _ ->
            citySelected = 2
            city1.setBackgroundColor(resources.getColor(R.color.not_selected))
            city2.setBackgroundColor(resources.getColor(R.color.selected))
        }
        city1.isChecked = true
    }


}

fun EditText.afterTextChanged(afterTextChanged: (String) -> Unit) {
    this.addTextChangedListener(object : TextWatcher {
        override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
        }

        override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
        }

        override fun afterTextChanged(editable: Editable?) {
            afterTextChanged.invoke(editable.toString())
        }
    })
}