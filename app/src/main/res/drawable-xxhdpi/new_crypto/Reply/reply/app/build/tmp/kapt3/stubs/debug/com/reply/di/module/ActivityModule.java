package com.reply.di.module;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0015\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0001\u00a2\u0006\u0002\b\u0007J\u0015\u0010\u0005\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0001\u00a2\u0006\u0002\b\u000bJ\u0015\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\nH\u0001\u00a2\u0006\u0002\b\u000fJ\u0015\u0010\u0010\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\nH\u0001\u00a2\u0006\u0002\b\u0012\u00a8\u0006\u0013"}, d2 = {"Lcom/reply/di/module/ActivityModule;", "", "()V", "fragmentHandler", "Lcom/reply/ui/manager/FragmentHandler;", "fragmentManager", "Lcom/reply/ui/manager/FragmentManager;", "fragmentHandler$app_debug", "Landroidx/fragment/app/FragmentManager;", "baseActivity", "Lcom/reply/ui/base/BaseActivity;", "fragmentManager$app_debug", "navigator", "Lcom/reply/ui/manager/Navigator;", "activity", "navigator$app_debug", "placeHolder", "", "placeHolder$app_debug", "app_debug"})
@dagger.Module()
public final class ActivityModule {
    
    public ActivityModule() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @com.reply.di.PerActivity()
    @dagger.Provides()
    public final com.reply.ui.manager.Navigator navigator$app_debug(@org.jetbrains.annotations.NotNull()
    com.reply.ui.base.BaseActivity activity) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @com.reply.di.PerActivity()
    @dagger.Provides()
    public final androidx.fragment.app.FragmentManager fragmentManager$app_debug(@org.jetbrains.annotations.NotNull()
    com.reply.ui.base.BaseActivity baseActivity) {
        return null;
    }
    
    @javax.inject.Named(value = "placeholder")
    @com.reply.di.PerActivity()
    @dagger.Provides()
    public final int placeHolder$app_debug(@org.jetbrains.annotations.NotNull()
    com.reply.ui.base.BaseActivity baseActivity) {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    @com.reply.di.PerActivity()
    @dagger.Provides()
    public final com.reply.ui.manager.FragmentHandler fragmentHandler$app_debug(@org.jetbrains.annotations.NotNull()
    com.reply.ui.manager.FragmentManager fragmentManager) {
        return null;
    }
}