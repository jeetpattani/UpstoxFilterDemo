package com.reply.ui.base;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0090\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b&\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u00032\b\u0012\u0004\u0012\u00020\u00050\u0004B\u0005\u00a2\u0006\u0002\u0010\u0006J\b\u0010\'\u001a\u00020(H$J\'\u0010)\u001a\u00028\u00002\u0006\u0010*\u001a\u00020+2\b\u0010,\u001a\u0004\u0018\u00010-2\u0006\u0010.\u001a\u00020/H$\u00a2\u0006\u0002\u00100J!\u0010\u0013\u001a\u0002H1\"\u0004\b\u0001\u001012\f\u00102\u001a\b\u0012\u0004\u0012\u0002H103H\u0004\u00a2\u0006\u0002\u00104J)\u00105\u001a\u0004\u0018\u0001H\u0001\"\f\b\u0001\u0010\u0001*\u0006\u0012\u0002\b\u00030\u00002\f\u00106\u001a\b\u0012\u0004\u0012\u0002H\u000103\u00a2\u0006\u0002\u00107J\u0006\u00108\u001a\u00020(J\u0010\u00109\u001a\u00020(2\u0006\u0010:\u001a\u00020\u0005H$J\u0006\u0010;\u001a\u00020(J\u0010\u0010<\u001a\u00020(2\u0006\u0010=\u001a\u00020>H\u0016J\b\u0010?\u001a\u00020/H\u0016J&\u0010@\u001a\u0004\u0018\u00010A2\u0006\u0010*\u001a\u00020+2\b\u0010,\u001a\u0004\u0018\u00010-2\b\u0010B\u001a\u0004\u0018\u00010CH\u0016J\b\u0010D\u001a\u00020(H\u0016J\u000e\u0010E\u001a\u00020(2\u0006\u0010F\u001a\u00020GJ\b\u0010H\u001a\u00020(H\u0016J\u0010\u0010I\u001a\u00020(2\u0006\u0010J\u001a\u00020AH\u0016J\u001a\u0010K\u001a\u00020(2\u0006\u0010J\u001a\u00020A2\b\u0010B\u001a\u0004\u0018\u00010CH\u0016J\u0006\u0010L\u001a\u00020(J\u000e\u0010M\u001a\u00020(2\u0006\u0010N\u001a\u00020OJ\u0010\u0010M\u001a\u00020(2\b\b\u0001\u0010P\u001a\u00020QJ\u000e\u0010M\u001a\u00020(2\u0006\u0010R\u001a\u00020SJ\u0010\u0010T\u001a\u00020(2\u0006\u0010R\u001a\u00020SH\u0002J\u0018\u0010T\u001a\u00020(2\u0006\u0010R\u001a\u00020S2\u0006\u0010U\u001a\u00020AH\u0002R\u0012\u0010\u0007\u001a\u0004\u0018\u00018\u0000X\u0082\u000e\u00a2\u0006\u0004\n\u0002\u0010\bR\u001e\u0010\t\u001a\u00020\n8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\u00028\u00008DX\u0084\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00058VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u001e\u0010\u0015\u001a\u00020\u00168\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001b\u001a\u00020\u001cX\u0084.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u001e\u0010!\u001a\u00020\"8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&\u00a8\u0006V"}, d2 = {"Lcom/reply/ui/base/BaseFragment;", "T", "Landroidx/viewbinding/ViewBinding;", "Landroidx/fragment/app/Fragment;", "Lcom/reply/di/HasComponent;", "Lcom/reply/di/component/FragmentComponent;", "()V", "_binding", "Landroidx/viewbinding/ViewBinding;", "appPreferences", "Lcom/reply/core/AppPreferences;", "getAppPreferences", "()Lcom/reply/core/AppPreferences;", "setAppPreferences", "(Lcom/reply/core/AppPreferences;)V", "binding", "getBinding", "()Landroidx/viewbinding/ViewBinding;", "component", "getComponent", "()Lcom/reply/di/component/FragmentComponent;", "navigator", "Lcom/reply/ui/manager/Navigator;", "getNavigator", "()Lcom/reply/ui/manager/Navigator;", "setNavigator", "(Lcom/reply/ui/manager/Navigator;)V", "toolbar", "Lcom/reply/ui/base/HasToolbar;", "getToolbar", "()Lcom/reply/ui/base/HasToolbar;", "setToolbar", "(Lcom/reply/ui/base/HasToolbar;)V", "viewModelFactory", "Landroidx/lifecycle/ViewModelProvider$Factory;", "getViewModelFactory", "()Landroidx/lifecycle/ViewModelProvider$Factory;", "setViewModelFactory", "(Landroidx/lifecycle/ViewModelProvider$Factory;)V", "bindData", "", "createViewBinding", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "attachToRoot", "", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Landroidx/viewbinding/ViewBinding;", "C", "componentType", "Ljava/lang/Class;", "(Ljava/lang/Class;)Ljava/lang/Object;", "getParentFragment", "targetFragment", "(Ljava/lang/Class;)Lcom/reply/ui/base/BaseFragment;", "hideKeyBoard", "inject", "fragmentComponent", "logout", "onAttach", "context", "Landroid/content/Context;", "onBackActionPerform", "onCreateView", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "onDestroyView", "onError", "throwable", "", "onShow", "onViewClick", "view", "onViewCreated", "showKeyBoard", "showMessage", "applicationException", "Lcom/reply/exception/ApplicationException;", "stringId", "", "message", "", "showSnackBar", "viewSet", "app_debug"})
public abstract class BaseFragment<T extends androidx.viewbinding.ViewBinding> extends androidx.fragment.app.Fragment implements com.reply.di.HasComponent<com.reply.di.component.FragmentComponent> {
    protected com.reply.ui.base.HasToolbar toolbar;
    @javax.inject.Inject()
    public com.reply.ui.manager.Navigator navigator;
    @javax.inject.Inject()
    public androidx.lifecycle.ViewModelProvider.Factory viewModelFactory;
    @javax.inject.Inject()
    public com.reply.core.AppPreferences appPreferences;
    private T _binding;
    
    public BaseFragment() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    protected final com.reply.ui.base.HasToolbar getToolbar() {
        return null;
    }
    
    protected final void setToolbar(@org.jetbrains.annotations.NotNull()
    com.reply.ui.base.HasToolbar p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.reply.ui.manager.Navigator getNavigator() {
        return null;
    }
    
    public final void setNavigator(@org.jetbrains.annotations.NotNull()
    com.reply.ui.manager.Navigator p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.ViewModelProvider.Factory getViewModelFactory() {
        return null;
    }
    
    public final void setViewModelFactory(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.ViewModelProvider.Factory p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.reply.core.AppPreferences getAppPreferences() {
        return null;
    }
    
    public final void setAppPreferences(@org.jetbrains.annotations.NotNull()
    com.reply.core.AppPreferences p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.reply.di.component.FragmentComponent getComponent() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    protected final T getBinding() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    protected final <C extends java.lang.Object>C getComponent(@org.jetbrains.annotations.NotNull()
    java.lang.Class<C> componentType) {
        return null;
    }
    
    @java.lang.Override()
    public void onAttach(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
    }
    
    public final void hideKeyBoard() {
    }
    
    public final void showKeyBoard() {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final <T extends com.reply.ui.base.BaseFragment<?>>T getParentFragment(@org.jetbrains.annotations.NotNull()
    java.lang.Class<T> targetFragment) {
        return null;
    }
    
    public void onShow() {
    }
    
    public final void showMessage(@org.jetbrains.annotations.NotNull()
    java.lang.String message) {
    }
    
    public final void showMessage(@androidx.annotation.StringRes()
    int stringId) {
    }
    
    public final void showMessage(@org.jetbrains.annotations.NotNull()
    com.reply.exception.ApplicationException applicationException) {
    }
    
    private final void showSnackBar(java.lang.String message) {
    }
    
    private final void showSnackBar(java.lang.String message, android.view.View viewSet) {
    }
    
    public boolean onBackActionPerform() {
        return false;
    }
    
    public void onViewClick(@org.jetbrains.annotations.NotNull()
    android.view.View view) {
    }
    
    public final void onError(@org.jetbrains.annotations.NotNull()
    java.lang.Throwable throwable) {
    }
    
    @java.lang.Override()
    public void onDestroyView() {
    }
    
    public final void logout() {
    }
    
    protected abstract void inject(@org.jetbrains.annotations.NotNull()
    com.reply.di.component.FragmentComponent fragmentComponent);
    
    /**
     * This method is used for binding view with your binding
     */
    @org.jetbrains.annotations.NotNull()
    protected abstract T createViewBinding(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, boolean attachToRoot);
    
    protected abstract void bindData();
}