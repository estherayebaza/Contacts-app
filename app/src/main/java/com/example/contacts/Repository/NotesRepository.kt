package com.example.contacts.Repository

import androidx.lifecycle.LiveData
import com.example.contacts.ContactsApp
import com.example.contacts.database.ContactsDatabase
import com.example.contacts.models.Note
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class NotesRepository {
    val database = ContactsDatabase.getDatabase(ContactsApp.context)
    suspend fun saveNote(note: Note) {
        withContext(Dispatchers.IO) {
            database.noteDao().insertNote(note)
        }
    }
    fun getAllNotes(): LiveData<List<Note>> {
        return database.NoteDao().getAllNotes()
    }
    suspend fun getNoteById(nodeId: Int): LiveData<Note> {
        return database.NoteDao().getNoteById(noteId)
    }
}
