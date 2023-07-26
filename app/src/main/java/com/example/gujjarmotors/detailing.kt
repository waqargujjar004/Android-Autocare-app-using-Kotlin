package com.example.gujjarmotors

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.room.Room
import com.example.gujjarmotors.roomDataBase.Contact
import com.example.gujjarmotors.roomDataBase.ContactDatabase

class detailing : AppCompatActivity() {

    lateinit var database : ContactDatabase
    lateinit var firstValueETdet: EditText
    lateinit var secondValueETdet: EditText
    lateinit var  Addbuttondet: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detailing)

        firstValueETdet = findViewById(R.id.namedet)
        secondValueETdet = findViewById(R.id.phonedet)
        Addbuttondet = findViewById(R.id.btndet)
        Addbuttondet.setOnClickListener {

            var cont =Contact(0,name =firstValueETdet.text.toString().trim(), phone = secondValueETdet.text.toString().trim())
            database =
                Room.databaseBuilder(applicationContext, ContactDatabase::class.java, "contactDB")
                    .allowMainThreadQueries().build()
            database.contactDao().insertContact(cont)
            Toast.makeText(applicationContext, "Your Record has been Succesfully submitted", Toast.LENGTH_SHORT).show();
        }
    }
}