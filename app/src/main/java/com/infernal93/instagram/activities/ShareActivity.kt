package com.infernal93.instagram.activities

import android.os.Bundle
import android.util.Log
import com.infernal93.instagram.R

class ShareActivity : BaseActivity(navNumber = 2) {
    private val TAG = "ShareActivity"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        setupBottomNav()
        Log.d(TAG, "onCreate")
    }
}
