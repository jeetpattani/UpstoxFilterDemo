package com.reply.ui.auth

import android.graphics.Color
import android.os.Build
import android.os.Bundle
import android.view.View
import android.view.Window
import android.view.WindowManager
import com.reply.R
import com.reply.databinding.AuthAcitivtyBinding
import com.reply.di.component.ActivityComponent
import com.reply.ui.auth.fragment.LoginFragment
import com.reply.ui.base.BaseActivity


class AuthActivity : BaseActivity() {

    lateinit var authAcitivtyBinding: AuthAcitivtyBinding

    override fun findFragmentPlaceHolder(): Int {
        return R.id.placeHolder
    }

    override fun createViewBinding(): View {
        authAcitivtyBinding = AuthAcitivtyBinding.inflate(layoutInflater)
        return authAcitivtyBinding.root
    }

    override fun inject(activityComponent: ActivityComponent) {
        activityComponent.inject(this)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        load(LoginFragment::class.java).replace(false)
    }

}