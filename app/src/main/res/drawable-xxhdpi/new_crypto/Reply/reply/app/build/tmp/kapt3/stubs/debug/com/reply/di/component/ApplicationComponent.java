package com.reply.di.component;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001:\u0001\u0018J\b\u0010\u0002\u001a\u00020\u0003H&J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J\b\u0010\b\u001a\u00020\tH&J\b\u0010\n\u001a\u00020\u000bH\'J\b\u0010\f\u001a\u00020\rH&J\b\u0010\u000e\u001a\u00020\u000fH&J\b\u0010\u0010\u001a\u00020\u0011H&J\b\u0010\u0012\u001a\u00020\u0013H&J\b\u0010\u0014\u001a\u00020\u0015H&J\b\u0010\u0016\u001a\u00020\u0017H&\u00f8\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001\u00a8\u0006\u0019\u00c0\u0006\u0001"}, d2 = {"Lcom/reply/di/component/ApplicationComponent;", "", "context", "Landroid/content/Context;", "inject", "", "appShell", "Lcom/reply/di/App;", "provideAppPreference", "Lcom/reply/core/AppPreferences;", "provideCacheDir", "Ljava/io/File;", "provideCurrentLocale", "Ljava/util/Locale;", "provideResources", "Landroid/content/res/Resources;", "provideSession", "Lcom/reply/core/Session;", "provideUserRepository", "Lcom/reply/data/repository/UserRepository;", "provideValidator", "Lcom/reply/utils/Validator;", "provideViewModelFactory", "Landroidx/lifecycle/ViewModelProvider$Factory;", "ApplicationComponentBuilder", "app_debug"})
@dagger.Component(modules = {com.reply.di.module.ApplicationModule.class, com.reply.di.module.ViewModelModule.class, com.reply.di.module.NetModule.class, com.reply.di.module.ServiceModule.class})
@javax.inject.Singleton()
public abstract interface ApplicationComponent {
    
    @org.jetbrains.annotations.NotNull()
    public abstract android.content.Context context();
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Named(value = "cache")
    public abstract java.io.File provideCacheDir();
    
    @org.jetbrains.annotations.NotNull()
    public abstract android.content.res.Resources provideResources();
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.Locale provideCurrentLocale();
    
    @org.jetbrains.annotations.NotNull()
    public abstract androidx.lifecycle.ViewModelProvider.Factory provideViewModelFactory();
    
    public abstract void inject(@org.jetbrains.annotations.NotNull()
    com.reply.di.App appShell);
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.reply.data.repository.UserRepository provideUserRepository();
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.reply.utils.Validator provideValidator();
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.reply.core.Session provideSession();
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.reply.core.AppPreferences provideAppPreference();
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00002\b\b\u0001\u0010\u0002\u001a\u00020\u0003H\'J\u0010\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0005H\'J\b\u0010\u0006\u001a\u00020\u0007H&\u00f8\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001\u00a8\u0006\b\u00c0\u0006\u0001"}, d2 = {"Lcom/reply/di/component/ApplicationComponent$ApplicationComponentBuilder;", "", "apiKey", "", "application", "Landroid/app/Application;", "build", "Lcom/reply/di/component/ApplicationComponent;", "app_debug"})
    @dagger.Component.Builder()
    public static abstract interface ApplicationComponentBuilder {
        
        @org.jetbrains.annotations.NotNull()
        @dagger.BindsInstance()
        public abstract com.reply.di.component.ApplicationComponent.ApplicationComponentBuilder apiKey(@org.jetbrains.annotations.NotNull()
        @javax.inject.Named(value = "api-key")
        java.lang.String apiKey);
        
        @org.jetbrains.annotations.NotNull()
        @dagger.BindsInstance()
        public abstract com.reply.di.component.ApplicationComponent.ApplicationComponentBuilder application(@org.jetbrains.annotations.NotNull()
        android.app.Application application);
        
        @org.jetbrains.annotations.NotNull()
        public abstract com.reply.di.component.ApplicationComponent build();
    }
}