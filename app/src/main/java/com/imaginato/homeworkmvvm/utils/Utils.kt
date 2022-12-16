package com.imaginato.homeworkmvvm.utils

import android.content.Context
import android.widget.Toast


object Utils {

    fun showErrorToast(context:Context, strErrorMsg: String?) {
        if (strErrorMsg.isNullOrEmpty()) {
            Toast.makeText(context,strErrorMsg, Toast.LENGTH_SHORT).show()
        } else {
            Toast.makeText(context,strErrorMsg,Toast.LENGTH_SHORT).show()
        }
    }
}