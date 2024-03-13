package com.reply.ui.manager;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0003\b\u0007\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001bB\u0019\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0012\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0016JH\u0010\u000b\u001a\u00020\b2\n\u0010\f\u001a\u0006\u0012\u0002\b\u00030\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\n2\u001a\u0010\u0012\u001a\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\n0\u0014\u0018\u00010\u0013H\u0016J5\u0010\u0016\u001a\u00020\b2\n\u0010\u0017\u001a\u0006\u0012\u0002\b\u00030\r2\u001a\u0010\u0018\u001a\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\r0\u0019\"\u0006\u0012\u0002\b\u00030\rH\u0016\u00a2\u0006\u0002\u0010\u001aR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001c"}, d2 = {"Lcom/reply/ui/manager/FragmentManager;", "Lcom/reply/ui/manager/FragmentHandler;", "fragmentManager", "Landroidx/fragment/app/FragmentManager;", "placeHolder", "", "(Landroidx/fragment/app/FragmentManager;I)V", "clearFragmentHistory", "", "tag", "", "openFragment", "baseFragment", "Lcom/reply/ui/base/BaseFragment;", "option", "Lcom/reply/ui/manager/FragmentHandler$Option;", "isToBackStack", "", "sharedElements", "", "Landroid/util/Pair;", "Landroid/view/View;", "showFragment", "fragmentToShow", "fragmentToHide", "", "(Lcom/reply/ui/base/BaseFragment;[Lcom/reply/ui/base/BaseFragment;)V", "Companion", "app_debug"})
@com.reply.di.PerActivity()
public final class FragmentManager implements com.reply.ui.manager.FragmentHandler {
    private final androidx.fragment.app.FragmentManager fragmentManager = null;
    private final int placeHolder = 0;
    @org.jetbrains.annotations.NotNull()
    public static final com.reply.ui.manager.FragmentManager.Companion Companion = null;
    private static boolean sDisableFragmentAnimations = false;
    
    @javax.inject.Inject()
    public FragmentManager(@org.jetbrains.annotations.NotNull()
    androidx.fragment.app.FragmentManager fragmentManager, @javax.inject.Named(value = "placeholder")
    int placeHolder) {
        super();
    }
    
    @java.lang.Override()
    public void openFragment(@org.jetbrains.annotations.NotNull()
    com.reply.ui.base.BaseFragment<?> baseFragment, @org.jetbrains.annotations.NotNull()
    com.reply.ui.manager.FragmentHandler.Option option, boolean isToBackStack, @org.jetbrains.annotations.NotNull()
    java.lang.String tag, @org.jetbrains.annotations.Nullable()
    java.util.List<? extends android.util.Pair<android.view.View, java.lang.String>> sharedElements) {
    }
    
    @java.lang.Override()
    public void showFragment(@org.jetbrains.annotations.NotNull()
    com.reply.ui.base.BaseFragment<?> fragmentToShow, @org.jetbrains.annotations.NotNull()
    com.reply.ui.base.BaseFragment<?>... fragmentToHide) {
    }
    
    @java.lang.Override()
    public void clearFragmentHistory(@org.jetbrains.annotations.Nullable()
    java.lang.String tag) {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b\u00a8\u0006\t"}, d2 = {"Lcom/reply/ui/manager/FragmentManager$Companion;", "", "()V", "sDisableFragmentAnimations", "", "getSDisableFragmentAnimations", "()Z", "setSDisableFragmentAnimations", "(Z)V", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        public final boolean getSDisableFragmentAnimations() {
            return false;
        }
        
        public final void setSDisableFragmentAnimations(boolean p0) {
        }
    }
}