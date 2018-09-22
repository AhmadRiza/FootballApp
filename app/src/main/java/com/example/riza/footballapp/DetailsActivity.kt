package com.example.riza.footballapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.example.riza.footballapp.layout.DetailsUI
import org.jetbrains.anko.setContentView

class DetailsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val club: Club = intent.getParcelableExtra("club")

        DetailsUI(club).setContentView(this)

    }
}
