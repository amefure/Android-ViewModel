package com.example.viewmodel

import androidx.lifecycle.ViewModel

class MyViewModel:ViewModel() {

    public var count:Int = 0

    fun plus(){
        count++
    }
}