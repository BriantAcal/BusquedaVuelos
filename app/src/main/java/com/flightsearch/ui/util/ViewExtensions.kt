package com.flightsearch.ui.util

import android.os.Build
import android.support.annotation.StyleRes
import android.support.v4.widget.TextViewCompat
import android.text.Html
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import com.bumptech.glide.Glide


fun View.singleClick(l: (android.view.View?) -> Unit) {
    setOnClickListener(SingleClickListener(l))
}

fun ImageView.loadUrl(url: String) {
    Glide.with(context).load(url).into(this)
}

fun TextView.setTextAppearanceC(@StyleRes textAppearance: Int)
        = TextViewCompat.setTextAppearance(this, textAppearance)

@Suppress("DEPRECATION")
fun String.fromHtml() = if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
    Html.fromHtml(this, Html.FROM_HTML_MODE_COMPACT);
} else {
    Html.fromHtml(this)
}