package com.example.contacts.ViewModel

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.contacts.models.Contact
import com.example.contacts.Repository.ContactsRepository
import kotlinx.coroutines.launch

class ContactsViewModel : ViewModel() {
    var contactsRepository = ContactsRepository()
    lateinit var contactLiveData: LiveData<Contact>
    fun getContactById(contactId: Int) {
        contactLiveData = contactsRepository.getContactById(contactId)
    }
    fun saveContact(contact: Contact) {
        viewModelScope.launch {
            contactsRepository.saveContact(contact)
        }
    }
    fun getAllContacts(){
//        contactLiveData=contactsRepository.getAllContacts()
    }
}