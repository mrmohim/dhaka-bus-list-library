package com.example.librarydbs

import android.view.View

class BusListOfDhaka{
    fun BusList(view: View): ArrayList<String> {
        return ArrayList(listOf(*view.resources.getStringArray(R.array.bus_list)))
    }
}