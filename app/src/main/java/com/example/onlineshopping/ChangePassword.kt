package com.example.onlineshopping

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.onlineshopping.databinding.ActivityChangePasswordBinding
import kotlin.concurrent.timer

class ChangePassword : AppCompatActivity() {

    lateinit var bind : ActivityChangePasswordBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        bind = ActivityChangePasswordBinding.inflate(layoutInflater)
        setContentView(bind.root)



        bind.ResetPasswordButton.setOnClickListener{

            val firstPassCheck = bind.FirstPassCheck.text.toString()
            val secondPassCheck = bind.FirstPassCheck.text.toString()

            if(firstPassCheck == secondPassCheck){

                Toast.makeText(this, "Password Reset Successfully", Toast.LENGTH_SHORT).show()

                val intent = Intent(this,MainActivity::class.java)
                intent.putExtra("NewPassword",secondPassCheck)
                startActivity(intent)

            }
            else {
                Toast.makeText(this, "Password didn't match", Toast.LENGTH_SHORT).show()
            }

        }

    }
}