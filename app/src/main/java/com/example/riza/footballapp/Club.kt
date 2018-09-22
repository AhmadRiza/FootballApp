package com.example.riza.footballapp

import android.annotation.SuppressLint
import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

/**
 * Created by riza on 05/09/18.
 */
@SuppressLint("ParcelCreator")
@Parcelize
data class Club(val name: String, val img: Int, val desc: String) : Parcelable