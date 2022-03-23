package com.fei.fps

import android.os.Bundle
import androidx.annotation.LayoutRes
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import com.fei.fps.util.setStatusBarColor

abstract class BaseActivity(@LayoutRes resId: Int) : AppCompatActivity(resId) {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setStatusBarColor(ContextCompat.getColor(this,R.color.status_bar))
        initView()
    }

    abstract fun initView()
}