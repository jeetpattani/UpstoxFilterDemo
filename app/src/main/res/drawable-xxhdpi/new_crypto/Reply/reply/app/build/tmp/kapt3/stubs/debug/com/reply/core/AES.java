package com.reply.core;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\n\n\u0002\u0010\b\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0012\u0010\t\u001a\u0004\u0018\u00010\u00062\b\u0010\n\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\t\u001a\u0004\u0018\u00010\u00032\u0006\u0010\n\u001a\u00020\u0003J\u0010\u0010\u000b\u001a\u0004\u0018\u00010\u00062\u0006\u0010\f\u001a\u00020\u0006J\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u00032\b\u0010\r\u001a\u0004\u0018\u00010\u0003J\u0018\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u0011H\u0002R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0012"}, d2 = {"Lcom/reply/core/AES;", "", "encKey", "", "(Ljava/lang/String;)V", "iv", "", "key", "keyHash", "decrypt", "cypherText", "encrypt", "plainTextBytes", "plainText", "generateSHA256", "text", "length", "", "app_debug"})
@javax.inject.Singleton()
public final class AES {
    private final byte[] keyHash = null;
    private final byte[] key = null;
    private final byte[] iv = null;
    
    @javax.inject.Inject()
    public AES(@org.jetbrains.annotations.NotNull()
    @javax.inject.Named(value = "aes-key")
    java.lang.String encKey) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String encrypt(@org.jetbrains.annotations.Nullable()
    java.lang.String plainText) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final byte[] encrypt(@org.jetbrains.annotations.NotNull()
    byte[] plainTextBytes) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String decrypt(@org.jetbrains.annotations.NotNull()
    java.lang.String cypherText) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final byte[] decrypt(@org.jetbrains.annotations.Nullable()
    byte[] cypherText) {
        return null;
    }
    
    /**
     * *
     * This function computes the SHA256 hash of input string
     * @param text input text whose generateSHA256 hash has to be computed
     * @param length length of the text to be returned
     * @return returns generateSHA256 hash of input text
     * @throws NoSuchAlgorithmException
     * @throws UnsupportedEncodingException
     */
    @kotlin.jvm.Throws(exceptionClasses = {java.security.NoSuchAlgorithmException.class, java.io.UnsupportedEncodingException.class})
    private final byte[] generateSHA256(java.lang.String text, int length) throws java.security.NoSuchAlgorithmException, java.io.UnsupportedEncodingException {
        return null;
    }
}