package com.infernal93.instagram.activities

import android.content.Intent
import android.os.Bundle
import android.util.Log
import com.infernal93.instagram.R
import kotlinx.android.synthetic.main.activity_profile.*

class ProfileActivity : BaseActivity(navNumber = 4) {
    private val TAG = "ProfileActivity"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)

        setupBottomNav()
        Log.d(TAG, "onCreate")

        edit_profile_btn.setOnClickListener {
            val editIntent = Intent(this, EditProfileActivity::class.java)
            startActivity(editIntent)
        }
    }
}
