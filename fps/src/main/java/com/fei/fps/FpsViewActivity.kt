package com.fei.fps

import kotlinx.android.synthetic.main.activity_fps.*

/**
 * @author: luyao
 * @date：  2020/10/27 14:39
 */
class FpsViewActivity : BaseActivity(R.layout.activity_fps) {

    override fun initView() {
        fpsStart.setOnClickListener {
            FpsMonitor.startMonitor { fps ->
                fpsValue.text = String.format("fps: %s", fps)
            }

            Thread.sleep(2000)
        }
        fpsStop.setOnClickListener {
            FpsMonitor.stopMonitor()
            fpsValue.text = ""
        }
    }

}