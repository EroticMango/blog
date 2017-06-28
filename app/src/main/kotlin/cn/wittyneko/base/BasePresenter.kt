package cn.wittyneko.base

import java.lang.ref.Reference
import java.lang.ref.WeakReference

/**
 * Created by wittytutu on 17-6-28.
 */
abstract class BasePresenter<V> {
    private var viewRef: Reference<V>? = null

    fun attachView(view: V) {
        viewRef = WeakReference<V>(view)
    }

    fun getView(): V? = viewRef?.get()

    fun isViewAttached() = viewRef != null && viewRef?.get() != null

    fun detachView() {
        viewRef?.let {
            it.clear()
            viewRef = null
        }
    }
}