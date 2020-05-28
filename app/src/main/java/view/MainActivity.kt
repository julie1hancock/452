package view

import android.graphics.Color
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
        mostImportantOptionBedrooms.setOnCheckedChangeListener{ button, isChecked ->
            button.setBackgroundColor(
                    if(isChecked) resources.getColor(R.color.selected)
                    else resources.getColor(R.color.not_selected)
            )
        }

    }


}