package com.reply.ui.manager;

import java.lang.System;

@androidx.annotation.UiThread()
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bg\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H&J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH&J&\u0010\t\u001a\u0006\u0012\u0002\b\u00030\u00002\u0018\u0010\n\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\b0\f0\u000bH&J\u0016\u0010\u000e\u001a\u0006\u0012\u0002\b\u00030\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\bH&J\u001a\u0010\u000f\u001a\u0006\u0012\u0002\b\u00030\u00002\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u0011H&J\u0010\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H&J\u0018\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH&J\u0014\u0010\u0013\u001a\u0006\u0012\u0002\b\u00030\u00002\u0006\u0010\u0014\u001a\u00020\u0015H&\u00f8\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001\u00a8\u0006\u0016\u00c0\u0006\u0001"}, d2 = {"Lcom/reply/ui/manager/FragmentActionPerformer;", "T", "", "add", "", "toBackStack", "", "tag", "", "addSharedElements", "sharedElements", "", "Landroid/util/Pair;", "Landroid/view/View;", "clearHistory", "hasData", "passable", "Lcom/reply/ui/manager/Passable;", "replace", "setBundle", "bundle", "Landroid/os/Bundle;", "app_debug"})
public abstract interface FragmentActionPerformer<T extends java.lang.Object> {
    
    public abstract void add(boolean toBackStack);
    
    public abstract void add(boolean toBackStack, @org.jetbrains.annotations.NotNull()
    java.lang.String tag);
    
    public abstract void replace(boolean toBackStack);
    
    public abstract void replace(boolean toBackStack, @org.jetbrains.annotations.NotNull()
    java.lang.String tag);
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.reply.ui.manager.FragmentActionPerformer<?> setBundle(@org.jetbrains.annotations.NotNull()
    android.os.Bundle bundle);
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.reply.ui.manager.FragmentActionPerformer<?> addSharedElements(@org.jetbrains.annotations.NotNull()
    java.util.List<? extends android.util.Pair<android.view.View, java.lang.String>> sharedElements);
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.reply.ui.manager.FragmentActionPerformer<?> clearHistory(@org.jetbrains.annotations.Nullable()
    java.lang.String tag);
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.reply.ui.manager.FragmentActionPerformer<?> hasData(@org.jetbrains.annotations.NotNull()
    com.reply.ui.manager.Passable<? super T> passable);
}