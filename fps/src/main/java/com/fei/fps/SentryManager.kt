package com.fei.fps

import android.annotation.SuppressLint
import android.app.Activity
import android.view.View
import android.widget.TextView
import com.lzf.easyfloat.EasyFloat
import com.lzf.easyfloat.enums.ShowPattern
import com.lzf.easyfloat.interfaces.OnInvokeView


/**
 * 核心方法
 */
@SuppressLint("StaticFieldLeak")
object SentryManager {

    private lateinit var fpsView: TextView

    fun init(context: Activity) {
        EasyFloat.with(context)
            .setLayout(R.layout.float_sentry, OnInvokeView { view ->
                fpsView = view.findViewById(R.id.fpsValue)
            })
            .setShowPattern(ShowPattern.ALL_TIME)
            .registerCallback { }
            .show()
    }

    fun startMonitorFps() {
        FpsMonitor.startMonitor { fps ->
            fpsView.visibility = View.VISIBLE
            fpsView.text = String.format("fps: %s", fps)
        }
    }

    fun stopMonitorFps() {
        FpsMonitor.stopMonitor()
        fpsView.visibility = View.GONE
    }
}