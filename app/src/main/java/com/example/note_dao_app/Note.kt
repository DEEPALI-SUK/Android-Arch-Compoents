package com.example.note_dao_app

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "notes_table")
class Note(@ColumnInfo(name = "text")val text:String){
    @PrimaryKey(autoGenerate = true) var id = 0
}


