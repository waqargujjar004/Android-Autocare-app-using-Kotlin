package com.example.gujjarmotors.roomDataBase

import androidx.room.Entity
import androidx.room.PrimaryKey
import org.w3c.dom.Text

@Entity  (tableName ="Contact" )
data class Contact(
    @PrimaryKey(autoGenerate = true)
    val id :Long,
    val name: String,
    val phone: String


)
