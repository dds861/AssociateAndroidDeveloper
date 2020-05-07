package com.dd.associateandroiddeveloper

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.snackbar.Snackbar
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        /**
         * Toast
         */
        val toastAad = ToastAad(this)

        btnToast.setOnClickListener {
            toastAad.showToast()
        }
        btnToast2.setOnClickListener {
            toastAad.showCustomToast()
        }
        btnToast3.setOnClickListener {
            toastAad.showCustomToastFromGoogle()
        }

        /**
         * Snackbar
         */
        val mySnackbar = Snackbar.make(btnSnackbar, R.string.app_name, Snackbar.LENGTH_SHORT)
        mySnackbar.setAction("Undo", SnackbarAad())
        btnSnackbar.setOnClickListener { mySnackbar.show() }

    }
}



