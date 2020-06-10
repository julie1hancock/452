package help

import android.app.Dialog
import android.content.Context
import android.os.Bundle
import hancock.julie.temp452project.R

object ProgressLoader{
    var numShowing = 0
    private var isShowing:Boolean = false
    private var progress:CustomProgress? = null//
    fun show(context: Context){
        numShowing++
        if(isShowing) return
        isShowing = true
        progress = CustomProgress(context)
        progress?.show()
    }
    fun hide(){
        numShowing--
        if(numShowing > 0) return
        if(!isShowing) return
        isShowing = false
        if(progress?.isShowing == true)
            progress?.dismiss()
        progress = null
    }
}

class CustomProgress(context:Context) : Dialog(context){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.custom_progress)
        setCancelable(false)
    }
}