package view

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import hancock.julie.temp452project.R
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        toolbar.setNavigationOnClickListener { onBackPressed() }
        setupListeners()
    }

    private fun setupListeners() {
        setupImportantToggle()
    }

    var importantSelected = 1
    private fun setupImportantToggle() {
//        mostImportantOption1.setOnCheckedChangeListener{ button, isChecked ->
//            importantSelected = 1
//            mostImportantOption1.setBackgroundColor(resources.getColor(R.color.selected))
//            mostImportantOption2.setBackgroundColor(resources.getColor(R.color.not_selected))
//            mostImportantOption3.setBackgroundColor(resources.getColor(R.color.not_selected))
//        }
//        mostImportantOption2.setOnCheckedChangeListener{ button, isChecked ->
//            importantSelected = 2
//            mostImportantOption1.setBackgroundColor(resources.getColor(R.color.not_selected))
//            mostImportantOption2.setBackgroundColor(resources.getColor(R.color.selected))
//            mostImportantOption3.setBackgroundColor(resources.getColor(R.color.not_selected))
//        }
//        mostImportantOption3.setOnCheckedChangeListener{ button, isChecked ->
//            importantSelected = 3
//            mostImportantOption1.setBackgroundColor(resources.getColor(R.color.not_selected))
//            mostImportantOption2.setBackgroundColor(resources.getColor(R.color.not_selected))
//            mostImportantOption3.setBackgroundColor(resources.getColor(R.color.selected))
//        }
//        mostImportantOption1.isChecked = true //first

    }


}