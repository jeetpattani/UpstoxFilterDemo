package com.reply.di.module;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0007\u00a8\u0006\u000b"}, d2 = {"Lcom/reply/di/module/ServiceModule;", "", "()V", "provideAuthenticationService", "Lcom/reply/data/service/AuthenticationService;", "retrofit", "Lretrofit2/Retrofit;", "provideUserRepository", "Lcom/reply/data/repository/UserRepository;", "userLiveDataSource", "Lcom/reply/data/datasource/UserLiveDataSource;", "app_debug"})
@dagger.Module()
public final class ServiceModule {
    
    public ServiceModule() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final com.reply.data.repository.UserRepository provideUserRepository(@org.jetbrains.annotations.NotNull()
    com.reply.data.datasource.UserLiveDataSource userLiveDataSource) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final com.reply.data.service.AuthenticationService provideAuthenticationService(@org.jetbrains.annotations.NotNull()
    retrofit2.Retrofit retrofit) {
        return null;
    }
}