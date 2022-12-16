package com.imaginato.homeworkmvvm.utils

object inputValidator {

    fun validateLogin(userName: String, password: String): Boolean {
        if (userName.isEmpty()) {
            return false
        }
        if (password.isEmpty()) {
            return false
        }
        return true
    }
}