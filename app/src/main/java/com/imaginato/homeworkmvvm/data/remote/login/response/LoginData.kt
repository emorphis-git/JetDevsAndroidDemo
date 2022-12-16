package com.imaginato.homeworkmvvm.data.remote.login.response

import com.google.gson.annotations.SerializedName


data class LoginData(

    @field:SerializedName("isDeleted")
    val isDeleted: Boolean? = null,

    @field:SerializedName("userName")
    val userName: String? = null,

    @field:SerializedName("userId")
    val userId: String? = null
)