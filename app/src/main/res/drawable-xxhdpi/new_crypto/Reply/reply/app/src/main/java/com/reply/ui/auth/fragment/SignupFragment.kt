package com.reply.ui.auth.fragment

import android.view.LayoutInflater
import android.view.ViewGroup
import com.reply.databinding.AuthFragmentSignupBinding
import com.reply.di.component.FragmentComponent
import com.reply.ui.base.BaseFragment

class SignupFragment: BaseFragment<AuthFragmentSignupBinding>() {

    override fun inject(fragmentComponent: FragmentComponent) {
        fragmentComponent.inject(this)
    }

    override fun createViewBinding(inflater: LayoutInflater, container: ViewGroup?, attachToRoot: Boolean): AuthFragmentSignupBinding {
        return AuthFragmentSignupBinding.inflate(inflater,container,attachToRoot)
    }

    override fun bindData() {

    }
}