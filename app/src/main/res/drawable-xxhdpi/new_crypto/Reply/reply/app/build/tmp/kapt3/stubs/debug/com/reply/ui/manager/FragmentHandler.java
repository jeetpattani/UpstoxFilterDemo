package com.reply.ui.manager;

import java.lang.System;

@androidx.annotation.UiThread()
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001:\u0001\u0016J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&JH\u0010\u0006\u001a\u00020\u00032\n\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0004\u001a\u00020\u00052\u001a\u0010\r\u001a\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00050\u000f\u0018\u00010\u000eH&J5\u0010\u0011\u001a\u00020\u00032\n\u0010\u0012\u001a\u0006\u0012\u0002\b\u00030\b2\u001a\u0010\u0013\u001a\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\b0\u0014\"\u0006\u0012\u0002\b\u00030\bH&\u00a2\u0006\u0002\u0010\u0015\u00f8\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001\u00a8\u0006\u0017\u00c0\u0006\u0001"}, d2 = {"Lcom/reply/ui/manager/FragmentHandler;", "", "clearFragmentHistory", "", "tag", "", "openFragment", "baseFragment", "Lcom/reply/ui/base/BaseFragment;", "option", "Lcom/reply/ui/manager/FragmentHandler$Option;", "isToBackStack", "", "sharedElements", "", "Landroid/util/Pair;", "Landroid/view/View;", "showFragment", "fragmentToShow", "fragmentToHide", "", "(Lcom/reply/ui/base/BaseFragment;[Lcom/reply/ui/base/BaseFragment;)V", "Option", "app_debug"})
public abstract interface FragmentHandler {
    
    /**
     * @param baseFragment   Fragment to open
     * @param option
     * @param isToBackStack
     * @param tag
     * @param sharedElements
     */
    public abstract void openFragment(@org.jetbrains.annotations.NotNull()
    com.reply.ui.base.BaseFragment<?> baseFragment, @org.jetbrains.annotations.NotNull()
    com.reply.ui.manager.FragmentHandler.Option option, boolean isToBackStack, @org.jetbrains.annotations.NotNull()
    java.lang.String tag, @org.jetbrains.annotations.Nullable()
    java.util.List<? extends android.util.Pair<android.view.View, java.lang.String>> sharedElements);
    
    /**
     * @param fragmentToShow Fragment to show
     * @param fragmentToHide array of fragments to hide
     */
    public abstract void showFragment(@org.jetbrains.annotations.NotNull()
    com.reply.ui.base.BaseFragment<?> fragmentToShow, @org.jetbrains.annotations.NotNull()
    com.reply.ui.base.BaseFragment<?>... fragmentToHide);
    
    public abstract void clearFragmentHistory(@org.jetbrains.annotations.Nullable()
    java.lang.String tag);
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/reply/ui/manager/FragmentHandler$Option;", "", "(Ljava/lang/String;I)V", "ADD", "REPLACE", "SHOW", "HIDE", "app_debug"})
    public static enum Option {
        /*public static final*/ ADD /* = new ADD() */,
        /*public static final*/ REPLACE /* = new REPLACE() */,
        /*public static final*/ SHOW /* = new SHOW() */,
        /*public static final*/ HIDE /* = new HIDE() */;
        
        Option() {
        }
    }
}