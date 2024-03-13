package com.reply.ui.manager;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00102\u00020\u0001:\u0002\u000f\u0010B\u000f\b\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0016\u0010\f\u001a\u00020\r2\u000e\u0010\u000e\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u0006R\u0018\u0010\u0005\u001a\f\u0012\u0006\b\u0001\u0012\u00020\u0007\u0018\u00010\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0011"}, d2 = {"Lcom/reply/ui/manager/ActivityStarter;", "", "context", "Lcom/reply/ui/base/BaseActivity;", "(Lcom/reply/ui/base/BaseActivity;)V", "activity", "Ljava/lang/Class;", "Landroid/app/Activity;", "intent", "Landroid/content/Intent;", "shouldAnimate", "", "make", "Lcom/reply/ui/manager/ActivityBuilder;", "activityClass", "Builder", "Companion", "app_debug"})
@com.reply.di.PerActivity()
public final class ActivityStarter {
    private final com.reply.ui.base.BaseActivity context = null;
    private android.content.Intent intent;
    private java.lang.Class<? extends android.app.Activity> activity;
    private boolean shouldAnimate = true;
    @org.jetbrains.annotations.NotNull()
    public static final com.reply.ui.manager.ActivityStarter.Companion Companion = null;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String ACTIVITY_FIRST_PAGE = "first_page";
    
    @javax.inject.Inject()
    public ActivityStarter(@org.jetbrains.annotations.NotNull()
    com.reply.ui.base.BaseActivity context) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.reply.ui.manager.ActivityBuilder make(@org.jetbrains.annotations.NotNull()
    java.lang.Class<? extends com.reply.ui.base.BaseActivity> activityClass) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0011\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\"\u0010\u0012\u001a\u00020\u00012\u0018\u0010\u0013\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00170\u00150\u0014H\u0016J\b\u0010\u0018\u001a\u00020\u0001H\u0016J\b\u0010\u0019\u001a\u00020\u0001H\u0016J\u0016\u0010\u001a\u001a\u00020\u00012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0016J\u0010\u0010\u001a\u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\tH\u0016J$\u0010\u001b\u001a\u00020\u0001\"\f\b\u0000\u0010\u001c*\u0006\u0012\u0002\b\u00030\u001d2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u0002H\u001c0\u001fH\u0016J\u0010\u0010 \u001a\u00020\u00012\u0006\u0010!\u001a\u00020\u0007H\u0016J\b\u0010\"\u001a\u00020#H\u0016R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\"\u0010\n\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010\u00a8\u0006$"}, d2 = {"Lcom/reply/ui/manager/ActivityStarter$Builder;", "Lcom/reply/ui/manager/ActivityBuilder;", "(Lcom/reply/ui/manager/ActivityStarter;)V", "activityOptionsBundle", "Landroid/os/Bundle;", "bundle", "isToFinishCurrent", "", "requestCode", "", "startForResult", "Landroidx/activity/result/ActivityResultLauncher;", "Landroid/content/Intent;", "getStartForResult", "()Landroidx/activity/result/ActivityResultLauncher;", "setStartForResult", "(Landroidx/activity/result/ActivityResultLauncher;)V", "addBundle", "addSharedElements", "pairs", "", "Landroidx/core/util/Pair;", "Landroid/view/View;", "", "byFinishingAll", "byFinishingCurrent", "forResult", "setPage", "T", "Lcom/reply/ui/base/BaseFragment;", "page", "Ljava/lang/Class;", "shouldAnimate", "isAnimate", "start", "", "app_debug"})
    final class Builder implements com.reply.ui.manager.ActivityBuilder {
        private android.os.Bundle bundle;
        private android.os.Bundle activityOptionsBundle;
        private boolean isToFinishCurrent = false;
        private int requestCode = 0;
        @org.jetbrains.annotations.Nullable()
        private androidx.activity.result.ActivityResultLauncher<android.content.Intent> startForResult;
        
        public Builder() {
            super();
        }
        
        @org.jetbrains.annotations.Nullable()
        public final androidx.activity.result.ActivityResultLauncher<android.content.Intent> getStartForResult() {
            return null;
        }
        
        public final void setStartForResult(@org.jetbrains.annotations.Nullable()
        androidx.activity.result.ActivityResultLauncher<android.content.Intent> p0) {
        }
        
        @java.lang.Override()
        public void start() {
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public com.reply.ui.manager.ActivityBuilder addBundle(@org.jetbrains.annotations.NotNull()
        android.os.Bundle bundle) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public com.reply.ui.manager.ActivityBuilder addSharedElements(@org.jetbrains.annotations.NotNull()
        java.util.List<? extends androidx.core.util.Pair<android.view.View, java.lang.String>> pairs) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public com.reply.ui.manager.ActivityBuilder byFinishingCurrent() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public com.reply.ui.manager.ActivityBuilder byFinishingAll() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public <T extends com.reply.ui.base.BaseFragment<?>>com.reply.ui.manager.ActivityBuilder setPage(@org.jetbrains.annotations.NotNull()
        java.lang.Class<T> page) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public com.reply.ui.manager.ActivityBuilder forResult(int requestCode) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public com.reply.ui.manager.ActivityBuilder forResult(@org.jetbrains.annotations.NotNull()
        androidx.activity.result.ActivityResultLauncher<android.content.Intent> startForResult) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public com.reply.ui.manager.ActivityBuilder shouldAnimate(boolean isAnimate) {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/reply/ui/manager/ActivityStarter$Companion;", "", "()V", "ACTIVITY_FIRST_PAGE", "", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}