//package com.reply.custom
//
//import android.content.Context
//import android.graphics.*
//import android.util.AttributeSet
//import android.view.MotionEvent
//import android.view.View
//import android.view.View.OnTouchListener
//import com.bumptech.glide.Glide.init
//import com.reply.R
//
//class CustomSeekbar : View, OnTouchListener {
//
//    enum class Position {
//        TOP_LEFT, TOP_RIGHT, BOTTOM_LEFT, BOTTOM_RIGHT, CENTER
//    }
//
//    interface ProgressListener {
//        fun onProgressChange(progress: Float)
//    }
//
//    private var mProgressListener: TriangleSeekbar.ProgressListener? = null
//
//    private var mHeight = 0
//    private var mWidth = 0
//
//    private var topLeftPoint = 0
//    private var topRightPoint = 0
//    private var bottomLeftPoint = 0
//    private var bottomRightPoint = 0
//
//    private var mLoadedHeight = 0
//    private var mLoadedWidth = 0
//
//    private var mProgressX = 0f
//    private var mProgressY = 0f
//
//    private var mProgressPosition = Position.CENTER
//
//    private val mTextPaint = Paint()
//    private val mSeekbarPaint = Paint()
//    private val mSeekbarLoadingPaint = Paint()
//    private val mSeekbarPath = Path()
//    private val mSeekbarLoadingPath = Path()
//
//    private var mTextColor = 0
//    private var mTextSize = 96f
//    var fontName: String? = null
//
//    var seekbarColor = 0
//        private set
//
//    private var mSeekbarLoadingColor = 0
//    private var mIsProgressVisible = false
//
//    var percentage = 0.0f
//        private set
//
//
//
//
//    constructor(context: Context) : super(context) {
//        setOnTouchListener(this)
//    }
//
//    constructor(context: Context, attrs: AttributeSet?) : super(context, attrs) {
//        setOnTouchListener(this)
//        val typedArray = context.obtainStyledAttributes(attrs, R.styleable.CustomSeekbar)
//
//        seekbarColor = typedArray.getColor(
//            R.styleable.CustomSeekbar_seekbarColor,
//            resources.getColor(R.color.seekbarPrimary)
//        )
//        mSeekbarLoadingColor = typedArray.getColor(
//            R.styleable.CustomSeekbar_seekbarLoadingColor,
//            resources.getColor(R.color.seekbarPrimaryDark)
//        )
//        mIsProgressVisible = typedArray.getBoolean(R.styleable.CustomSeekbar_showProgress, false)
//        mProgressPosition = Position.values()[typedArray.getInt(
//            R.styleable.CustomSeekbar_progressTextPosition,
//            4
//        )]
//        mTextSize = typedArray.getDimension(R.styleable.TriangleSeekbar_textFontSize, 96f)
//        fontName = typedArray.getString(R.styleable.TriangleSeekbar_textFontName)
//        percentage = typedArray.getFloat(R.styleable.TriangleSeekbar_progress, 0f)
//        mSeekbarPaint.color = seekbarColor
//        mSeekbarLoadingPaint.color = mSeekbarLoadingColor
//        mTextPaint.color = mTextColor
//        mTextPaint.textSize = mTextSize
//        if (fontName != null) {
//            try {
//                mTextPaint.typeface = Typeface.createFromAsset(context.assets, "/fonts/\$mFontName")
//            } catch (e: Exception) {
//                e.printStackTrace()
//            }
//        }
//
//        typedArray.recycle()
//    }
//
//    override fun onMeasure(widthMeasureSpec: Int, heightMeasureSpec: Int) {
//        super.onMeasure(widthMeasureSpec, heightMeasureSpec)
//        mHeight = MeasureSpec.getSize(heightMeasureSpec)
//        mWidth = MeasureSpec.getSize(widthMeasureSpec)
//    }
//
//    override fun onLayout(changed: Boolean, left: Int, top: Int, right: Int, bottom: Int) {
//        super.onLayout(changed, left, top, right, bottom)
//        mSeekbarPath.moveTo(mWidth.toFloat(), 0f)
//        mSeekbarPath.lineTo(mWidth.toFloat(), mHeight.toFloat())
//        mSeekbarPath.lineTo(0f, mHeight.toFloat())
//        if (percentage > 0) {
//            setProgress(percentage)
//        }
//    }
//
//    fun setProgress(progress: Float) {
//        if (progress >= 0.0 && progress <= 1.0) {
//            val newWidth = mWidth * Math.sqrt(progress.toDouble())
//            buildLoadingTriangle(Math.ceil(newWidth).toFloat())
//            invalidate()
//        } else {
//            throw IllegalArgumentException("Progress must be between 0.0 and 1.0")
//        }
//    }
//
//    private fun buildLoadingTriangle(motionX: Float) {
//        mSeekbarLoadingPath.reset()
//        var hypotenuse = Math.sqrt((mHeight * mHeight + mWidth * mWidth).toDouble())
//        val sinA = mHeight / hypotenuse
//        val cosA = Math.sqrt(1 - sinA * sinA)
//        hypotenuse = motionX / cosA
//        mLoadedHeight = Math.round(hypotenuse * sinA).toInt()
//        mLoadedWidth = Math.round(motionX)
//
//        mSeekbarLoadingPath.moveTo(0f, mHeight.toFloat())
//        mSeekbarLoadingPath.rMoveTo(200f, 40F)
//        mSeekbarLoadingPath.rMoveTo(200f, 40F)
//
//        mSeekbarLoadingPath.lineTo(mLoadedWidth.toFloat(), mHeight.toFloat())
//        mSeekbarLoadingPath.lineTo(mLoadedWidth.toFloat(), (mHeight - mLoadedHeight).toFloat())
//
//        percentage = calculatePercentage()
//        if (mProgressListener != null) {
//            mProgressListener!!.onProgressChange(percentage)
//        }
//        setProgressPosition(mProgressPosition)
//    }
//
//    private fun setProgressPosition(position: TriangleSeekbar.Position) {
//        val bounds = Rect()
//        val text = "" + Math.round(percentage) + " % "
//        mTextPaint.getTextBounds(text, 0, text.length, bounds)
//        when (position) {
//            Position.TOP_LEFT -> {
//                mProgressX = bounds.height() * 0.25f
//                mProgressY = bounds.height() + bounds.height() * 0.25f
//            }
//            Position.TOP_RIGHT -> {
//                mProgressX = mWidth - (bounds.width() + bounds.height() * 0.25f)
//                mProgressY = bounds.height() + bounds.height() * 0.25f
//            }
//            Position.BOTTOM_LEFT -> {
//                mProgressX = bounds.height() / 2f
//                mProgressY = mHeight - bounds.height() * 0.25f
//            }
//            Position.BOTTOM_RIGHT -> {
//                mProgressX = mWidth - (bounds.width() + bounds.height() * 0.25f)
//                mProgressY = mHeight - bounds.height() * 0.25f
//            }
//            Position.CENTER -> {
//                mProgressX = mWidth / 2f
//                mProgressY = mHeight / 1.25f
//            }
//        }
//    }
//
//
//    override fun onTouch(p0: View?, p1: MotionEvent?): java.lang.Boolean {
//
//
//        }
//
//
//}