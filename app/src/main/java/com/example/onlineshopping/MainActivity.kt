package com.example.onlineshopping

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.onlineshopping.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var bind : ActivityMainBinding

    val personalUserID = "Ajay3131"
    var password = "Ajay@123"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        bind = ActivityMainBinding.inflate(layoutInflater)
        setContentView(bind.root)

        var newPassword = intent.getStringExtra("NewPassword")

        if (newPassword != null) {
            password = newPassword
        }



//  operation of login button and on words
        bind.loginButton.setOnClickListener{

            checkLoginCondition(bind.inputUserID.text.toString(),personalUserID)

        }


// operation of forget password text
        bind.forgotInput.setOnClickListener{
//            Toast.makeText(this, "This feature is not developed properly yet please do wait for sometime", Toast.LENGTH_LONG).show()

            var intent = Intent(this,forgotPassword::class.java)
            startActivity(intent)

        }

    }


//    other functions

    fun checkLoginCondition(inputUserID : String , actuallyUserID : String){

        if(inputUserID == actuallyUserID){
            checkLoginCondition1(bind.inputPassword.text.toString(),password)
        }
        else{
            Toast.makeText(this, "Incorrect UserID", Toast.LENGTH_SHORT).show()
        }

    }

    fun checkLoginCondition1(inputUserpass : String, actuallyUserpass: String){
        if(inputUserpass == actuallyUserpass){

            var intent = Intent(this , UserINFO::class.java)
            startActivity(intent)

        }
        else{
            Toast.makeText(this, "password don't match", Toast.LENGTH_SHORT).show()
        }
    }

}