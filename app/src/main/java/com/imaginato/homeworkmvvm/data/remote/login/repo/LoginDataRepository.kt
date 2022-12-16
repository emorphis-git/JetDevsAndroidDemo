package com.imaginato.homeworkmvvm.data.remote.login.repo

import com.imaginato.homeworkmvvm.data.remote.login.request.LoginRequest
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.flowOn

class LoginDataRepository constructor(
    private var api: LoginApi
) : LoginRepository {

    override suspend fun getLoginData(loginRequest: LoginRequest) = flow {
        val response = api.getLoginResponseAsync(loginRequest).await()
        emit(response)
    }.flowOn(Dispatchers.Main)
}