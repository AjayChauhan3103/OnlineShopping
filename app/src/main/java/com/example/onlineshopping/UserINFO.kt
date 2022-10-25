package com.example.onlineshopping

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.onlineshopping.databinding.ActivityMainBinding
import com.example.onlineshopping.databinding.ActivityUserInfoBinding

class UserINFO : AppCompatActivity() {

    lateinit var bind : ActivityUserInfoBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        bind = ActivityUserInfoBinding.inflate(layoutInflater)
        setContentView(bind.root)

        val NAME = intent.getStringExtra("name")
        bind.nameTextView.text="Name: $NAME"

        val AGE = intent.getStringExtra("age")
        bind.ageTextView.text="Age: $AGE"

        val GENDER = intent.getStringExtra("gender")
        bind.genderTExtView.text="Gender: $GENDER"

        val PHONE = intent.getStringExtra("phone")
        bind.phoneNumTextView.text="Phone Number: $PHONE"

            val ADDRESS = intent.getStringExtra("address")
        bind.addressTextView.text="Address: $ADDRESS"


        bind.logoutButton.setOnClickListener{
            var intent = Intent(this,MainActivity::class.java)
            startActivity(intent)
        }
    }
}