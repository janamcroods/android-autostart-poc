package com.example.myapplication

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.widget.Toast

class startupOnBootUpReceiver : BroadcastReceiver() {

    override fun onReceive(context: Context, intent: Intent) {

        if (Intent.ACTION_BOOT_COMPLETED == intent.action) {
            Toast.makeText(context,"this is toast message",Toast.LENGTH_SHORT).show()

            val activityIntent = Intent(context, MainActivity::class.java)

            activityIntent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)

            context.startActivity(activityIntent)
        }
    }
}
