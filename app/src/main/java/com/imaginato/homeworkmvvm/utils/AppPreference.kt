package com.imaginato.homeworkmvvm.utils

import android.content.Context
import android.content.SharedPreferences

private const val USER_PREFERENCE_KEY = "my_demo_app"
private const val TOKEN = "token"

class AppPreference(context: Context) {

    private val mUserPref: SharedPreferences =
        context.getSharedPreferences(USER_PREFERENCE_KEY, Context.MODE_PRIVATE)

    //store token
    var token: String
        get() = mUserPref.getString(TOKEN, "")!!
        set(token) {
            val editor = mUserPref.edit()
            editor.putString(TOKEN, token)
            editor.apply()
        }
}