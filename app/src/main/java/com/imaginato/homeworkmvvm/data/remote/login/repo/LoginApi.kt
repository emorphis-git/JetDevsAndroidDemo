package com.imaginato.homeworkmvvm.data.remote.login.repo

import com.imaginato.homeworkmvvm.data.remote.login.request.LoginRequest
import kotlinx.coroutines.Deferred
import okhttp3.ResponseBody
import retrofit2.http.Body
import retrofit2.http.POST

interface LoginApi {
    @POST("api/login")
    fun getLoginResponseAsync(@Body loginRequest: LoginRequest): Deferred<retrofit2.Response<ResponseBody?>>
}