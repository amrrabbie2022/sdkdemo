package io.qashi.sdkdemo

import android.app.Dialog
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Window
import android.widget.Button
import android.widget.TextView

class ToastActivity : AppCompatActivity() {

    var title:String="sdk demo"
    var msg:String="this is qashi sdk demo ..."

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_toast)

        showCustomDialog(title,msg)
    }

     fun showCustomDialog(title: String, msg: String) {
        val dialog = Dialog(this)
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE)
        dialog.setCancelable(true)
        dialog.setContentView(R.layout.custom_dialog_msg)
        val titlemsg = dialog.findViewById(R.id.titlemsg) as TextView
        val bodymsg = dialog.findViewById(R.id.bodymsg) as TextView

        titlemsg.setText(title)
        bodymsg.setText(msg)

        val btnmsg = dialog.findViewById(R.id.btnmsg) as Button

        //dialog.window?.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))

        btnmsg.setOnClickListener {
            dialog.dismiss()
        }

        dialog.show()
    }
}