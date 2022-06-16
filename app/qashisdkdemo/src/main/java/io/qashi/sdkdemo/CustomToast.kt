package io.qashi.sdkdemo

import android.app.Dialog
import android.content.Context
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.view.Window
import android.widget.Button
import android.widget.TextView

class CustomToast {

    lateinit var title:String
    lateinit var msg:String
    lateinit var context: Context

  public  fun showCustomDialog(context: Context,title: String, msg: String) {
        val dialog = Dialog(context)
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