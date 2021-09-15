package com.example.contacts.UI

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.isEmpty
import com.example.contacts.ViewModel.ContactsViewModel
import com.example.contacts.databinding.ActivityAddContactBinding
import com.example.contacts.models.Contact


class AddContactActivity : AppCompatActivity() {
    val contactsViewModel: ContactsViewModel by viewModels()
    lateinit var binding: ActivityAddContactBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityAddContactBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    override fun onResume() {
        super.onResume()
        binding.btnsavecontact.setOnClickListener {
            validateContact()
        }
    }
    fun validateContact(){
        binding.tilname.error=null
        binding.tilphone.error=null
        binding.tilemail.error=null
        var name=binding.tilname
        var phone=binding.tilphone
        var email=binding.tilemail
        var error=false
        if (name.isEmpty() ){
            error=true
            binding.tilname.error="Name is required"
        }
        if(phone.isEmpty()){
            error=true
            binding.tilphone.error="Phonenumber is required"
        }
        if(email.isEmpty()){
            error=true
            binding.tilemail.error="Email is required"
        }
//        if(!error){
//            contactsViewModel.saveContact(Contacts)
//            binding.tilname.setText("")
//            binding.tilemail.setText("")
//            binding.tilphone.setText("")
        }

    }
