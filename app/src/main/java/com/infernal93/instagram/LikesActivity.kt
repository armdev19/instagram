package com.infernal93.instagram

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class LikesActivity : BaseActivity(navNumber = 3) {
    private val TAG = "LikesActivity"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        setupBottomNav()
        Log.d(TAG, "onCreate")
    }
}
