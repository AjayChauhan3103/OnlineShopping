package com.example.onlineshopping

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.onlineshopping.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var bind : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        bind = ActivityMainBinding.inflate(layoutInflater)
        setContentView(bind.root)




//  operation of login button and on words
        bind.loginButton.setOnClickListener{
            checkLoginCondition(bind.inputUserID.text.toString(),"Ajay3131")

        }

// operation of forget password text
        bind.forgotInput.setOnClickListener{
            Toast.makeText(this, "This feature is not developed properly yet please do wait for sometime", Toast.LENGTH_LONG).show()
        }
    }
    fun checkLoginCondition(inputUserID : String , actuallyUserID : String){

        if(inputUserID == actuallyUserID){
            Toast.makeText(this, "userID match", Toast.LENGTH_SHORT).show()
            checkLoginCondition1(bind.inputPassword.text.toString(),"Ajay@1234")
        }
        else{
            Toast.makeText(this, "Incorrect UserID", Toast.LENGTH_SHORT).show()
        }

    }

    fun checkLoginCondition1(inputUserpass : String, actuallyUserpass: String){
        if(inputUserpass == actuallyUserpass){
            Toast.makeText(this , "password match", Toast.LENGTH_SHORT).show()
        }
        else{
            Toast.makeText(this, "password don't match", Toast.LENGTH_SHORT).show()
        }
    }

}