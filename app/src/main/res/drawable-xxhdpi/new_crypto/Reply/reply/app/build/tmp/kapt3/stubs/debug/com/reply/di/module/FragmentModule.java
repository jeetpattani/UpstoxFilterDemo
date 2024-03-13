package com.reply.di.module;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\n\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u0003\u00a2\u0006\u0002\u0010\u0004J\u0011\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0003H\u0001\u00a2\u0006\u0002\b\u0006R\u0012\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0007"}, d2 = {"Lcom/reply/di/module/FragmentModule;", "", "baseFragment", "Lcom/reply/ui/base/BaseFragment;", "(Lcom/reply/ui/base/BaseFragment;)V", "provideBaseFragment", "provideBaseFragment$app_debug", "app_debug"})
@dagger.Module()
public final class FragmentModule {
    private final com.reply.ui.base.BaseFragment<?> baseFragment = null;
    
    public FragmentModule(@org.jetbrains.annotations.NotNull()
    com.reply.ui.base.BaseFragment<?> baseFragment) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @com.reply.di.PerFragment()
    @dagger.Provides()
    public final com.reply.ui.base.BaseFragment<?> provideBaseFragment$app_debug() {
        return null;
    }
}