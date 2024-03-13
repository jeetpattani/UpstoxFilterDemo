package com.reply.core;

import java.lang.System;

@androidx.annotation.RequiresApi(value = android.os.Build.VERSION_CODES.M)
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0005\b\u0007\u0018\u0000 \n2\u00020\u0001:\u0001\nB\u0005\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006J\u000e\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0006R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2 = {"Lcom/reply/core/AppKeyStore;", "", "()V", "keyStore", "Ljava/security/KeyStore;", "rsaDecrypt", "", "encrypted", "rsaEncrypt", "secret", "Companion", "app_debug"})
public final class AppKeyStore {
    private final java.security.KeyStore keyStore = null;
    @org.jetbrains.annotations.NotNull()
    public static final com.reply.core.AppKeyStore.Companion Companion = null;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String KEY_ALIAS = "secure_aes_key";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String RSA_MODE = "RSA/ECB/PKCS1Padding";
    
    public AppKeyStore() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @kotlin.jvm.Throws(exceptionClasses = {java.lang.Exception.class})
    public final byte[] rsaEncrypt(@org.jetbrains.annotations.NotNull()
    byte[] secret) throws java.lang.Exception {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @kotlin.jvm.Throws(exceptionClasses = {java.lang.Exception.class})
    public final byte[] rsaDecrypt(@org.jetbrains.annotations.NotNull()
    byte[] encrypted) throws java.lang.Exception {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0006"}, d2 = {"Lcom/reply/core/AppKeyStore$Companion;", "", "()V", "KEY_ALIAS", "", "RSA_MODE", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}