package com.example.librarydbs

import androidx.appcompat.app.AppCompatActivity

class BusListOfDhaka: AppCompatActivity(){
    var busList: ArrayList<String> = ArrayList(listOf(*resources.getStringArray(R.array.bus_list)))
}