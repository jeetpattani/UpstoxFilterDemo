package com.reply.di.module;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0015\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0001\u00a2\u0006\u0002\b\u0007J\r\u0010\b\u001a\u00020\tH\u0001\u00a2\u0006\u0002\b\nJ\u0015\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0001\u00a2\u0006\u0002\b\u000fJ\u0015\u0010\u0010\u001a\u00020\u00112\u0006\u0010\r\u001a\u00020\u000eH\u0001\u00a2\u0006\u0002\b\u0012J\u0015\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0001\u00a2\u0006\u0002\b\u0017J\u0015\u0010\u0018\u001a\u00020\u00162\u0006\u0010\r\u001a\u00020\u000eH\u0001\u00a2\u0006\u0002\b\u0019\u00a8\u0006\u001a"}, d2 = {"Lcom/reply/di/module/ApplicationModule;", "", "()V", "getSession", "Lcom/reply/core/Session;", "session", "Lcom/reply/core/AppSession;", "getSession$app_debug", "provideAESKey", "", "provideAESKey$app_debug", "provideApplicationContext", "Landroid/content/Context;", "application", "Landroid/app/Application;", "provideApplicationContext$app_debug", "provideCacheDir", "Ljava/io/File;", "provideCacheDir$app_debug", "provideCurrentLocale", "Ljava/util/Locale;", "resources", "Landroid/content/res/Resources;", "provideCurrentLocale$app_debug", "provideResources", "provideResources$app_debug", "app_debug"})
@dagger.Module()
public final class ApplicationModule {
    
    public ApplicationModule() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Named(value = "cache")
    @dagger.Provides()
    public final java.io.File provideCacheDir$app_debug(@org.jetbrains.annotations.NotNull()
    android.app.Application application) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final android.content.res.Resources provideResources$app_debug(@org.jetbrains.annotations.NotNull()
    android.app.Application application) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final java.util.Locale provideCurrentLocale$app_debug(@org.jetbrains.annotations.NotNull()
    android.content.res.Resources resources) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final android.content.Context provideApplicationContext$app_debug(@org.jetbrains.annotations.NotNull()
    android.app.Application application) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final com.reply.core.Session getSession$app_debug(@org.jetbrains.annotations.NotNull()
    com.reply.core.AppSession session) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Named(value = "aes-key")
    @javax.inject.Singleton()
    @dagger.Provides()
    public final java.lang.String provideAESKey$app_debug() {
        return null;
    }
}