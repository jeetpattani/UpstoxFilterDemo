package com.reply.di.module;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0015\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0001\u00a2\u0006\u0002\b\u0007J+\u0010\b\u001a\u00020\t2\b\b\u0001\u0010\n\u001a\u00020\u00042\b\b\u0001\u0010\u000b\u001a\u00020\u00042\b\b\u0001\u0010\f\u001a\u00020\u0004H\u0001\u00a2\u0006\u0002\b\rJ\u0015\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u0010H\u0001\u00a2\u0006\u0002\b\u0011J\r\u0010\u0012\u001a\u00020\u0004H\u0001\u00a2\u0006\u0002\b\u0013J\u0015\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\tH\u0001\u00a2\u0006\u0002\b\u0017\u00a8\u0006\u0018"}, d2 = {"Lcom/reply/di/module/NetModule;", "", "()V", "provideAesCryptoInterceptor", "Lokhttp3/Interceptor;", "aesCryptoInterceptor", "Lcom/reply/core/AESCryptoInterceptor;", "provideAesCryptoInterceptor$app_debug", "provideClient", "Lokhttp3/OkHttpClient;", "headerInterceptor", "networkInterceptor", "aesInterceptor", "provideClient$app_debug", "provideHeaderInterceptor", "session", "Lcom/reply/core/Session;", "provideHeaderInterceptor$app_debug", "provideNetworkInterceptor", "provideNetworkInterceptor$app_debug", "provideRetrofit", "Lretrofit2/Retrofit;", "okHttpClient", "provideRetrofit$app_debug", "app_debug"})
@dagger.Module(includes = {com.reply.di.module.ApplicationModule.class})
public final class NetModule {
    
    public NetModule() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @javax.inject.Singleton()
    public final okhttp3.OkHttpClient provideClient$app_debug(@org.jetbrains.annotations.NotNull()
    @javax.inject.Named(value = "header")
    okhttp3.Interceptor headerInterceptor, @org.jetbrains.annotations.NotNull()
    @javax.inject.Named(value = "pre_validation")
    okhttp3.Interceptor networkInterceptor, @org.jetbrains.annotations.NotNull()
    @javax.inject.Named(value = "aes")
    okhttp3.Interceptor aesInterceptor) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final retrofit2.Retrofit provideRetrofit$app_debug(@org.jetbrains.annotations.NotNull()
    okhttp3.OkHttpClient okHttpClient) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Named(value = "header")
    @javax.inject.Singleton()
    @dagger.Provides()
    public final okhttp3.Interceptor provideHeaderInterceptor$app_debug(@org.jetbrains.annotations.NotNull()
    com.reply.core.Session session) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Named(value = "pre_validation")
    @javax.inject.Singleton()
    @dagger.Provides()
    public final okhttp3.Interceptor provideNetworkInterceptor$app_debug() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Named(value = "aes")
    @javax.inject.Singleton()
    @dagger.Provides()
    public final okhttp3.Interceptor provideAesCryptoInterceptor$app_debug(@org.jetbrains.annotations.NotNull()
    com.reply.core.AESCryptoInterceptor aesCryptoInterceptor) {
        return null;
    }
}