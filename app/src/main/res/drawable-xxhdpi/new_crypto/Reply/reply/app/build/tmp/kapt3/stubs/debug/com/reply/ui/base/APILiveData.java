package com.reply.ui.base;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\u0010\u000b\n\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00010\u00030\u0002B\u0005\u00a2\u0006\u0002\u0010\u0004JB\u0010\u0005\u001a\u00020\u00062\n\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\b2\u0018\u0010\t\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000b\u0012\u0004\u0012\u00020\u00060\n2\u0014\b\u0002\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\n\u00a8\u0006\u000f"}, d2 = {"Lcom/reply/ui/base/APILiveData;", "T", "Landroidx/lifecycle/MutableLiveData;", "Lcom/reply/data/pojo/DataWrapper;", "()V", "observe", "", "owner", "Lcom/reply/ui/base/BaseFragment;", "onChange", "Lkotlin/Function1;", "Lcom/reply/data/pojo/ResponseBody;", "onError", "", "", "app_debug"})
public final class APILiveData<T extends java.lang.Object> extends androidx.lifecycle.MutableLiveData<com.reply.data.pojo.DataWrapper<T>> {
    
    public APILiveData() {
        super(null);
    }
    
    /**
     * @param owner : Life Cycle Owner
     * @param onChange : live data
     * @param onError : Server and App error -> return true to handle error by base else return false to handle error by your self
     */
    public final void observe(@org.jetbrains.annotations.NotNull()
    com.reply.ui.base.BaseFragment<?> owner, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super com.reply.data.pojo.ResponseBody<T>, kotlin.Unit> onChange, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.Throwable, java.lang.Boolean> onError) {
    }
}