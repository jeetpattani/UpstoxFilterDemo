package com.reply.di.module

import com.reply.ui.base.BaseActivity
import com.reply.ui.manager.FragmentHandler
import com.reply.ui.manager.Navigator

import javax.inject.Named

import dagger.Module
import dagger.Provides

@Module
class ActivityModule {

    @Provides
    @com.reply.di.PerActivity
    internal fun navigator(activity: BaseActivity): Navigator {
        return activity
    }

    @Provides
    @com.reply.di.PerActivity
    internal fun fragmentManager(baseActivity: BaseActivity): androidx.fragment.app.FragmentManager {
        return baseActivity.supportFragmentManager
    }

    @Provides
    @com.reply.di.PerActivity
    @Named("placeholder")
    internal fun placeHolder(baseActivity: BaseActivity): Int {
        return baseActivity.findFragmentPlaceHolder()
    }

    @Provides
    @com.reply.di.PerActivity
    internal fun fragmentHandler(fragmentManager: com.reply.ui.manager.FragmentManager): FragmentHandler {
        return fragmentManager
    }


}
