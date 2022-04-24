package com.example.kotlinsharedprefrences

import android.content.Context
import android.content.SharedPreferences
import android.support.v4.app.INotificationSideChannel
import android.view.Display

class PrefrencesProvider(context:Context)
{
    private val preferences=context.getSharedPreferences("pref",0)
    fun putBoolean(key:String,value:Boolean)
    {
        preferences.edit().putBoolean(key,value).apply()
    }
    fun putString(key: String,value: String)
    {
        preferences.edit().putString(key,value).apply()
    }
    fun putInt(key: String,value: Int){
        preferences.edit().putInt(key,value).apply()
    }

    fun getStringValue(value:String):String{
        return preferences.getString(value,"").toString()
    }



}