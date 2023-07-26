package com.example.gujjarmotors

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import androidx.room.Room
import com.example.gujjarmotors.roomDataBase.Contact
import com.example.gujjarmotors.roomDataBase.ContactDatabase

class inspection : AppCompatActivity() {
    lateinit var database : ContactDatabase
    lateinit var firstValueETins: EditText
    lateinit var secondValueETins: EditText

    lateinit var  Addbuttonins: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_inspection)

         firstValueETins = findViewById(R.id.nameins)
        secondValueETins = findViewById(R.id.phoneins)
        Addbuttonins = findViewById(R.id.btnins)
        var value1 :String = firstValueETins.text.toString()
        Addbuttonins.setOnClickListener {

            var cont =Contact(0,name =firstValueETins.text.toString().trim(), phone = secondValueETins.text.toString().trim())
            database =
                Room.databaseBuilder(applicationContext, ContactDatabase::class.java, "contactDB")
                    .allowMainThreadQueries().build()
            database.contactDao().insertContact(cont)
            Toast.makeText(applicationContext, "Your Record has been Succesfully submitted", Toast.LENGTH_SHORT).show();
        }
    }
}