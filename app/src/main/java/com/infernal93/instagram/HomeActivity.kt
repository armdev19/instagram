package com.infernal93.instagram

import android.os.Bundle
import android.util.Log
import com.google.firebase.auth.FirebaseAuth

class HomeActivity : BaseActivity(navNumber = 0) {
    private val TAG = "HomeActivity"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
        Log.d(TAG, "onCreate")
        setupBottomNav()

        val auth = FirebaseAuth.getInstance()
        auth.signInWithEmailAndPassword("armdev19@gmail.com", "123456")
            .addOnCompleteListener {
                if(it.isSuccessful) {
                    Log.d(TAG, "signIn: success")
                } else Log.e(TAG, "signIn: failure", it.exception)
            }

    }
}
