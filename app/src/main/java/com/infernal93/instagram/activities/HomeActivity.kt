package com.infernal93.instagram.activities

import android.content.Intent
import android.os.Bundle
import android.util.Log
import com.google.firebase.auth.FirebaseAuth
import com.infernal93.instagram.R
import kotlinx.android.synthetic.main.activity_home.*

class HomeActivity : BaseActivity(navNumber = 0) {
    private val TAG = "HomeActivity"

    private lateinit var mAuth: FirebaseAuth

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
        Log.d(TAG, "onCreate")
        setupBottomNav()


        mAuth = FirebaseAuth.getInstance()
        sign_out_text.setOnClickListener {
            mAuth.signOut()
        }
        mAuth.addAuthStateListener {
            if (it.currentUser == null) {
                startActivity(Intent(this, LoginActivity::class.java))
                finish()
            }
        }
        // mAuth.signInWithEmailAndPassword("armdev19@gmail.com", "123456")
        //   .addOnCompleteListener {
        //     if(it.isSuccessful) {
        //       Log.d(TAG, "signIn: success")
        // } else Log.e(TAG, "signIn: failure", it.exception)
        // }

    }

    override fun onStart() {
        super.onStart()
        if (mAuth.currentUser == null) {
            startActivity(Intent(this, LoginActivity::class.java))
            finish()
        }
    }
}
