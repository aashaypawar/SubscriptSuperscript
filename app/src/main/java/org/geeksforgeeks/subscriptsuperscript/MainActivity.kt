package org.geeksforgeeks.subscriptsuperscript

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Spannable
import android.text.SpannableStringBuilder
import android.text.style.RelativeSizeSpan
import android.text.style.SubscriptSpan
import android.text.style.SuperscriptSpan
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val mTextView = findViewById<TextView>(R.id.text_view_1)

        val mString = "A2 + B6"

        val mStringSpan = SpannableStringBuilder(mString)

        mStringSpan.setSpan(SubscriptSpan(), 1, 2, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE)
        mStringSpan.setSpan(RelativeSizeSpan(0.5f),1, 2, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE)
        mStringSpan.setSpan(SuperscriptSpan(), 6, 7, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE)
        mStringSpan.setSpan(RelativeSizeSpan(0.5f),6, 7, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE)

        mTextView.text = mStringSpan
    }
}