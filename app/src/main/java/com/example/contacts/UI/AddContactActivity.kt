package com.example.contacts.UI

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import com.example.contacts.models.Contact
import com.example.contacts.R
import com.example.contacts.ViewModel.ContactsViewModel

class AddContactActivity : AppCompatActivity() {
    val contactViewModel: ContactsViewModel by viewModels()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_view_contact)
    }
    override fun onResume() {
        super.onResume()
        binding.btnSave.setOnClickListener{
            saveContact()
        }
    }

    fun validateContact(){
        var name = binding.etName.text.toString()
        var phone = binding.etName.text.toString()
        var email = binding.etName.text.toString()
        var contact = Contact(0, name, phone, email, "")
        contactViewModel.saveContact(contact)

    }
    if(name.isEmpty()|| name isBlank()){
        error=true
        binding.tilName.error="Name is required"
    }
}