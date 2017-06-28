package cn.wittyneko.blog.view.activity

import android.app.Activity
import android.content.Context
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import cn.wittyneko.base.LogUtil

import cn.wittyneko.blog.R

class WelcomeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_welcome)
        supportFragmentManager.beginTransaction().add(FragmentLifecycle(), "lifecycle").commit()
        LogUtil.e("activity")
    }

    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        super.onCreate(savedInstanceState, persistentState)
        LogUtil.e("activity")
    }

    override fun onDestroy() {
        super.onDestroy()
        LogUtil.e("activity")
    }

    override fun onResume() {
        super.onResume()
        LogUtil.e("activity")
    }

    override fun onResumeFragments() {
        super.onResumeFragments()
        LogUtil.e("activity")
    }

    override fun onPause() {
        super.onPause()
        LogUtil.e("activity")
    }

    class FragmentLifecycle : Fragment() {

        override fun onAttach(context: Context?) {
            super.onAttach(context)
            LogUtil.w("fragment")
        }

        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            LogUtil.w("fragment")
            this@FragmentLifecycle.fragmentManager
                    .beginTransaction()
                    .add(FragmentNest(), "nest")
                    .commit()
        }

        override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View? {
            LogUtil.w("fragment")
            return TextView(context)
        }

        override fun onViewCreated(view: View?, savedInstanceState: Bundle?) {
            super.onViewCreated(view, savedInstanceState)
            LogUtil.w("fragment")
        }

        override fun onActivityCreated(savedInstanceState: Bundle?) {
            super.onActivityCreated(savedInstanceState)
            LogUtil.w("fragment")
        }

        override fun onResume() {
            super.onResume()
            LogUtil.w("fragment")
        }

        override fun onPause() {
            super.onPause()
            LogUtil.w("fragment")
        }

        override fun onDestroy() {
            super.onDestroy()
            LogUtil.w("fragment")
        }

        override fun onDetach() {
            super.onDetach()
            LogUtil.w("fragment")
        }
    }



    class FragmentNest : Fragment() {

        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            LogUtil.i("fragment")
//            this@FragmentLifecycle.fragmentManager
//                    .beginTransaction()
//                    .add(Fragment(), "nest")
//                    .commit()
        }

        override fun onActivityCreated(savedInstanceState: Bundle?) {
            super.onActivityCreated(savedInstanceState)
            LogUtil.i("fragment")
        }

        override fun onViewCreated(view: View?, savedInstanceState: Bundle?) {
            super.onViewCreated(view, savedInstanceState)
            LogUtil.i("fragment")
        }

        override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View? {
            LogUtil.i("fragment")
            return super.onCreateView(inflater, container, savedInstanceState)
        }

        override fun onAttach(context: Context?) {
            super.onAttach(context)
            LogUtil.i("fragment")
        }

        override fun onDetach() {
            super.onDetach()
            LogUtil.i("fragment")
        }

        override fun onResume() {
            super.onResume()
            LogUtil.i("fragment")
        }

        override fun onPause() {
            super.onPause()
            LogUtil.i("fragment")
        }

        override fun onDestroy() {
            super.onDestroy()
            LogUtil.i("fragment")
        }
    }


}
