package com.infernal93.instagram.activities

import android.content.Context
import android.util.Log
import android.widget.Toast
import com.google.firebase.database.DataSnapshot
import com.google.firebase.database.DatabaseError
import com.google.firebase.database.ValueEventListener
import java.time.Duration

class ValueEventListenerAdapter(val handler: (DataSnapshot) -> Unit) : ValueEventListener {
    private val TAG = "ValueEventListenerAdapt"

    override fun onDataChange(data: DataSnapshot) {
        handler(data)
    }


    override fun onCancelled(error: DatabaseError) {
        Log.e(TAG, "onCancelled: ", error.toException())
    }
}

fun Context.showToastShort(text: String, duration: Int = Toast.LENGTH_SHORT) {
    Toast.makeText(this, text, duration).show()
}

fun Context.showToastLong(text: String, duration: Int = Toast.LENGTH_LONG) {
    Toast.makeText(this, text, duration).show()
}