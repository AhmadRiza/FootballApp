package com.example.riza.footballapp

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.example.riza.footballapp.layout.MainUI
import org.jetbrains.anko.setContentView
import org.jetbrains.anko.startActivity

class MainActivity : AppCompatActivity() {

    private val items: MutableList<Club> = mutableListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val adapter = ClubAdapter(items) { club ->
            startActivity<DetailsActivity>("club" to club)
        }

        MainUI(adapter).setContentView(this)

        initData()

    }

    private fun initData() {
        val name = resources.getStringArray(R.array.club_name)
        val desc = resources.getStringArray(R.array.club_desc)
        val img = resources.obtainTypedArray(R.array.club_image)

        for (i in name.indices) {
            items.add(i, Club(name[i], img.getResourceId(i, 0), desc[i]))
        }
        img.recycle()
    }
}
