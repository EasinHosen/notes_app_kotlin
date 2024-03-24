package com.kkeb.notesapp.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.kkeb.notesapp.model.Note

@Database(entities = [Note::class], version = 1)
abstract class NoteDB: RoomDatabase() {

    abstract fun getNoteDao(): NoteDao

    companion object{
        @Volatile
        private var instance: NoteDB? = null

        private val LOCK = Any()

        operator fun invoke(context: Context) = instance ?:
        synchronized(LOCK){
            instance ?:
            createDB(context).also{
                instance = it
            }
        }

        private fun createDB(context: Context) =
            Room.databaseBuilder(context.applicationContext, NoteDB::class.java, "notes_db").build()
    }
}