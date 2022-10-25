package com.example.onlineshopping

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.cardview.widget.CardView
import androidx.core.content.ContextCompat.startActivity
import androidx.recyclerview.widget.RecyclerView


class AdapterRecyclerView(private val mContext: Context, val dataList: MutableList<USER_DATA>) : RecyclerView.Adapter<ViewHolder>() {

//    Create New Views

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.layoutrecycledview,parent,false)
        return ViewHolder(itemView)
    }

//    binds the list items to the  views
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        holder.name.text = dataList[position].name
    holder.cardView.setOnClickListener{
         val intent = Intent(mContext , UserINFO::class.java)
        intent.putExtra("name", dataList[position].name)
        intent.putExtra("age", dataList[position].age.toString())
        intent.putExtra("gender",dataList[position].gender)
        intent.putExtra("phone",dataList[position].phone.toString())
        intent.putExtra("address",dataList[position].address)
        mContext.startActivity(intent)
    }
    }

//    VIewHolder class

    override fun getItemCount(): Int {
        return dataList.size
    }



}
class ViewHolder(itemView : View) :RecyclerView.ViewHolder(itemView){

    var name: TextView = itemView.findViewById(R.id.userName)
    var cardView: CardView = itemView.findViewById(R.id.cardViewCalled)
}
