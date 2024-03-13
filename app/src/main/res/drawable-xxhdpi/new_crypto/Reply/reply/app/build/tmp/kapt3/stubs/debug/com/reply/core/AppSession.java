package com.reply.core;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \"2\u00020\u0001:\u0001\"B!\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\b\u0010 \u001a\u00020!H\u0016R\u001a\u0010\u0006\u001a\u00020\u0007X\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\u00020\u00078VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u000e\u0010\nR\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0011\u001a\u00020\u00078VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0012\u0010\nR*\u0010\u0015\u001a\u0004\u0018\u00010\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u00148V@VX\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R$\u0010\u001a\u001a\u00020\u00072\u0006\u0010\u001a\u001a\u00020\u00078V@VX\u0096\u000e\u00a2\u0006\f\u001a\u0004\b\u001b\u0010\n\"\u0004\b\u001c\u0010\fR$\u0010\u001d\u001a\u00020\u00072\u0006\u0010\u001d\u001a\u00020\u00078V@VX\u0096\u000e\u00a2\u0006\f\u001a\u0004\b\u001e\u0010\n\"\u0004\b\u001f\u0010\f\u00a8\u0006#"}, d2 = {"Lcom/reply/core/AppSession;", "Lcom/reply/core/Session;", "appPreferences", "Lcom/reply/core/AppPreferences;", "context", "Landroid/content/Context;", "apiKey", "", "(Lcom/reply/core/AppPreferences;Landroid/content/Context;Ljava/lang/String;)V", "getApiKey", "()Ljava/lang/String;", "setApiKey", "(Ljava/lang/String;)V", "deviceId", "getDeviceId", "gson", "Lcom/google/gson/Gson;", "language", "getLanguage", "value", "Lcom/reply/data/pojo/User;", "user", "getUser", "()Lcom/reply/data/pojo/User;", "setUser", "(Lcom/reply/data/pojo/User;)V", "userId", "getUserId", "setUserId", "userSession", "getUserSession", "setUserSession", "clearSession", "", "Companion", "app_debug"})
@javax.inject.Singleton()
public final class AppSession implements com.reply.core.Session {
    private final com.reply.core.AppPreferences appPreferences = null;
    private final android.content.Context context = null;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String apiKey;
    private final com.google.gson.Gson gson = null;
    @org.jetbrains.annotations.Nullable()
    private com.reply.data.pojo.User user;
    @org.jetbrains.annotations.NotNull()
    public static final com.reply.core.AppSession.Companion Companion = null;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String USER_JSON = "user_json";
    
    @javax.inject.Inject()
    public AppSession(@org.jetbrains.annotations.NotNull()
    com.reply.core.AppPreferences appPreferences, @org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    @javax.inject.Named(value = "api-key")
    java.lang.String apiKey) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String getApiKey() {
        return null;
    }
    
    @java.lang.Override()
    public void setApiKey(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public com.reply.data.pojo.User getUser() {
        return null;
    }
    
    @java.lang.Override()
    public void setUser(@org.jetbrains.annotations.Nullable()
    com.reply.data.pojo.User value) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String getUserSession() {
        return null;
    }
    
    @java.lang.Override()
    public void setUserSession(@org.jetbrains.annotations.NotNull()
    java.lang.String userSession) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String getUserId() {
        return null;
    }
    
    @java.lang.Override()
    public void setUserId(@org.jetbrains.annotations.NotNull()
    java.lang.String userId) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String getDeviceId() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String getLanguage() {
        return null;
    }
    
    @java.lang.Override()
    public void clearSession() {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/reply/core/AppSession$Companion;", "", "()V", "USER_JSON", "", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}