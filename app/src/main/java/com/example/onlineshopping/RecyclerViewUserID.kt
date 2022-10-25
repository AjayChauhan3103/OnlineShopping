package com.example.onlineshopping

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.DefaultItemAnimator
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.onlineshopping.databinding.ActivityRecyclerViewUserIdBinding

class RecyclerViewUserID : AppCompatActivity() {

    lateinit var bind : ActivityRecyclerViewUserIdBinding

    var userDATA : MutableList<USER_DATA> = mutableListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        bind = ActivityRecyclerViewUserIdBinding.inflate(layoutInflater)
        setContentView(bind.root)


        userDATA.add(USER_DATA("Ajay Chauhan",22,"Male",1234567890,"Palam, New Delhi"))
        userDATA.add(USER_DATA("Prakash Singh Kunwar",22,"Male",1234567890,"Haldwani, Uttarkand"))
        userDATA.add(USER_DATA("Nayan Boro", 23,"Male",1234567890,"Batabari, Assam"))
        userDATA.add(USER_DATA("Abhishek Pal",23,"Male", 1234567890,"Prayag Raj, Uttar Pradesh"))
        userDATA.add(USER_DATA("Manendra Singh Tripathi",28,"Male",1234567890,"Bhopal, Madhya Pradesh"))
        userDATA.add(USER_DATA("Manish Chhetri",28,"Male",1234567890,"West Bengal"))
        userDATA.add(USER_DATA("Mohammad Rasul",28,"Male",1234567890,"Moradabad, Uttar Pradesh"))
        userDATA.add(USER_DATA("Pappu Bhaiya",28,"Male",1234567890,"Lucknow, Uttar Pradesh"))
        userDATA.add(USER_DATA("Kushal Singh",25,"Male",1234567890,"Palam, New Delhi"))

//       defined layout

        val layoutManager = LinearLayoutManager(applicationContext)
        bind.recyclerUserInfo.layoutManager = layoutManager
        bind.recyclerUserInfo.itemAnimator = DefaultItemAnimator()

//       definer Adapter

        var adapter = AdapterRecyclerView(this,userDATA)
        bind.recyclerUserInfo.adapter = adapter
        adapter.notifyDataSetChanged()

    }
}