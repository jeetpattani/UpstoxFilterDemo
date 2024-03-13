package com.reply.ui.auth

import android.os.Bundle
import android.view.View
import com.reply.R
import com.reply.databinding.IsolatedAcitivtyFullBinding
import com.reply.di.component.ActivityComponent
import com.reply.ui.base.BaseActivity
import com.reply.ui.base.BaseFragment
import com.reply.ui.manager.ActivityStarter

class IsolatedFullActivity : BaseActivity() {

    lateinit var isolatedFullActivityBinding: IsolatedAcitivtyFullBinding

    override fun findFragmentPlaceHolder(): Int {
        return R.id.placeHolder
    }

    override fun createViewBinding(): View {
        isolatedFullActivityBinding=IsolatedAcitivtyFullBinding.inflate(layoutInflater)
        return isolatedFullActivityBinding.root
    }


    override fun inject(activityComponent: ActivityComponent) {
        activityComponent.inject(this)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        if (savedInstanceState == null) {

            val page = intent.getSerializableExtra(ActivityStarter.ACTIVITY_FIRST_PAGE) as Class<BaseFragment<*>>
            load(page)
                    .setBundle(intent.extras!!)
                    .replace(false)
        }

    }
}