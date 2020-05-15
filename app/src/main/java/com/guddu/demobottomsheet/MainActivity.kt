package com.guddu.demobottomsheet

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import com.google.android.material.bottomsheet.BottomSheetDialog
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        show_dialog.setOnClickListener {
            val dialog = BottomSheetDialog(this)
            val view = layoutInflater.inflate(R.layout.dialog_layout, null)
            val close = view.findViewById<ImageView>(R.id.iv_close)
            close.setOnClickListener {
                dialog.dismiss()
            }

            //dialog.setCancelable(false)
            //

            dialog.setContentView(view)
            dialog.show()

        }
    }
}
