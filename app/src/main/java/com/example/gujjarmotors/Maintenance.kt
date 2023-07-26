package com.example.gujjarmotors

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.room.Room
import com.example.gujjarmotors.roomDataBase.Contact
import com.example.gujjarmotors.roomDataBase.ContactDatabase

class Maintenance : AppCompatActivity() {
    lateinit var database : ContactDatabase
    lateinit var firstValueET: EditText
    lateinit var secondValueET:EditText
    lateinit var  Addbutton: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_maintenance)

        firstValueET = findViewById(R.id.f_value_et)
        secondValueET = findViewById(R.id.first_value_et)
        Addbutton = findViewById(R.id.addbtn)
        //var value1 :String = firstValueET.text.toString().trim()
        Addbutton.setOnClickListener {

var cont =Contact(0,name =firstValueET.text.toString().trim(), phone = secondValueET.text.toString().trim())
            database =
                Room.databaseBuilder(applicationContext, ContactDatabase::class.java, "contactDB")
                    .allowMainThreadQueries().build()
            database.contactDao().insertContact(cont)

            Toast.makeText(applicationContext, "Your Record has been Succesfully submitted", Toast.LENGTH_SHORT).show();
        }


    }
}