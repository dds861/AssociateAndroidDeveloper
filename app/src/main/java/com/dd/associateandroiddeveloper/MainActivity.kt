package com.dd.associateandroiddeveloper

import android.app.NotificationManager
import android.app.PendingIntent
import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.app.NotificationCompat
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


        /**
         * Notifications
         */
        btnNotification.setOnClickListener {

            // Create PendingIntent
            val resultIntent = Intent(this, MainActivity::class.java)
            val resultPendingIntent = PendingIntent.getActivity(
                this, 0, resultIntent,
                PendingIntent.FLAG_UPDATE_CURRENT
            )

            // Create Notification
            val builder = NotificationCompat.Builder(this)
                .setSmallIcon(R.mipmap.ic_launcher)
                .setContentTitle("Title")
                .setContentText("Notification text")
                .setContentIntent(resultPendingIntent)

            val notification = builder.build()

            // Show Notification
            val notificationManager =
                getSystemService(Context.NOTIFICATION_SERVICE) as NotificationManager
            notificationManager.notify(1, notification)
        }

        btnCancelNotification.setOnClickListener {
            val notificationManager =
                getSystemService(Context.NOTIFICATION_SERVICE) as NotificationManager
            notificationManager.cancel(1)
        }


    }
}



