package com.reply.di.component

import com.reply.di.module.ActivityModule
import com.reply.di.module.FragmentModule
import com.reply.ui.auth.AuthActivity
import com.reply.ui.auth.IsolatedFullActivity
import com.reply.ui.base.BaseActivity
import com.reply.ui.home.HomeActivity
import com.reply.ui.manager.Navigator
import com.reply.ui.splash.SplashActivity

import dagger.BindsInstance
import dagger.Component

@com.reply.di.PerActivity
@Component(dependencies = [ApplicationComponent::class], modules = arrayOf(ActivityModule::class))
interface ActivityComponent {

    fun activity(): BaseActivity

    fun navigator(): Navigator


    operator fun plus(fragmentModule: FragmentModule): FragmentComponent

    fun inject(mainActivity: HomeActivity)
    fun inject(mainActivity: SplashActivity)
    fun inject(authActivity: AuthActivity)
    fun inject(isolatedFullActivity: IsolatedFullActivity)

    @Component.Builder
    interface Builder {

        fun bindApplicationComponent(applicationComponent: ApplicationComponent): Builder

        @BindsInstance
        fun bindActivity(baseActivity: BaseActivity): Builder

        fun build(): ActivityComponent
    }
}
