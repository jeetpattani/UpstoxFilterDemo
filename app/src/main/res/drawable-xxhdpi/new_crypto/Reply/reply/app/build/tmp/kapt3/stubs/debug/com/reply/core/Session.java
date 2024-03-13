package com.reply.core;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aJ\b\u0010\u0018\u001a\u00020\u0019H&R\u0018\u0010\u0002\u001a\u00020\u0003X\u00a6\u000e\u00a2\u0006\f\u001a\u0004\b\u0004\u0010\u0005\"\u0004\b\u0006\u0010\u0007R\u0012\u0010\b\u001a\u00020\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\t\u0010\u0005R\u0012\u0010\n\u001a\u00020\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u000b\u0010\u0005R\u001a\u0010\f\u001a\u0004\u0018\u00010\rX\u00a6\u000e\u00a2\u0006\f\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u0018\u0010\u0012\u001a\u00020\u0003X\u00a6\u000e\u00a2\u0006\f\u001a\u0004\b\u0013\u0010\u0005\"\u0004\b\u0014\u0010\u0007R\u0018\u0010\u0015\u001a\u00020\u0003X\u00a6\u000e\u00a2\u0006\f\u001a\u0004\b\u0016\u0010\u0005\"\u0004\b\u0017\u0010\u0007\u00f8\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001\u00a8\u0006\u001b\u00c0\u0006\u0001"}, d2 = {"Lcom/reply/core/Session;", "", "apiKey", "", "getApiKey", "()Ljava/lang/String;", "setApiKey", "(Ljava/lang/String;)V", "deviceId", "getDeviceId", "language", "getLanguage", "user", "Lcom/reply/data/pojo/User;", "getUser", "()Lcom/reply/data/pojo/User;", "setUser", "(Lcom/reply/data/pojo/User;)V", "userId", "getUserId", "setUserId", "userSession", "getUserSession", "setUserSession", "clearSession", "", "Companion", "app_debug"})
public abstract interface Session {
    @org.jetbrains.annotations.NotNull()
    public static final com.reply.core.Session.Companion Companion = null;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String API_KEY = "api-key";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String USER_SESSION = "token";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String USER_ID = "USER_ID";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String DEVICE_TYPE = "A";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String LANGUAGE = "accept-language";
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.lang.String getApiKey();
    
    public abstract void setApiKey(@org.jetbrains.annotations.NotNull()
    java.lang.String p0);
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.lang.String getUserSession();
    
    public abstract void setUserSession(@org.jetbrains.annotations.NotNull()
    java.lang.String p0);
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.lang.String getUserId();
    
    public abstract void setUserId(@org.jetbrains.annotations.NotNull()
    java.lang.String p0);
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.lang.String getDeviceId();
    
    @org.jetbrains.annotations.Nullable()
    public abstract com.reply.data.pojo.User getUser();
    
    public abstract void setUser(@org.jetbrains.annotations.Nullable()
    com.reply.data.pojo.User p0);
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.lang.String getLanguage();
    
    public abstract void clearSession();
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lcom/reply/core/Session$Companion;", "", "()V", "API_KEY", "", "DEVICE_TYPE", "LANGUAGE", "USER_ID", "USER_SESSION", "app_debug"})
    public static final class Companion {
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String API_KEY = "api-key";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String USER_SESSION = "token";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String USER_ID = "USER_ID";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String DEVICE_TYPE = "A";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String LANGUAGE = "accept-language";
        
        private Companion() {
            super();
        }
    }
}