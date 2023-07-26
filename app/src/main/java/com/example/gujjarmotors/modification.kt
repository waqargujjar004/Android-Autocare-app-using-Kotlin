package com.example.gujjarmotors

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.gujjarmotors.R.layout.activity_modification

class modification : AppCompatActivity() {

    private lateinit var newRecyclerView : RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_modification)

         val songobj = mutableListOf<song>()
        songobj.add(song("BodyKit","Rs 25000",R.drawable.bodykit25000))
        songobj.add(song("Android Lcd","Rs 20000",R.drawable.lcd15000))
        songobj.add(song("Air Press","Rs 3500",R.drawable.airpress3500))
        songobj.add(song("Chrome Handle","Rs 1650",R.drawable.chromehandle1650))
        songobj.add(song("Day Time Running Light","Rs 1200",R.drawable.drl1200))
        songobj.add(song("Fin Shape Antena","Rs 1750",R.drawable.finantena1750))
        songobj.add(song("Top Cover","Rs 4500",R.drawable.topcover4500))
        songobj.add(song("MAtt","Rs 6500",R.drawable.matt6500))
        songobj.add(song("Fog lamps","Rs 7800",R.drawable.foglamps7800))
        songobj.add(song("Alloycwheel","Rs 65000",R.drawable.alloywheel65000))
        songobj.add(song("Civic Rim","Rs 100000",R.drawable.cicicrim10000))
        songobj.add(song("Alloy Wheel","Rs 125000",R.drawable.civrim125000))


        val songs = listOf("hello","hi","hey","bye")
        newRecyclerView = findViewById(R.id.waqar)
        newRecyclerView.adapter = MyAdapter(songobj)
        newRecyclerView.layoutManager = LinearLayoutManager(this)

    }

}