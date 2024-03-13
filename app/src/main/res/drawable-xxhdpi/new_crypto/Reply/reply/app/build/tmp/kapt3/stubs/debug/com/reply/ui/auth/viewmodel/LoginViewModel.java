package com.reply.ui.auth.viewmodel;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000e"}, d2 = {"Lcom/reply/ui/auth/viewmodel/LoginViewModel;", "Lcom/reply/ui/base/BaseViewModel;", "userRepository", "Lcom/reply/data/repository/UserRepository;", "(Lcom/reply/data/repository/UserRepository;)V", "loginLiveData", "Lcom/reply/ui/base/APILiveData;", "Lcom/reply/data/pojo/User;", "getLoginLiveData", "()Lcom/reply/ui/base/APILiveData;", "login", "", "request", "Lcom/reply/data/pojo/request/LoginRequest;", "app_debug"})
public final class LoginViewModel extends com.reply.ui.base.BaseViewModel {
    private final com.reply.data.repository.UserRepository userRepository = null;
    @org.jetbrains.annotations.NotNull()
    private final com.reply.ui.base.APILiveData<com.reply.data.pojo.User> loginLiveData = null;
    
    @javax.inject.Inject()
    public LoginViewModel(@org.jetbrains.annotations.NotNull()
    com.reply.data.repository.UserRepository userRepository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.reply.ui.base.APILiveData<com.reply.data.pojo.User> getLoginLiveData() {
        return null;
    }
    
    public final void login(@org.jetbrains.annotations.NotNull()
    com.reply.data.pojo.request.LoginRequest request) {
    }
}