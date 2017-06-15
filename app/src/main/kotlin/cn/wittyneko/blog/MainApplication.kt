package cn.wittyneko.blog

import android.app.Application
import android.content.Context

/**
 * Created by wittytutu on 17-6-14.
 */

class MainApplication : Application {

     constructor() : super() {

    }

    override fun attachBaseContext(base: Context) {
        super.attachBaseContext(base)
    }

    override fun onCreate() {
        super.onCreate()
    }
}
