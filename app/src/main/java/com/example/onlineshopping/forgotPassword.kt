package com.example.onlineshopping

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.example.onlineshopping.databinding.ActivityForgotPasswordBinding

class forgotPassword : AppCompatActivity() {



    private lateinit var bind : ActivityForgotPasswordBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        bind = ActivityForgotPasswordBinding.inflate(layoutInflater)
        setContentView(bind.root)





        bind.checkButton.setOnClickListener{
            var CheckUserID = bind.confirmUserIDText.text.toString()
            if(CheckUserID == "Ajay3131"){


                var intent = Intent(this,ChangePassword::class.java)
                startActivity(intent)

            }
            else{
                Toast.makeText(this, "entered invalid UserID", Toast.LENGTH_SHORT).show()
            }
        }

    }
}