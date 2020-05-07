package com.dd.associateandroiddeveloper

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*


open class MainActivity : AppCompatActivity() {

    private val toastAad = ToastAad(this)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnToast.setOnClickListener {
            toastAad.showToast()
        }
        btnToast2.setOnClickListener {
            toastAad.showCustomToast()
        }
        btnToast3.setOnClickListener {
            toastAad.showCustomToastFromGoogle()
        }


    }
}
