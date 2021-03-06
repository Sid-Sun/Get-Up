package com.sidsun.getup2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private var isInInspireMode: Boolean = true

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun ack(view: View?) { // Do something in response to button
        if (isInInspireMode) {
            val newTextViewText: CharSequence = "SO THAT WE CAN LEARN TO PICK OURSELVES UP, INDEED."
            textView.text = newTextViewText
            val newButtonText: CharSequence = "RESET"
            button.text = newButtonText
            isInInspireMode = false
        } else {
            val newTextViewText: CharSequence = "WHY DO WE FALL?"
            textView.text = newTextViewText
            val newButtonText: CharSequence = "SO THAT WE CAN LEARN TO PICK OURSELVES UP"
            button.text = newButtonText
            isInInspireMode = true
        }
    }

}
