package com.reply.ui.manager;

import java.lang.System;

@androidx.annotation.UiThread()
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0004H&J\"\u0010\u0005\u001a\u00020\u00002\u0018\u0010\u0006\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b0\u0007H&J\b\u0010\u000b\u001a\u00020\u0000H&J\b\u0010\f\u001a\u00020\u0000H&J\u0016\u0010\r\u001a\u00020\u00002\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fH&J\u0010\u0010\r\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u0012H&J$\u0010\u0013\u001a\u00020\u0000\"\f\b\u0000\u0010\u0014*\u0006\u0012\u0002\b\u00030\u00152\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u0002H\u00140\u0017H&J\u0010\u0010\u0018\u001a\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u001aH&J\b\u0010\u001b\u001a\u00020\u001cH&\u00f8\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001\u00a8\u0006\u001d\u00c0\u0006\u0001"}, d2 = {"Lcom/reply/ui/manager/ActivityBuilder;", "", "addBundle", "bundle", "Landroid/os/Bundle;", "addSharedElements", "pairs", "", "Landroidx/core/util/Pair;", "Landroid/view/View;", "", "byFinishingAll", "byFinishingCurrent", "forResult", "startForResult", "Landroidx/activity/result/ActivityResultLauncher;", "Landroid/content/Intent;", "requestCode", "", "setPage", "T", "Lcom/reply/ui/base/BaseFragment;", "page", "Ljava/lang/Class;", "shouldAnimate", "isAnimate", "", "start", "", "app_debug"})
public abstract interface ActivityBuilder {
    
    public abstract void start();
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.reply.ui.manager.ActivityBuilder addBundle(@org.jetbrains.annotations.NotNull()
    android.os.Bundle bundle);
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.reply.ui.manager.ActivityBuilder addSharedElements(@org.jetbrains.annotations.NotNull()
    java.util.List<? extends androidx.core.util.Pair<android.view.View, java.lang.String>> pairs);
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.reply.ui.manager.ActivityBuilder byFinishingCurrent();
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.reply.ui.manager.ActivityBuilder byFinishingAll();
    
    @org.jetbrains.annotations.NotNull()
    public abstract <T extends com.reply.ui.base.BaseFragment<?>>com.reply.ui.manager.ActivityBuilder setPage(@org.jetbrains.annotations.NotNull()
    java.lang.Class<T> page);
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.reply.ui.manager.ActivityBuilder forResult(int requestCode);
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.reply.ui.manager.ActivityBuilder forResult(@org.jetbrains.annotations.NotNull()
    androidx.activity.result.ActivityResultLauncher<android.content.Intent> startForResult);
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.reply.ui.manager.ActivityBuilder shouldAnimate(boolean isAnimate);
}