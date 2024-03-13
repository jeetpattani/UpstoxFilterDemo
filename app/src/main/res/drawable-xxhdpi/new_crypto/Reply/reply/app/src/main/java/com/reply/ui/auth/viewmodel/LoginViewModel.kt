package com.reply.ui.auth.viewmodel

import androidx.lifecycle.viewModelScope
import com.reply.data.pojo.User
import com.reply.data.pojo.request.LoginRequest
import com.reply.data.repository.UserRepository
import com.reply.ui.base.APILiveData
import com.reply.ui.base.BaseViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

class LoginViewModel @Inject constructor(private val userRepository: UserRepository) : BaseViewModel() {

    val loginLiveData = APILiveData<User>()

    fun login(request: LoginRequest) {
        viewModelScope.launch {
            val result = userRepository.login(request)
            loginLiveData.value = result
        }
    }
}