package com.example.contacts.Repository

import androidx.lifecycle.LiveData
import com.example.contacts.models.Contact
import com.example.contacts.ContactsApp
import com.example.contacts.database.ContactsDatabase
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class ContactsRepository {
    val database = ContactsDatabase.getDatabase(ContactsApp.context)
    suspend fun saveContact(contact: Contact) {
        withContext(Dispatchers.IO) {
            database.contactDao().insertContact(contact)
        }
    }
    fun getAllContacts(): LiveData<List<Contact>> {
        return database.contactDao().getAllContacts()
    }
    fun getContactById(contactId: Int): LiveData<Contact> {
        return database.contactDao().getContactById(contactId)
    }
}