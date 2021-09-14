package com.example.contacts.UI

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.activity.viewModels
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.contacts.models.Contact
import com.example.contacts.ContactsAdapter
import com.example.contacts.R
import com.example.contacts.ViewModel.ContactsViewModel
import com.example.contacts.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding

    val contactViewModel: ContactsViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        contactViewModel.getContactById(2)
    }

    fun displayContacts(contactsList: List<Contact>){
        binding.rvContacts
        var contactsAdapter= ContactsAdapter(contactsList,baseContext)
        binding.rvContacts.apply {
            layoutManager=LinearLayoutManager(baseContext)
            binding.rvContacts.adapter=contactsAdapter
        }
    }
    override fun onResume() {
        super.onResume()
        contactViewModel.contactLiveData.observe(this, {contact->
            if (contact!=null){
                Toast.makeText(this, contact.name, Toast.LENGTH_LONG).
                show()
            }
        })
        binding.rvContacts.setOnClickListener {
            startActivity(Intent(this,AddContactActivity::class.java))
        }

    }

}

