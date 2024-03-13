package com.reply.core;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\b\u0007\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010\u0007\u001a\u00020\bJ\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fJ\u000e\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\fJ\u000e\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\fJ\u000e\u0010\u0011\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\fJ\u0018\u0010\u0012\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\nH\u0007J\u0016\u0010\u0014\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\u000eJ\u0018\u0010\u0015\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\fH\u0007R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0017"}, d2 = {"Lcom/reply/core/AppPreferences;", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "sharedPreferences", "Landroid/content/SharedPreferences;", "clearAll", "", "getBoolean", "", "name", "", "getFloat", "", "getInt", "", "getString", "putBoolean", "value", "putFloat", "putString", "Companion", "app_debug"})
@javax.inject.Singleton()
public final class AppPreferences {
    @org.jetbrains.annotations.NotNull()
    public static final com.reply.core.AppPreferences.Companion Companion = null;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String SHARED_PREF_NAME = "app_preference";
    private final android.content.SharedPreferences sharedPreferences = null;
    
    @javax.inject.Inject()
    public AppPreferences(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super();
    }
    
    @android.annotation.SuppressLint(value = {"CommitPrefEdits"})
    public final void putString(@org.jetbrains.annotations.NotNull()
    java.lang.String name, @org.jetbrains.annotations.NotNull()
    java.lang.String value) {
    }
    
    @android.annotation.SuppressLint(value = {"CommitPrefEdits"})
    public final void putBoolean(@org.jetbrains.annotations.NotNull()
    java.lang.String name, boolean value) {
    }
    
    public final boolean getBoolean(@org.jetbrains.annotations.NotNull()
    java.lang.String name) {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getString(@org.jetbrains.annotations.NotNull()
    java.lang.String name) {
        return null;
    }
    
    public final int getInt(@org.jetbrains.annotations.NotNull()
    java.lang.String name) {
        return 0;
    }
    
    public final void clearAll() {
    }
    
    public final void putFloat(@org.jetbrains.annotations.NotNull()
    java.lang.String name, float value) {
    }
    
    public final float getFloat(@org.jetbrains.annotations.NotNull()
    java.lang.String name) {
        return 0.0F;
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/reply/core/AppPreferences$Companion;", "", "()V", "SHARED_PREF_NAME", "", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}