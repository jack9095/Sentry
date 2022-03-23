package com.fei.sentry

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.fei.fps.SentryManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        SentryManager.init(this)

        sleep.setOnClickListener { Thread.sleep(1000) }
        startFps.setOnClickListener { SentryManager.startMonitorFps() }
        stopFps.setOnClickListener { SentryManager.stopMonitorFps() }
    }
}