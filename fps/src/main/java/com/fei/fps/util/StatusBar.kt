package com.fei.sentry.util

import android.app.Activity
import androidx.annotation.ColorInt

fun Activity.setStatusBarColor(@ColorInt color: Int) {
    window.run {
        statusBarColor = color
    }
}