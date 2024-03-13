package com.reply.di.component;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001:\u0001\u0013J\b\u0010\u0002\u001a\u00020\u0003H&J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\tH&J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u000bH&J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\fH&J\b\u0010\r\u001a\u00020\u000eH&J\u0011\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u00a6\u0002\u00f8\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001\u00a8\u0006\u0014\u00c0\u0006\u0001"}, d2 = {"Lcom/reply/di/component/ActivityComponent;", "", "activity", "Lcom/reply/ui/base/BaseActivity;", "inject", "", "authActivity", "Lcom/reply/ui/auth/AuthActivity;", "isolatedFullActivity", "Lcom/reply/ui/auth/IsolatedFullActivity;", "mainActivity", "Lcom/reply/ui/home/HomeActivity;", "Lcom/reply/ui/splash/SplashActivity;", "navigator", "Lcom/reply/ui/manager/Navigator;", "plus", "Lcom/reply/di/component/FragmentComponent;", "fragmentModule", "Lcom/reply/di/module/FragmentModule;", "Builder", "app_debug"})
@dagger.Component(dependencies = {com.reply.di.component.ApplicationComponent.class}, modules = {com.reply.di.module.ActivityModule.class})
@com.reply.di.PerActivity()
public abstract interface ActivityComponent {
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.reply.ui.base.BaseActivity activity();
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.reply.ui.manager.Navigator navigator();
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.reply.di.component.FragmentComponent plus(@org.jetbrains.annotations.NotNull()
    com.reply.di.module.FragmentModule fragmentModule);
    
    public abstract void inject(@org.jetbrains.annotations.NotNull()
    com.reply.ui.home.HomeActivity mainActivity);
    
    public abstract void inject(@org.jetbrains.annotations.NotNull()
    com.reply.ui.splash.SplashActivity mainActivity);
    
    public abstract void inject(@org.jetbrains.annotations.NotNull()
    com.reply.ui.auth.AuthActivity authActivity);
    
    public abstract void inject(@org.jetbrains.annotations.NotNull()
    com.reply.ui.auth.IsolatedFullActivity isolatedFullActivity);
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0004H\'J\u0010\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0007H&J\b\u0010\b\u001a\u00020\tH&\u00f8\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001\u00a8\u0006\n\u00c0\u0006\u0001"}, d2 = {"Lcom/reply/di/component/ActivityComponent$Builder;", "", "bindActivity", "baseActivity", "Lcom/reply/ui/base/BaseActivity;", "bindApplicationComponent", "applicationComponent", "Lcom/reply/di/component/ApplicationComponent;", "build", "Lcom/reply/di/component/ActivityComponent;", "app_debug"})
    @dagger.Component.Builder()
    public static abstract interface Builder {
        
        @org.jetbrains.annotations.NotNull()
        public abstract com.reply.di.component.ActivityComponent.Builder bindApplicationComponent(@org.jetbrains.annotations.NotNull()
        com.reply.di.component.ApplicationComponent applicationComponent);
        
        @org.jetbrains.annotations.NotNull()
        @dagger.BindsInstance()
        public abstract com.reply.di.component.ActivityComponent.Builder bindActivity(@org.jetbrains.annotations.NotNull()
        com.reply.ui.base.BaseActivity baseActivity);
        
        @org.jetbrains.annotations.NotNull()
        public abstract com.reply.di.component.ActivityComponent build();
    }
}