package com.example.contacts.database

import androidx.lifecycle.LiveData
import androidx.room.*
import com.example.contacts.models.Note

@Dao

interface NoteDao {

        @Insert(onConflict = OnConflictStrategy.REPLACE)
        fun insertNote(note: Note)

        @Query("SELECT * FROM Contacts")
        fun getAllNotes(): LiveData<List<Note>>

        @Query("SELECT * FROM Notes WHERE noteId = :noteId")
        fun getNotesById(noteId: Int): LiveData<Note>


        @Delete
        fun deleteNotes(contact:Note)



}