package com.autel.drone.demo

import android.app.Application
import com.autel.drone.sdk.vmodelx.SDKManager
import com.autel.drone.sdk.vmodelx.SDKLogManager

class DemoApplicationEx : Application() {

    override fun onCreate() {
        super.onCreate()
        SDKManager.get().init(applicationContext, "97ffacc0-c832-4a0d-b008-6f8e9e8cbd37", true)
        SDKLogManager.get().setSDKLogPath(applicationContext)
        println("SDKManager V=${SDKManager.get().getSDKVersion()}")
    }
}
