package com.example.riza.footballapp.layout

import android.support.v7.widget.LinearLayoutManager
import android.view.View
import com.example.riza.footballapp.ClubAdapter
import com.example.riza.footballapp.MainActivity
import org.jetbrains.anko.AnkoComponent
import org.jetbrains.anko.AnkoContext
import org.jetbrains.anko.matchParent
import org.jetbrains.anko.recyclerview.v7.recyclerView
import org.jetbrains.anko.relativeLayout

class MainUI(private val mAdapter: ClubAdapter) : AnkoComponent<MainActivity> {
    override fun createView(ui: AnkoContext<MainActivity>): View = with(ui) {
        return relativeLayout {
            recyclerView {
                layoutManager = LinearLayoutManager(ctx)
                adapter = mAdapter
            }.lparams(width = matchParent, height = matchParent)
        }
    }
}