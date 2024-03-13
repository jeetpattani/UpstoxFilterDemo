package com.reply.data.service

import com.reply.data.URLFactory
import com.reply.data.pojo.ResponseBody
import com.reply.data.pojo.User
import com.reply.data.pojo.request.LoginRequest
import retrofit2.http.Body
import retrofit2.http.POST

interface AuthenticationService {

    /**
     * API calling url and method
     */
    @POST(URLFactory.Method.LOGIN)
    suspend fun login(@Body request: LoginRequest): ResponseBody<User>

}