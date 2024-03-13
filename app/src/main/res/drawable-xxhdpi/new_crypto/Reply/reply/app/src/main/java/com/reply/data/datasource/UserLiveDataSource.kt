package com.reply.data.datasource

import com.reply.data.pojo.DataWrapper
import com.reply.data.pojo.User
import com.reply.data.pojo.request.LoginRequest
import com.reply.data.repository.UserRepository
import com.reply.data.service.AuthenticationService
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class UserLiveDataSource @Inject constructor(private val authenticationService: AuthenticationService) : BaseDataSource(),
    UserRepository {

    override suspend fun login(request: LoginRequest): DataWrapper<User> {
        return execute { authenticationService.login(request) }
    }

}
