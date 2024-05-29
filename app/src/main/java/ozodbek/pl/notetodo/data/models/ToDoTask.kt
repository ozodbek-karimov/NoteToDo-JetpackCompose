package ozodbek.pl.notetodo.data.models

import androidx.room.Entity
import androidx.room.PrimaryKey
import ozodbek.pl.notetodo.util.Constants.DATABASE_TABLE
import ozodbek.pl.notetodo.data.models.Priority

@Entity(tableName = DATABASE_TABLE)
data class ToDoTask(
    @PrimaryKey(autoGenerate = true)
    val id: Int = 0,
    val title: String,
    val description: String,
    val priority: Priority
)