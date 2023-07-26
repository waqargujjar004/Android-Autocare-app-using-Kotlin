package com.example.gujjarmotors.roomDataBase

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(entities =[Contact::class], version = 1)
abstract class ContactDatabase : RoomDatabase(){
    abstract fun contactDao() : ContactDao
}





