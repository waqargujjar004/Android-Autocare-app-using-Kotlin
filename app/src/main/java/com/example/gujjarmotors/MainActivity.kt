package com.example.gujjarmotors

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import com.example.gujjarmotors.gridview

class MainActivity : AppCompatActivity() {

    private lateinit var buttonfirst:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        connectors()

    }

    private fun connectors() {
        buttonfirst = findViewById(R.id.nextscreenbut)


        buttonfirst.setOnClickListener()
        {
            movetomodsscreen()
        }
    }

    private fun movetomodsscreen() {

        try
        {
            var objIntent =Intent(MainActivity@this,gridview::class.java)
            startActivity(objIntent)
        }
        catch (ex:Exception)
        {
            Toast.makeText(MainActivity@this, "modsScreen: ${ex.message}", Toast.LENGTH_SHORT).show();
        }

    }
}