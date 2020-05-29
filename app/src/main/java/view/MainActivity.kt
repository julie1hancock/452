package view

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import hancock.julie.temp452project.R
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
//        setSupportActionBar(toolbar)
//        toolbar.setNavigationOnClickListener { onBackPressed() }
        //vm = new
        setupListeners()
    }

    private fun setupListeners() {
        setupImportantToggle()



    }

    var importantSelected = 0
    private fun setupImportantToggle() {
        mostImportantOption1.setOnCheckedChangeListener{ button, isChecked ->
            if(isChecked && importantSelected != 1) {
                importantSelected = 1
                mostImportantOption1.setBackgroundColor(resources.getColor(R.color.selected))
                mostImportantOption2.setBackgroundColor(resources.getColor(R.color.not_selected))
                mostImportantOption3.setBackgroundColor(resources.getColor(R.color.not_selected))
            }
        }
        mostImportantOption2.setOnCheckedChangeListener{ button, isChecked ->
            if(isChecked && importantSelected != 2) {
                importantSelected = 2
                mostImportantOption2.setBackgroundColor(resources.getColor(R.color.selected))
                mostImportantOption1.setBackgroundColor(resources.getColor(R.color.not_selected))
                mostImportantOption3.setBackgroundColor(resources.getColor(R.color.not_selected))
            }
        }
        mostImportantOption3.setOnCheckedChangeListener{ button, isChecked ->
            if(isChecked && importantSelected != 3) {
                importantSelected = 3
                mostImportantOption3.setBackgroundColor(resources.getColor(R.color.selected))
                mostImportantOption2.setBackgroundColor(resources.getColor(R.color.not_selected))
                mostImportantOption1.setBackgroundColor(resources.getColor(R.color.not_selected))
            }
        }
        mostImportantOption2.isChecked = false //none
        mostImportantOption3.isChecked = false //none
        mostImportantOption1.isChecked = true //first

    }


}