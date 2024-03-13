package com.reply.di;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0016\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fR$\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0004@@X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tj\u0002\b\u0010\u00a8\u0006\u0011"}, d2 = {"Lcom/reply/di/Injector;", "", "(Ljava/lang/String;I)V", "<set-?>", "Lcom/reply/di/component/ApplicationComponent;", "applicationComponent", "getApplicationComponent", "()Lcom/reply/di/component/ApplicationComponent;", "setApplicationComponent$app_debug", "(Lcom/reply/di/component/ApplicationComponent;)V", "initAppComponent", "", "application", "Landroid/app/Application;", "apiKey", "", "INSTANCE", "app_debug"})
public enum Injector {
    /*public static final*/ INSTANCE /* = new INSTANCE() */;
    public com.reply.di.component.ApplicationComponent applicationComponent;
    
    Injector() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.reply.di.component.ApplicationComponent getApplicationComponent() {
        return null;
    }
    
    public final void setApplicationComponent$app_debug(@org.jetbrains.annotations.NotNull()
    com.reply.di.component.ApplicationComponent p0) {
    }
    
    public final void initAppComponent(@org.jetbrains.annotations.NotNull()
    android.app.Application application, @org.jetbrains.annotations.NotNull()
    java.lang.String apiKey) {
    }
}