package com.rajuyadav.animexmanga.utilities

import android.app.Application
import android.content.Context
import android.location.LocationManager
import android.util.Patterns
import android.view.inputmethod.InputMethodManager
import androidx.appcompat.app.AppCompatActivity

/**
 * Author : Raju Yadav
 * Date : 9 May 2021
 * Description : Utility class for handling Global Functions for the application.
 */
class AppUtils(var application: Application) {

    companion object {
        fun newInstance(application: Application): AppUtils {
            return AppUtils(application)
        }
    }

    fun hideKeyboard(activity: AppCompatActivity) {
        val inputManager: InputMethodManager =
            application.getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
        inputManager.hideSoftInputFromWindow(
            activity.currentFocus?.windowToken,
            InputMethodManager.SHOW_FORCED
        )
    }

    /**
     * Return the validity of Email Address
     */
    fun isEmailValid(email: String): Boolean {
        return Patterns.EMAIL_ADDRESS.matcher(email).matches()
    }

    fun checkLocationStatus(): Boolean {
        val locationManager =
            application.getSystemService(Context.LOCATION_SERVICE) as LocationManager
        var isGpsEnabled = false
        var isNetworkEnabled = false

        try {
            isGpsEnabled = locationManager.isProviderEnabled(LocationManager.GPS_PROVIDER)
        } catch (e: Exception) {
            e.printStackTrace()
        }

        try {
            isNetworkEnabled = locationManager.isProviderEnabled(LocationManager.NETWORK_PROVIDER)
        } catch (e: Exception) {
            e.printStackTrace()
        }

        return isGpsEnabled || isNetworkEnabled
    }
}