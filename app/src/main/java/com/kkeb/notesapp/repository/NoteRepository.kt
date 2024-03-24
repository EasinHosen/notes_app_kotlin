package com.kkeb.notesapp.repository

import com.kkeb.notesapp.database.NoteDB
import com.kkeb.notesapp.model.Note

class NoteRepository(private val db: NoteDB) {
    suspend fun addNote(note: Note) = db.getNoteDao().insertNote(note)
    suspend fun updateNote(note: Note) = db.getNoteDao().updateNote(note)
    suspend fun deleteNote(note: Note) = db.getNoteDao().deleteNote(note)

    fun getAllNotes() = db.getNoteDao().getAllNotes()
    fun searchNote(query: String?) = db.getNoteDao().searchNote(query)
}