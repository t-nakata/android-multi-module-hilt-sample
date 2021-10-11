package com.axiaworks.sub

import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class SubActivity : AppCompatActivity() {

    @Inject lateinit var prefs: SharedPreferences

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sub)

        findViewById<Button>(R.id.button).apply {
            setOnClickListener {
                var num = prefs.getInt("count", 0)
                num++

                Log.e("test", "hoge: num: $num")

                prefs.edit().apply {
                    putInt("count", num)
                    apply()
                }
            }
        }
    }
}