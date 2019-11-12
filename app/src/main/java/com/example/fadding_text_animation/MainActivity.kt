package com.example.fadding_text_animation

import androidx.appcompat.app.AppCompatActivity

import android.os.Bundle
import android.view.View

import com.tomer.fadingtextview.FadingTextView
import kotlinx.android.synthetic.main.activity_main.*

import java.util.concurrent.TimeUnit

class MainActivity : AppCompatActivity() {
/*
add following dependency in gradle
    implementation'com.tomer:fadingtextview:2.5'


* Create values/array.xml where we will declared our array data.
* Attention: if we create arrays.xml instead of array.xml then it will not work.
* in main.xml we declare it as app:texts tag.
* and also declare timeout for our animation.
* */
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
}

    fun startExample2(v: View) {
        val example2 = arrayOf("And", "This", "is", "Example2")
        fadding.setTexts(example2)
        fadding.setTimeout(300, TimeUnit.MILLISECONDS)
    }
    fun startExample3(v: View){
        val example3= arrayOf("And","This","is","Example3")
        fadding.setTexts(example3)
        fadding.setTimeout(300,TimeUnit.MILLISECONDS)
    }
}
