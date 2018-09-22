package com.example.riza.footballapp.layout

import android.content.Context
import android.view.Gravity
import android.view.View
import android.widget.LinearLayout
import com.example.riza.footballapp.R
import org.jetbrains.anko.*

/**
 * Created by riza on 07/09/18.
 */
class ClubItem : AnkoComponent<Context> {
    override fun createView(ui: AnkoContext<Context>): View = with(ui) {
        return linearLayout {
            lparams(width = matchParent, height = wrapContent)
            padding = dip(16)
            orientation = LinearLayout.HORIZONTAL
            imageView {
                id = R.id.image
            }.lparams(width = dip(50), height = dip(50))
            textView {
                id = R.id.name
            }.lparams {
                margin = dip(10)
                gravity = Gravity.CENTER_VERTICAL
            }
        }

    }
}