package com.example.contacts

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import com.example.contacts.UI.contactDetails
import com.example.contacts.models.Contact

import com.squareup.picasso.Picasso

class ContactsAdapter(var contactList:List<Contact>, var context:Context):RecyclerView.Adapter<ContactViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ContactViewHolder {
        var itemView= LayoutInflater.from(parent.context).inflate(R.layout.contact_list_item,parent,false)
        return ContactViewHolder(itemView)
    }
        override fun onBindViewHolder(holder: ContactViewHolder, position: Int) {
         var currentContact=contactList.get(position)
            holder.tvName.text=currentContact.name
            holder.tvEmail.text=currentContact.email
            holder.tvPhoneNumber.text=currentContact.phoneNumber


            Picasso.get()
                .load(currentContact.imageUrl)
                .resize(80,80)
                .centerCrop()
                .into(holder.imageView)
            holder.rvContact.setOnClickListener {
                var intent= Intent(context, contactDetails::class.java)

                intent.putExtra("name",currentContact.name)

                context.startActivity(intent)
            }

        }

        override fun getItemCount(): Int {
          return contactList.size
        }
    }
        class ContactViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
            var tvName=itemView.findViewById<TextView>(R.id.tvName)
            var tvEmail=itemView.findViewById<TextView>(R.id.tvEmail)
            var tvPhoneNumber=itemView.findViewById<TextView>(R.id.tvPhoneNumber)
            var imageView=itemView.findViewById<ImageView>(R.id.imageView)
            var rvContact=itemView.findViewById<CardView>(R.id.rvContacts)


            }