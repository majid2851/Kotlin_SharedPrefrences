package com.example.kotlinsharedprefrences

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity()
{
    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var pref=PrefrencesProvider(this)

        pref.putString("mag","2851")

        Log.i("mag2851",pref.getStringValue("mag"))


    }
}