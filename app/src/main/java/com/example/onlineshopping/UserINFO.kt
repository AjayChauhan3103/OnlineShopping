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

        bind.logoutButton.setOnClickListener{
            var intent = Intent(this,MainActivity::class.java)
            startActivity(intent)
        }
    }
}