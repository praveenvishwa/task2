package com.example.ieeetask2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_increment_counter.*

class IncrementCounter : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_increment_counter)

        var increment_number =0;

        btn.setOnClickListener{

            increment_number++

            tx.text=increment_number.toString();
        }
    }
}
