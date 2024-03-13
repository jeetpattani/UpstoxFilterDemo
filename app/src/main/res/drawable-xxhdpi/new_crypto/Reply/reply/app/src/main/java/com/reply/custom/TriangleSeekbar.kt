package com.reply.custom

import android.content.Context
import android.graphics.*
import android.util.AttributeSet
import android.view.MotionEvent
import android.view.View
import android.view.View.OnTouchListener
import com.reply.R
import java.math.BigDecimal

class TriangleSeekbar : View, OnTouchListener {
    enum class Position {
        TOP_LEFT, TOP_RIGHT, BOTTOM_LEFT, BOTTOM_RIGHT, CENTER
    }

    interface ProgressListener {
        fun onProgressChange(progress: Float)
    }

    private var mProgressListener: ProgressListener? = null
    private var mHeight = 0
    private var mWidth = 0
    private var mLoadedHeight = 0
    private var mLoadedWidth = 0
    private var mProgressX = 0f
    private var mProgressY = 0f
    private var mProgressPosition = Position.CENTER
    private val mTextPaint = Paint()
    private val mSeekbarPaint = Paint()
    private val mSeekbarLoadingPaint = Paint()
    private val mSeekbarPath = Path()
    private val mSeekbarLoadingPath = Path()
    private var mTextColor = 0
    var seekbarColor = 0
        private set
    private var mSeekbarLoadingColor = 0
    private var mIsProgressVisible = false
    var fontName: String? = null
        private set
    private var mTextSize = 96f
    var percentage = 0.0f
        private set

    constructor(context: Context?) : super(context) {
        setOnTouchListener(this)
    }

    constructor(context: Context, attrs: AttributeSet?) : super(context, attrs) {
        setOnTouchListener(this)
        val typedArray = context.obtainStyledAttributes(attrs, R.styleable.TriangleSeekbar)
        seekbarColor = typedArray.getColor(
            R.styleable.TriangleSeekbar_seekbarColor,
            resources.getColor(R.color.colorAccent)
        )
        mSeekbarLoadingColor = typedArray.getColor(
            R.styleable.TriangleSeekbar_seekbarLoadingColor,
            resources.getColor(R.color.colorGreyAB)
        )
        mTextColor = typedArray.getColor(
            R.styleable.TriangleSeekbar_textColor,
            Color.BLACK
        )
        mIsProgressVisible = typedArray.getBoolean(R.styleable.TriangleSeekbar_showProgress, false)
        mProgressPosition = Position.values()[typedArray.getInt(
            R.styleable.TriangleSeekbar_progressTextPosition,
            4
        )]
        mTextSize = typedArray.getDimension(R.styleable.TriangleSeekbar_textFontSize, 96f)
        fontName = typedArray.getString(R.styleable.TriangleSeekbar_textFontName)
        percentage = typedArray.getFloat(R.styleable.TriangleSeekbar_progress, 0f)
        mSeekbarPaint.color = seekbarColor
        mSeekbarLoadingPaint.color = mSeekbarLoadingColor
        mTextPaint.color = mTextColor
        mTextPaint.textSize = mTextSize
        if (fontName != null) {
            try {
                mTextPaint.typeface = Typeface.createFromAsset(context.assets, "/fonts/\$mFontName")
            } catch (e: Exception) {
                e.printStackTrace()
            }
        }
        typedArray.recycle()
    }

    override fun onMeasure(widthMeasureSpec: Int, heightMeasureSpec: Int) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec)
        mHeight = MeasureSpec.getSize(heightMeasureSpec)
        mWidth = MeasureSpec.getSize(widthMeasureSpec)
    }

    override fun onLayout(changed: Boolean, left: Int, top: Int, right: Int, bottom: Int) {
        super.onLayout(changed, left, top, right, bottom)
//        mSeekbarPath.moveTo(mWidth.toFloat(), 0f)
//        mSeekbarPath.lineTo(mWidth.toFloat(), mHeight.toFloat())
//        mSeekbarPath.lineTo(0f, mHeight.toFloat())

//        mSeekbarPath.lineTo(0f.toFloat(), mHeight.toFloat())
//        mSeekbarPath.lineTo(mWidth.toFloat(), 0f.toFloat())
//        mSeekbarPath.lineTo(0f,0f)

        mSeekbarPath.lineTo(0f.toFloat(), mHeight.toFloat())
        mSeekbarPath.lineTo(mWidth.toFloat(), 0f.toFloat())
        mSeekbarPath.lineTo(0f, 0f)

//        mSeekbarPath.lineTo(300f, 0f)
//        mSeekbarPath.lineTo(0f, 300f)
//        mSeekbarPath.lineTo(0f, 0f)


        if (percentage > 0) {
            setProgress(percentage)
        }
    }

    override fun onTouch(v: View, event: MotionEvent): Boolean {
        when (event.action) {
            MotionEvent.ACTION_MOVE, MotionEvent.ACTION_DOWN, MotionEvent.ACTION_UP -> if (event.y >= 0 && event.y <= mHeight) {
                buildLoadingTriangle(event.y)
            }
        }
        invalidate()
        return true
    }

    @Synchronized
    override fun onDraw(canvas: Canvas) {
        super.onDraw(canvas)
        canvas.drawPath(mSeekbarPath, mSeekbarPaint)
        canvas.drawPath(mSeekbarLoadingPath, mSeekbarLoadingPaint)
        if (mIsProgressVisible) {
            canvas.drawText(
                Math.round(percentage * 100f).toString() + " % ",
                mProgressX,
                mProgressY,
                mTextPaint
            )
        }
    }

//    private fun buildLoadingTriangle(motionX: Float) {
//        mSeekbarLoadingPath.reset()
//        var hypotenuse = Math.sqrt((mHeight * mHeight + mWidth * mWidth).toDouble())
//        val sinA = mHeight / hypotenuse
//        val cosA = Math.sqrt(1 - sinA * sinA)
//        hypotenuse = motionX / cosA
//        mLoadedHeight = Math.round(hypotenuse * sinA).toInt()
//        mLoadedWidth = Math.round(motionX)
//        mSeekbarLoadingPath.moveTo(0f, mHeight.toFloat())
//        mSeekbarLoadingPath.lineTo(mLoadedWidth.toFloat(), mHeight.toFloat())
//        mSeekbarLoadingPath.lineTo(mLoadedWidth.toFloat(), (mHeight - mLoadedHeight).toFloat())
//        percentage = calculatePercentage()
//        if (mProgressListener != null) {
//            mProgressListener!!.onProgressChange(percentage)
//        }
//        setProgressPosition(mProgressPosition)
//    }

    private fun buildLoadingTriangle(motionX: Float) {
        mSeekbarLoadingPath.reset()
//        var hypotenuse = Math.sqrt((mHeight * mHeight + mWidth * mWidth).toDouble())
//        val sinA = mHeight / hypotenuse
//        val cosA = Math.sqrt(1 - sinA * sinA)
//        hypotenuse = motionX / cosA
//        mLoadedHeight = Math.round(hypotenuse * sinA).toInt()
//        mLoadedWidth = Math.round(motionX)

//        var hypotenuse = Math.sqrt((mHeight * mHeight + mWidth * mWidth).toDouble())
//        val sinA = mWidth / hypotenuse
//        val cosA = Math.sqrt(1 - sinA * sinA)
//        hypotenuse = motionX / cosA
//        mLoadedHeight = Math.round(hypotenuse * sinA).toInt()
//        mLoadedWidth = Math.round(motionX)

        var hypotenuse = Math.sqrt((mHeight * mHeight + mWidth * mWidth).toDouble())
        val cosA = mWidth / hypotenuse
        val sinA = Math.sqrt(1 - cosA * cosA)
        hypotenuse = motionX / sinA
        mLoadedWidth = Math.round(hypotenuse * cosA).toInt()
        mLoadedHeight = Math.round(motionX)

//        mSeekbarLoadingPath.moveTo(0f, mHeight.toFloat())
//        mSeekbarLoadingPath.lineTo(mLoadedWidth.toFloat(), mHeight.toFloat())
//        mSeekbarLoadingPath.lineTo(mLoadedWidth.toFloat(), (mHeight - mLoadedHeight).toFloat())

//        mSeekbarLoadingPath.lineTo(0f.toFloat(), mHeight.toFloat())
//        mSeekbarLoadingPath.lineTo((mWidth.toFloat()- mLoadedWidth.toFloat()), 0f)
//        mSeekbarLoadingPath.lineTo(0f,0f)

        mSeekbarLoadingPath.lineTo(mWidth.toFloat(), 0f)
        mSeekbarLoadingPath.lineTo( 0f, (mHeight.toFloat()- mLoadedWidth.toFloat()),)
        mSeekbarLoadingPath.lineTo(0f,0f)

//        mSeekbarLoadingPath.moveTo(mWidth.toFloat(), 0f)
//        mSeekbarLoadingPath.lineTo(0f, (mHeight.toFloat() - mLoadedWidth.toFloat()))
//        mSeekbarLoadingPath.lineTo(0f, 0f)



        percentage = calculatePercentage()
        if (mProgressListener != null) {
            mProgressListener!!.onProgressChange(percentage)
        }
        setProgressPosition(mProgressPosition)
    }


    private fun setProgressPosition(position: Position) {
        val bounds = Rect()
        val text = "" + Math.round(percentage) + " % "
        mTextPaint.getTextBounds(text, 0, text.length, bounds)
        when (position) {
            Position.TOP_LEFT -> {
                mProgressX = bounds.height() * 0.25f
                mProgressY = bounds.height() + bounds.height() * 0.25f
            }
            Position.TOP_RIGHT -> {
                mProgressX = mWidth - (bounds.width() + bounds.height() * 0.25f)
                mProgressY = bounds.height() + bounds.height() * 0.25f
            }
            Position.BOTTOM_LEFT -> {
                mProgressX = bounds.height() / 2f
                mProgressY = mHeight - bounds.height() * 0.25f
            }
            Position.BOTTOM_RIGHT -> {
                mProgressX = mWidth - (bounds.width() + bounds.height() * 0.25f)
                mProgressY = mHeight - bounds.height() * 0.25f
            }
            Position.CENTER -> {
                mProgressX = mWidth / 2f
                mProgressY = mHeight / 1.25f
            }
        }
        invalidate()
    }

    private fun calculatePercentage(): Float {
        val loadedArea = (mLoadedHeight * mLoadedWidth).toDouble()
        val fullArea = mHeight * mWidth
        var bd = BigDecimal(loadedArea / fullArea)
        bd = bd.setScale(2, BigDecimal.ROUND_HALF_UP)
        return bd.toFloat()
    }

    fun setProgress(progress: Float) {
        if (progress >= 0.0 && progress <= 1.0) {
            val newWidth = mWidth * Math.sqrt(progress.toDouble())
            buildLoadingTriangle(Math.ceil(newWidth).toFloat())
            invalidate()
        } else {
            throw IllegalArgumentException("Progress must be between 0.0 and 1.0")
        }
    }

    var textColor: Int
        get() = mTextColor
        set(color) {
            mTextColor = color
            mTextPaint.color = mTextColor
            invalidate()
        }

    fun setSeekBarColor(color: Int) {
        seekbarColor = color
        mSeekbarPaint.color = seekbarColor
        invalidate()
    }

    var seekbarLoadingColor: Int
        get() = mSeekbarLoadingColor
        set(color) {
            mSeekbarLoadingColor = color
            mSeekbarLoadingPaint.color = mSeekbarLoadingColor
            invalidate()
        }
    var isProgressVisible: Boolean
        get() = mIsProgressVisible
        set(mIsProgressVisible) {
            this.mIsProgressVisible = mIsProgressVisible
            invalidate()
        }
    var textSize: Float
        get() = mTextSize
        set(mTextSize) {
            this.mTextSize = mTextSize
            invalidate()
        }

    fun setProgressListener(mProgressListener: ProgressListener?) {
        this.mProgressListener = mProgressListener
    }

    fun setFontName(mFontName: String) {
        fontName = mFontName
        try {
            mTextPaint.typeface = Typeface.createFromAsset(
                context.assets,
                "/fonts/$mFontName"
            )
        } catch (e: Exception) {
            throw IllegalArgumentException("Please check that you correctly set the font")
        }
        invalidate()
    }
}