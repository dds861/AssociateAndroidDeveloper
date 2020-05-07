package com.dd.associateandroiddeveloper

import android.view.Gravity
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.custom_toast.*
import kotlinx.android.synthetic.main.custom_toast.view.*
import kotlinx.android.synthetic.main.custom_toast.view.custom_toast_container

class ToastAad(private val appCompatActivity: AppCompatActivity) {


    fun showToast() {
        val text = "Hello toast!"
        val duration = Toast.LENGTH_SHORT
        val toast = Toast.makeText(appCompatActivity, text, duration)
        toast.setGravity(Gravity.TOP or Gravity.LEFT, 100, 200)
        toast.show()
    }

    fun showCustomToast() {
        val inflater = appCompatActivity.layoutInflater
        val layout: View = inflater.inflate(
            R.layout.custom_toast,
            appCompatActivity.custom_toast_container
        )
        layout.text.text = "This is a custom toast"
        val toast = Toast(appCompatActivity)
        toast.setGravity(Gravity.CENTER_VERTICAL, 0, 0)
        toast.duration = Toast.LENGTH_LONG
        toast.view = layout
        toast.show()
    }


    fun showCustomToastFromGoogle() {
        val inflater = appCompatActivity.layoutInflater
        val layout = inflater.inflate(R.layout.custom_toast, appCompatActivity.custom_toast_container)

        layout.text.text = "This is a custom toast"
        with(Toast(appCompatActivity.applicationContext)) {
            setGravity(Gravity.CENTER_VERTICAL, 0, 0)
            duration = Toast.LENGTH_LONG
            view = layout
            show()
        }
    }
}