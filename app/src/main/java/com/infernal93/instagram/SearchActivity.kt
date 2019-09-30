package com.infernal93.instagram

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class SearchActivity : BaseActivity(navNumber = 1) {
    private val TAG = "SearchActivity"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)

        setupBottomNav()
        Log.d(TAG, "onCreate")
    }
}
