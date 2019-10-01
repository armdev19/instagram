package com.infernal93.instagram.activities

import android.content.Intent
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.infernal93.instagram.R
import kotlinx.android.synthetic.main.bottom_navigation_view.*


abstract class BaseActivity(val navNumber: Int) : AppCompatActivity() {
    private val TAG = "BaseActivity"

    fun setupBottomNav() {

        bottom_navigation_view.setIconSize(29f, 29f)
        bottom_navigation_view.setTextVisibility(false)
        bottom_navigation_view.enableItemShiftingMode(false)
        bottom_navigation_view.enableItemShiftingMode(false)
        bottom_navigation_view.enableAnimation(false)

        for (i in 0 until bottom_navigation_view.menu.size()) {
            bottom_navigation_view.setIconTintList(i, null)
        }

        bottom_navigation_view.setOnNavigationItemSelectedListener {
            val nextActivity =
                when (it.itemId) {
                    R.id.nav_item_home -> HomeActivity::class.java
                    R.id.nav_item_search -> SearchActivity::class.java
                    R.id.nav_item_share -> ShareActivity::class.java
                    R.id.nav_item_likes -> LikesActivity::class.java
                    R.id.nav_item_profile -> ProfileActivity::class.java
                    else -> {
                        Log.e(TAG, "unknown navigation item clicked $it")
                        null
                    }
                }
            if (nextActivity != null) {
                val nextIntent = Intent(this, nextActivity)
                nextIntent.flags = Intent.FLAG_ACTIVITY_NO_ANIMATION
                startActivity(nextIntent)
                overridePendingTransition(0, 0)
                true
            } else {

                false
            }
        }
        // bottom items replace
        bottom_navigation_view.menu.getItem(navNumber).isChecked = true
    }
}