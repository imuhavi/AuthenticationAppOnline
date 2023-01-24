package com.example.authenticationapponline.repository

import com.example.authenticationapponline.data.api.methods.UserApi
import com.example.authenticationapponline.data.api.request.LoginRequest
import com.example.authenticationapponline.data.api.response.LoginResponse
import retrofit2.Response

class UserRepository {
    suspend fun loginUser(loginRequest: LoginRequest):
            Response<LoginResponse>? {
        return UserApi.getApi()?.loginUser(loginRequest = loginRequest)
    }
}