package com.rajuyadav.animexmanga.firebase

import android.util.Log
import com.google.firebase.messaging.FirebaseMessagingService

class FirebaseMessaging : FirebaseMessagingService() {

    private val TAG: String? = "TOKEN >>>"

    override fun onNewToken(p0: String) {
        super.onNewToken(p0)
        Log.d(TAG, "Refreshed Token: $p0")
    }
}