package com.reply.di.component

import com.reply.di.module.FragmentModule
import com.reply.ui.auth.fragment.LoginFragment
import com.reply.ui.auth.fragment.SignupFragment
import com.reply.ui.base.BaseFragment
import dagger.Subcomponent

@com.reply.di.PerFragment
@Subcomponent(modules = [(FragmentModule::class)])
interface FragmentComponent {
    fun baseFragment(): BaseFragment<*>
    fun inject(loginFragment: LoginFragment)
    fun inject(loginFragment: SignupFragment)

}
