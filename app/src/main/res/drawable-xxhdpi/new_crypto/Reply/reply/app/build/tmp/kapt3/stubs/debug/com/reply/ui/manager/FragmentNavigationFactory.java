package com.reply.ui.manager;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0011B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J)\u0010\u000b\u001a\b\u0012\u0004\u0012\u0002H\r0\f\"\f\b\u0000\u0010\r*\u0006\u0012\u0002\b\u00030\u00062\b\u0010\u0005\u001a\u0004\u0018\u0001H\r\u00a2\u0006\u0002\u0010\u000eJ(\u0010\u000b\u001a\b\u0012\u0004\u0012\u0002H\r0\f\"\f\b\u0000\u0010\r*\u0006\u0012\u0002\b\u00030\u00062\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u0002H\r0\u0010R\u0014\u0010\u0005\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0012"}, d2 = {"Lcom/reply/ui/manager/FragmentNavigationFactory;", "", "fragmentHandler", "Lcom/reply/ui/manager/FragmentHandler;", "(Lcom/reply/ui/manager/FragmentHandler;)V", "fragment", "Lcom/reply/ui/base/BaseFragment;", "getFragmentHandler", "()Lcom/reply/ui/manager/FragmentHandler;", "tag", "", "make", "Lcom/reply/ui/manager/FragmentActionPerformer;", "T", "(Lcom/reply/ui/base/BaseFragment;)Lcom/reply/ui/manager/FragmentActionPerformer;", "aClass", "Ljava/lang/Class;", "Provider", "app_debug"})
@com.reply.di.PerActivity()
public final class FragmentNavigationFactory {
    @org.jetbrains.annotations.NotNull()
    private final com.reply.ui.manager.FragmentHandler fragmentHandler = null;
    private com.reply.ui.base.BaseFragment<?> fragment;
    private java.lang.String tag;
    
    @javax.inject.Inject()
    public FragmentNavigationFactory(@org.jetbrains.annotations.NotNull()
    com.reply.ui.manager.FragmentHandler fragmentHandler) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.reply.ui.manager.FragmentHandler getFragmentHandler() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final <T extends com.reply.ui.base.BaseFragment<?>>com.reply.ui.manager.FragmentActionPerformer<T> make(@org.jetbrains.annotations.NotNull()
    java.lang.Class<T> aClass) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final <T extends com.reply.ui.base.BaseFragment<?>>com.reply.ui.manager.FragmentActionPerformer<T> make(@org.jetbrains.annotations.Nullable()
    T fragment) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u0000*\f\b\u0000\u0010\u0001*\u0006\u0012\u0002\b\u00030\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003B\u0015\u0012\u0006\u0010\u0004\u001a\u00028\u0000\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007J\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0016J\u0018\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\rH\u0016J&\u0010\u0017\u001a\u0006\u0012\u0002\b\u00030\u00032\u0018\u0010\t\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b0\nH\u0016J\u0016\u0010\u0018\u001a\u0006\u0012\u0002\b\u00030\u00032\b\u0010\u0016\u001a\u0004\u0018\u00010\rH\u0016J\u001a\u0010\u0019\u001a\u0006\u0012\u0002\b\u00030\u00032\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00028\u00000\u001bH\u0016J\u0010\u0010\u001c\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0016J\u0018\u0010\u001c\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\rH\u0016J\u0014\u0010\u001d\u001a\u0006\u0012\u0002\b\u00030\u00032\u0006\u0010\u001e\u001a\u00020\u001fH\u0016R\u0010\u0010\u0004\u001a\u00028\u0000X\u0082\u0004\u00a2\u0006\u0004\n\u0002\u0010\bR\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R.\u0010\t\u001a\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b\u0018\u00010\nX\u0080\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011\u00a8\u0006 "}, d2 = {"Lcom/reply/ui/manager/FragmentNavigationFactory$Provider;", "T", "Lcom/reply/ui/base/BaseFragment;", "Lcom/reply/ui/manager/FragmentActionPerformer;", "fragment", "navigationFactory", "Lcom/reply/ui/manager/FragmentNavigationFactory;", "(Lcom/reply/ui/manager/FragmentNavigationFactory;Lcom/reply/ui/base/BaseFragment;Lcom/reply/ui/manager/FragmentNavigationFactory;)V", "Lcom/reply/ui/base/BaseFragment;", "sharedElements", "", "Landroid/util/Pair;", "Landroid/view/View;", "", "getSharedElements$app_debug", "()Ljava/util/List;", "setSharedElements$app_debug", "(Ljava/util/List;)V", "add", "", "toBackStack", "", "tag", "addSharedElements", "clearHistory", "hasData", "passable", "Lcom/reply/ui/manager/Passable;", "replace", "setBundle", "bundle", "Landroid/os/Bundle;", "app_debug"})
    final class Provider<T extends com.reply.ui.base.BaseFragment<?>> implements com.reply.ui.manager.FragmentActionPerformer<T> {
        private final T fragment = null;
        private final com.reply.ui.manager.FragmentNavigationFactory navigationFactory = null;
        @org.jetbrains.annotations.Nullable()
        private java.util.List<? extends android.util.Pair<android.view.View, java.lang.String>> sharedElements;
        
        public Provider(@org.jetbrains.annotations.NotNull()
        T fragment, @org.jetbrains.annotations.NotNull()
        com.reply.ui.manager.FragmentNavigationFactory navigationFactory) {
            super();
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.util.List<android.util.Pair<android.view.View, java.lang.String>> getSharedElements$app_debug() {
            return null;
        }
        
        public final void setSharedElements$app_debug(@org.jetbrains.annotations.Nullable()
        java.util.List<? extends android.util.Pair<android.view.View, java.lang.String>> p0) {
        }
        
        @java.lang.Override()
        public void add(boolean toBackStack) {
        }
        
        @java.lang.Override()
        public void add(boolean toBackStack, @org.jetbrains.annotations.NotNull()
        java.lang.String tag) {
        }
        
        @java.lang.Override()
        public void replace(boolean toBackStack) {
        }
        
        @java.lang.Override()
        public void replace(boolean toBackStack, @org.jetbrains.annotations.NotNull()
        java.lang.String tag) {
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public com.reply.ui.manager.FragmentActionPerformer<?> setBundle(@org.jetbrains.annotations.NotNull()
        android.os.Bundle bundle) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public com.reply.ui.manager.FragmentActionPerformer<?> addSharedElements(@org.jetbrains.annotations.NotNull()
        java.util.List<? extends android.util.Pair<android.view.View, java.lang.String>> sharedElements) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public com.reply.ui.manager.FragmentActionPerformer<?> clearHistory(@org.jetbrains.annotations.Nullable()
        java.lang.String tag) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public com.reply.ui.manager.FragmentActionPerformer<?> hasData(@org.jetbrains.annotations.NotNull()
        com.reply.ui.manager.Passable<? super T> passable) {
            return null;
        }
    }
}