package view

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import hancock.julie.temp452project.R
import help.MasterModel
import kotlinx.android.synthetic.main.activity_main.toolbar
import kotlinx.android.synthetic.main.activity_start.*

class StartActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_start)
        toolbar.setNavigationOnClickListener { onBackPressed() }
        setupListeners()
    }

    private fun setupListeners() {
        add.setOnClickListener{
            MasterModel.isComparing = false
            startActivity(Intent(this, MainActivity::class.java))
        }
        compare.setOnClickListener{
            MasterModel.isComparing = true
            startActivity(Intent(this, MainActivity::class.java))
        }
    }
}