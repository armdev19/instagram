package com.infernal93.instagram.activities

import android.os.Bundle
import android.util.Log
import com.infernal93.instagram.R

class LikesActivity : BaseActivity(navNumber = 3) {
    private val TAG = "LikesActivity"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        setupBottomNav()
        Log.d(TAG, "onCreate")
    }
}
