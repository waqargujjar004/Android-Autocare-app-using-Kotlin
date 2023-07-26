package com.example.gujjarmotors.GridView

import android.content.Context
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView
import com.example.gujjarmotors.R

class LanguageItem(var context: Context, var arrayList:ArrayList<GridAdapter>) : BaseAdapter() {
    override fun getCount(): Int {
        return arrayList.size
    }

    override fun getItem(position: Int): Any {
        return arrayList.get(position)
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        var view: View = View.inflate(context, R.layout.grid_item_list,null)

        var  icons: ImageView = view.findViewById(R.id.icons)
        var  name1: TextView = view.findViewById(R.id.name_text_view)

        var languageItem:GridAdapter = arrayList.get(position)

        icons.setImageResource(languageItem.icons!!)
        name1.text = languageItem.name



        return view
    }

}