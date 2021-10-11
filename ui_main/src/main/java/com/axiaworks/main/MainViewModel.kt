package com.axiaworks.main

import android.content.SharedPreferences
import android.util.Log
import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class MainViewModel
@Inject
constructor(
    private val prefs: SharedPreferences,
) : ViewModel() {

    fun hoge() {

        var num = prefs.getInt("count", 0)
        num++

        Log.e("test", "hoge: num: $num")

        prefs.edit().apply {
            putInt("count", num)
            apply()
        }

    }
}