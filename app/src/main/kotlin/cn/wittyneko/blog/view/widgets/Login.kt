package cn.wittyneko.blog.view.widgets

import android.content.Context
import android.os.Build
import android.support.annotation.AttrRes
import android.support.annotation.RequiresApi
import android.support.annotation.StyleRes
import android.util.AttributeSet
import android.view.Gravity
import android.view.ViewGroup
import android.widget.FrameLayout
import android.widget.LinearLayout
import org.jetbrains.anko.*

/**
 * Created by wittyneko on 17-6-18.
 */

class Login : LinearLayout {
    constructor(context: Context) : this(context, attrs = null) {}

    constructor(context: Context, attrs: AttributeSet?) : this(context, attrs, 0) {}

    constructor(context: Context, attrs: AttributeSet?, @AttrRes defStyleAttr: Int) : super(context, attrs, defStyleAttr) {
        initLayout()
    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    constructor(context: Context, attrs: AttributeSet?, @AttrRes defStyleAttr: Int, @StyleRes defStyleRes: Int) : super(context, attrs, defStyleAttr, defStyleRes) {
        initLayout()
    }

    init {

        val loginView = LoginView(context)
        addView(loginView.root, matchParent, wrapContent)
    }

    fun initLayout() {
    }
}
