package com.infernal93.instagram.activities

import android.os.Bundle
import android.util.Log
import com.infernal93.instagram.R

class SearchActivity : BaseActivity(navNumber = 1) {
    private val TAG = "SearchActivity"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        setupBottomNav()
        Log.d(TAG, "onCreate")
    }
}
