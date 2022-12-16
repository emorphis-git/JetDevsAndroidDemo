package com.imaginato.homeworkmvvm.data.remote.login.repo

import com.imaginato.homeworkmvvm.data.remote.login.request.LoginRequest
import kotlinx.coroutines.flow.Flow
import okhttp3.ResponseBody

interface LoginRepository {
    suspend fun getLoginData(loginRequest: LoginRequest): Flow<retrofit2.Response<ResponseBody?>>
}