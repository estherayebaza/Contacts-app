package com.example.contacts.ViewModel
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.contacts.Repository.NotesRepository
import com.example.contacts.models.Note

import kotlinx.coroutines.launch

class NotesViewModel():ViewModel() {
    var notesRepository= NotesRepository()

    fun saveNote(note: Note){
        viewModelScope.launch {
            notesRepository.saveNote(note)
        }
    }
}
