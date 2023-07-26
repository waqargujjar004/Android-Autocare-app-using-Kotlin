package com.example.gujjarmotors

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.GridView
import android.widget.Toast
import com.example.gujjarmotors.GridView.GridAdapter
import com.example.gujjarmotors.GridView.LanguageItem


class gridview : AppCompatActivity() , AdapterView.OnItemClickListener {
    private lateinit  var  gridview: GridView
    private lateinit var arrayList:ArrayList<GridAdapter>
    private lateinit var langugaeAdapter: LanguageItem

    //lateinit var   obj :Adapterg
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_gridview2)
//
//        gridview = findViewById(R.id.gridvw)
//       // obj = Adapterg(applicationContext)
//       // gridview.adapter= obj
//
//       var  obj = Adapterg(this);
//       //gridview.adapter = obj;
//        gridview.setAdapter(obj);

        gridview=findViewById(R.id.gridview)
        arrayList = ArrayList()
        arrayList=setDataList()
        langugaeAdapter = LanguageItem(applicationContext,arrayList)
        gridview.adapter = langugaeAdapter
        gridview.onItemClickListener = this


    }

    private fun setDataList(): ArrayList<GridAdapter>
    {
        var arrayList:ArrayList<GridAdapter> = ArrayList()
        arrayList.add(GridAdapter(R.drawable.modification,"For Modifications Click Here"))
        arrayList.add(GridAdapter(R.drawable.detailing,"For Detailing Click Here"))
        arrayList.add(GridAdapter(R.drawable.maintenance,"For Maintenance Click Here"))
        arrayList.add(GridAdapter(R.drawable.inspection,"For Inspection Click Here"))


        return arrayList
    }

    override fun onItemClick(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
        if(p2==0)

        {
            var objIntent = Intent(gridview@this,modification::class.java)
            startActivity(objIntent)
        }

        if(p2==1)

      {
          var objIntent = Intent(gridview@this,detailing::class.java)
          startActivity(objIntent)
      }
        if(p2==2)

        {
            var objIntent = Intent(gridview@this,Maintenance::class.java)
            startActivity(objIntent)
        }
        if(p2==3)

        {
            var objIntent = Intent(gridview@this,inspection::class.java)
            startActivity(objIntent)
        }

    }
}