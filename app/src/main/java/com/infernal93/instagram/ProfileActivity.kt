package com.infernal93.instagram

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
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
