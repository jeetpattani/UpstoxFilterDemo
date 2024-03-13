package com.reply.ui.manager;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&J*\u0010\u0005\u001a\b\u0012\u0004\u0012\u0002H\u00070\u0006\"\f\b\u0000\u0010\u0007*\u0006\u0012\u0002\b\u00030\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u0002H\u00070\nH&J\u0018\u0010\u000b\u001a\u00020\f2\u000e\u0010\r\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u000e0\nH&J4\u0010\u000b\u001a\u00020\f\"\f\b\u0000\u0010\u0007*\u0006\u0012\u0002\b\u00030\b2\u000e\u0010\r\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u000e0\n2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u0002H\u00070\nH&\u00f8\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001\u00a8\u0006\u0010\u00c0\u0006\u0001"}, d2 = {"Lcom/reply/ui/manager/Navigator;", "", "finish", "", "goBack", "load", "Lcom/reply/ui/manager/FragmentActionPerformer;", "T", "Lcom/reply/ui/base/BaseFragment;", "tClass", "Ljava/lang/Class;", "loadActivity", "Lcom/reply/ui/manager/ActivityBuilder;", "aClass", "Lcom/reply/ui/base/BaseActivity;", "pageTClass", "app_debug"})
public abstract interface Navigator {
    
    @org.jetbrains.annotations.NotNull()
    public abstract <T extends com.reply.ui.base.BaseFragment<?>>com.reply.ui.manager.FragmentActionPerformer<T> load(@org.jetbrains.annotations.NotNull()
    java.lang.Class<T> tClass);
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.reply.ui.manager.ActivityBuilder loadActivity(@org.jetbrains.annotations.NotNull()
    java.lang.Class<? extends com.reply.ui.base.BaseActivity> aClass);
    
    @org.jetbrains.annotations.NotNull()
    public abstract <T extends com.reply.ui.base.BaseFragment<?>>com.reply.ui.manager.ActivityBuilder loadActivity(@org.jetbrains.annotations.NotNull()
    java.lang.Class<? extends com.reply.ui.base.BaseActivity> aClass, @org.jetbrains.annotations.NotNull()
    java.lang.Class<T> pageTClass);
    
    public abstract void goBack();
    
    public abstract void finish();
}