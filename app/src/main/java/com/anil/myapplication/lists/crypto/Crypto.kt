package com.anil.myapplication.lists.crypto

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Crypto(
    var logo: Int,
    var title: String,
    var subtitle: String,
    var date: String
) : Parcelable
