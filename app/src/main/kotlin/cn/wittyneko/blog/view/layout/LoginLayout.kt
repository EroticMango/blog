package cn.wittyneko.blog.view.layout

import android.content.Context
import android.view.ViewGroup
import cn.wittyneko.blog.R
import org.jetbrains.anko.*

/**
 * Created by wittyneko on 17-6-18.
 */
class LoginLayout(context: Context) {
    var root: ViewGroup? = null

    init {

        with(context) {
            root = include<ViewGroup>(R.layout.activity_login)

        }
    }
}