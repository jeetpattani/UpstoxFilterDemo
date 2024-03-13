package com.reply.di.component;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\f\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u0003H&J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\bH&\u00f8\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001\u00a8\u0006\t\u00c0\u0006\u0001"}, d2 = {"Lcom/reply/di/component/FragmentComponent;", "", "baseFragment", "Lcom/reply/ui/base/BaseFragment;", "inject", "", "loginFragment", "Lcom/reply/ui/auth/fragment/LoginFragment;", "Lcom/reply/ui/auth/fragment/SignupFragment;", "app_debug"})
@dagger.Subcomponent(modules = {com.reply.di.module.FragmentModule.class})
@com.reply.di.PerFragment()
public abstract interface FragmentComponent {
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.reply.ui.base.BaseFragment<?> baseFragment();
    
    public abstract void inject(@org.jetbrains.annotations.NotNull()
    com.reply.ui.auth.fragment.LoginFragment loginFragment);
    
    public abstract void inject(@org.jetbrains.annotations.NotNull()
    com.reply.ui.auth.fragment.SignupFragment loginFragment);
}