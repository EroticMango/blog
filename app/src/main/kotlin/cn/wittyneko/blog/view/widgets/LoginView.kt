package cn.wittyneko.blog.view.widgets

import android.content.Context
import android.support.design.widget.TextInputLayout
import android.view.Gravity
import android.view.View
import android.widget.LinearLayout
import org.jetbrains.anko.*
import org.jetbrains.anko.design._TextInputLayout
import org.jetbrains.anko.design.textInputLayout

/**
 * Created by wittyneko on 17-6-18.
 */
class LoginView(context: Context) {
    val root: LinearLayout
    init {

        root = context.verticalLayout {
            orientation = LinearLayout.VERTICAL
//            layoutParams = this@Lingin.generateDefaultLayoutParams()
//            layoutParams.width = ViewGroup.LayoutParams.MATCH_PARENT
//            layoutParams.height = ViewGroup.LayoutParams.MATCH_PARENT

            editText(){
                hint = "User Name"
                requestFocus()
            }.lparams {
                width = matchParent
            }

            button("login"){
            }.lparams {
                width = wrapContent
                gravity = Gravity.CENTER
            }
            textInputLayout{
                visibility = View.VISIBLE
                autoCompleteTextView {
                    visibility = View.VISIBLE
                    hint = "user"
                }.lparams{
                    width = matchParent
                    height = wrapContent
                }
            }.lparams {
                width = matchParent
                height = wrapContent
            }
        }
    }
}