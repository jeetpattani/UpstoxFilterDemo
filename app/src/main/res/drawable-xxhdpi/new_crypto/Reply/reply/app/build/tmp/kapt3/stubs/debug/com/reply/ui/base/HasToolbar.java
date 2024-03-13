package com.reply.ui.base;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0012\u0010\u0006\u001a\u00020\u00032\b\b\u0001\u0010\u0007\u001a\u00020\bH&J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000bH&J\u0010\u0010\f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u000eH&J\u0012\u0010\f\u001a\u00020\u00032\b\b\u0001\u0010\r\u001a\u00020\bH&J\u0010\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u000bH&J\u0010\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u000bH&\u00f8\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001\u00a8\u0006\u0012\u00c0\u0006\u0001"}, d2 = {"Lcom/reply/ui/base/HasToolbar;", "", "setToolbar", "", "toolbar", "Landroidx/appcompat/widget/Toolbar;", "setToolbarColor", "color", "", "setToolbarElevation", "isVisible", "", "setToolbarTitle", "title", "", "showBackButton", "b", "showToolbar", "app_debug"})
public abstract interface HasToolbar {
    
    public abstract void setToolbar(@org.jetbrains.annotations.NotNull()
    androidx.appcompat.widget.Toolbar toolbar);
    
    public abstract void showToolbar(boolean b);
    
    public abstract void setToolbarTitle(@org.jetbrains.annotations.NotNull()
    java.lang.CharSequence title);
    
    public abstract void setToolbarTitle(@androidx.annotation.StringRes()
    int title);
    
    public abstract void showBackButton(boolean b);
    
    public abstract void setToolbarColor(@androidx.annotation.ColorRes()
    int color);
    
    public abstract void setToolbarElevation(boolean isVisible);
}