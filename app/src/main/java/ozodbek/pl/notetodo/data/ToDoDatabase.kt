package ozodbek.pl.notetodo.data

import androidx.room.Database
import androidx.room.RoomDatabase
import ozodbek.pl.notetodo.data.ToDoDao
import ozodbek.pl.notetodo.data.models.ToDoTask

@Database(entities = [ToDoTask::class], version = 1, exportSchema = false)
abstract class ToDoDatabase: RoomDatabase() {

    abstract fun toDoDao(): ToDoDao

}