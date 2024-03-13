package com.reply.ui.home

import android.os.Bundle
import android.view.View
import com.reply.R
import com.reply.databinding.HomeActivityBinding
import com.reply.di.component.ActivityComponent
import com.reply.ui.base.BaseActivity

class HomeActivity : BaseActivity(), View.OnClickListener {

    lateinit var binding: HomeActivityBinding

    override fun createViewBinding(): View {
        binding = HomeActivityBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun findFragmentPlaceHolder(): Int = R.id.placeHolder

    override fun inject(activityComponent: ActivityComponent) {
        activityComponent.inject(this)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onClick(v: View) {
        when (v.id) {

        }
    }


}
