package com.reply.ui.auth.fragment

import android.graphics.Bitmap
import android.graphics.Canvas
import android.graphics.Matrix
import android.os.Bundle
import android.util.DisplayMetrics
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import com.reply.custom.TriangleSeekbar
import com.reply.databinding.AuthFragmentLoginBinding
import com.reply.di.component.FragmentComponent
import com.reply.ui.auth.viewmodel.LoginViewModel
import com.reply.ui.base.BaseFragment
import com.reply.ui.home.HomeActivity
import com.reply.utils.Validator
import javax.inject.Inject

class LoginFragment : BaseFragment<AuthFragmentLoginBinding>() {

    @Inject
    lateinit var validator: Validator

    private val viewModel by lazy {
        ViewModelProvider(
            this,
            viewModelFactory
        )[LoginViewModel::class.java]
    }

    override fun inject(fragmentComponent: FragmentComponent) {
        fragmentComponent.inject(this)
    }

    override fun createViewBinding(
        inflater: LayoutInflater,
        container: ViewGroup?,
        attachToRoot: Boolean,
    ): AuthFragmentLoginBinding {
        return AuthFragmentLoginBinding.inflate(inflater, container, attachToRoot)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        observeLiveData()
    }

    override fun bindData() {
        binding.apply {

//            imageView.contrast

            getBitmapFromView(triangleSeekbar, 250,500)?.let { flipBitmap(it) }
            triangleSeekbar.setProgressListener(object : TriangleSeekbar.ProgressListener {
                override fun onProgressChange(progress: Float) {
                    showMessage(progress.toString())
                }
            })

//            btnMakeSeekBar.setOnClickListener {
//                val rnd = Random()
//                val color = Color.argb(255, rnd.nextInt(256), rnd.nextInt(256), rnd.nextInt(256))
//
//                triangleSeekbar.setSeekBarColor(color)
//            }

//            btnShowProgress.setOnClickListener {
//                triangleSeekbar.isProgressVisible = !triangleSeekbar.isProgressVisible
//                if (triangleSeekbar.isProgressVisible) {
//                    btnShowProgress.text = "Hide progress text on it"
//                } else {
//                    btnShowProgress.text = "Show progress text on it"
//                }
//            }

        }
    }
    private fun getBitmapFromView(view: View, width: Int, height: Int): Bitmap? {
        val widthSpec = View.MeasureSpec.makeMeasureSpec(width, View.MeasureSpec.EXACTLY)
        val heightSpec = View.MeasureSpec.makeMeasureSpec(height, View.MeasureSpec.EXACTLY)
        view.measure(widthSpec, heightSpec)
        view.layout(0, 0, width, height)
        val bitmap = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888)
        val canvas = Canvas(bitmap)
        view.draw(canvas)
        return bitmap
    }


    private fun flipBitmap(src: Bitmap): Bitmap? {
        val matrix = Matrix()
        matrix.preScale(1F, 1F)
        val dst = Bitmap.createBitmap(src, 0, 0, src.width, src.height, matrix, false)
        dst.density = DisplayMetrics.DENSITY_DEFAULT
        return dst
    }
    override fun onBackActionPerform(): Boolean {
        return false
    }

    private fun observeLiveData() {
        viewModel.loginLiveData.observe(this,
            onChange = { responseBody ->
                navigator.loadActivity(HomeActivity::class.java).byFinishingCurrent().start()
            }, onError = { throwable: Throwable ->
                true
            })
    }
}