package com.reply.ui.auth.fragment;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\u0010\u001a\u00020\u0011H\u0014J\"\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0014J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\u0006\u0010\u001b\u001a\u00020\u001aH\u0002J\"\u0010\u001c\u001a\u0004\u0018\u00010\u001a2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020 H\u0002J\u0010\u0010\"\u001a\u00020\u00112\u0006\u0010#\u001a\u00020$H\u0014J\b\u0010%\u001a\u00020\u0011H\u0002J\b\u0010&\u001a\u00020\u0018H\u0016J\u0012\u0010\'\u001a\u00020\u00112\b\u0010(\u001a\u0004\u0018\u00010)H\u0016R\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001b\u0010\n\u001a\u00020\u000b8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\r\u00a8\u0006*"}, d2 = {"Lcom/reply/ui/auth/fragment/LoginFragment;", "Lcom/reply/ui/base/BaseFragment;", "Lcom/reply/databinding/AuthFragmentLoginBinding;", "()V", "validator", "Lcom/reply/utils/Validator;", "getValidator", "()Lcom/reply/utils/Validator;", "setValidator", "(Lcom/reply/utils/Validator;)V", "viewModel", "Lcom/reply/ui/auth/viewmodel/LoginViewModel;", "getViewModel", "()Lcom/reply/ui/auth/viewmodel/LoginViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "bindData", "", "createViewBinding", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "attachToRoot", "", "flipBitmap", "Landroid/graphics/Bitmap;", "src", "getBitmapFromView", "view", "Landroid/view/View;", "width", "", "height", "inject", "fragmentComponent", "Lcom/reply/di/component/FragmentComponent;", "observeLiveData", "onBackActionPerform", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "app_debug"})
public final class LoginFragment extends com.reply.ui.base.BaseFragment<com.reply.databinding.AuthFragmentLoginBinding> {
    @javax.inject.Inject()
    public com.reply.utils.Validator validator;
    private final kotlin.Lazy viewModel$delegate = null;
    
    public LoginFragment() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.reply.utils.Validator getValidator() {
        return null;
    }
    
    public final void setValidator(@org.jetbrains.annotations.NotNull()
    com.reply.utils.Validator p0) {
    }
    
    private final com.reply.ui.auth.viewmodel.LoginViewModel getViewModel() {
        return null;
    }
    
    @java.lang.Override()
    protected void inject(@org.jetbrains.annotations.NotNull()
    com.reply.di.component.FragmentComponent fragmentComponent) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    protected com.reply.databinding.AuthFragmentLoginBinding createViewBinding(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, boolean attachToRoot) {
        return null;
    }
    
    @java.lang.Override()
    public void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    protected void bindData() {
    }
    
    private final android.graphics.Bitmap getBitmapFromView(android.view.View view, int width, int height) {
        return null;
    }
    
    private final android.graphics.Bitmap flipBitmap(android.graphics.Bitmap src) {
        return null;
    }
    
    @java.lang.Override()
    public boolean onBackActionPerform() {
        return false;
    }
    
    private final void observeLiveData() {
    }
}