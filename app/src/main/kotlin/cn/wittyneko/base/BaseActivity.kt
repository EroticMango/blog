package cn.wittyneko.base

import android.content.Intent
import android.os.Bundle
import android.os.PersistableBundle
import android.support.v7.app.AppCompatActivity

/**
 * Created by wittyneko on 17-6-24.
 */
open abstract class BaseActivity<V, P : BasePresenter<V>> : AppCompatActivity() {
    protected lateinit var mPresenter: P

    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        super.onCreate(savedInstanceState, persistentState)
        mPresenter = createPresenter()
        mPresenter.attachView(attachView())
    }

    override fun onResume() {
        super.onResume()
    }

    override fun onPostResume() {
        super.onPostResume()
    }

    override fun onResumeFragments() {
        super.onResumeFragments()
    }

    override fun onPause() {
        super.onPause()
    }

    override fun onDestroy() {
        super.onDestroy()
        mPresenter.detachView()
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
    }

    abstract fun createPresenter(): P

    abstract fun attachView(): V
}