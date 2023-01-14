package com.example.gson

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.google.gson.Gson

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //создал Gson
        val gson = Gson()
        // Создал объект Data
        val myData = Data()
        //Преобразуем в Gson
        val input = gson.toJson(myData)
        println("!!! $input")
        // Достаём из Gson
        val output = gson.fromJson(input, Data::class.java)
        println("!!! $output")


//        val bad = BagOfPrimitives ()  //
//        val gson = Gson ()
//        val input = gson.toJson(bad)
//        println("!!! $input")
//        val output = gson.fromJson(input,BagOfPrimitives::class.java )
//        println("!!! $output")
    }

}

//internal class BagOfPrimitives {
//    private val value1 = 1
//    private val value2 = "abc"
//
//    @Transient
//    private val value3 = 3
//}