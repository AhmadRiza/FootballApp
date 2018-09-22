package com.example.riza.footballapp.layout

import android.graphics.Typeface
import android.view.Gravity
import android.view.View
import android.widget.LinearLayout
import com.bumptech.glide.Glide
import com.example.riza.footballapp.Club
import com.example.riza.footballapp.DetailsActivity
import org.jetbrains.anko.*

class DetailsUI(private val club: Club) : AnkoComponent<DetailsActivity> {
    override fun createView(ui: AnkoContext<DetailsActivity>): View = with(ui) {
        return linearLayout {
            orientation = LinearLayout.VERTICAL
            padding = dip(16)
            imageView {
                Glide.with(ctx).load(club.img).into(this)
            }.lparams(width = dip(100), height = dip(100)) {
                gravity = Gravity.CENTER
            }
            textView {
                text = club.name
                gravity = Gravity.CENTER
                setTypeface(typeface, Typeface.BOLD)
            }.lparams(width = matchParent) {
                topMargin = dip(10)
            }
            textView {
                text = club.desc
            }.lparams(width = matchParent) {
                topMargin = dip(10)
            }
        }
    }
}