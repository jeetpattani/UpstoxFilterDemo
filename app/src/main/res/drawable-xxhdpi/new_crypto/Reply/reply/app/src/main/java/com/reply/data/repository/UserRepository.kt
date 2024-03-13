package com.reply.data.repository

import com.reply.data.pojo.DataWrapper
import com.reply.data.pojo.User
import com.reply.data.pojo.request.LoginRequest


interface UserRepository {
    /**
     * Same name of API nca
     */
    suspend fun login(request: LoginRequest): DataWrapper<User>

}