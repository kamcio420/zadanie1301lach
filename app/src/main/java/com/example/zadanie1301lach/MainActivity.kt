package com.example.zadanie1301lach

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.core.view.get
import com.google.android.material.textfield.TextInputLayout

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var x = 0;
        findViewById<Button>(R.id.buttonleft).setOnClickListener {
            if (x<4) {
                x += 1;
                if (x == 1) {
                    findViewById<ImageView>(R.id.imageView).setImageResource(R.drawable.zyzz1)
                }
                if (x == 2) {
                    findViewById<ImageView>(R.id.imageView).setImageResource(R.drawable.zyzz2)
                }
                if (x == 3) {
                    findViewById<ImageView>(R.id.imageView).setImageResource(R.drawable.zyzz3)

                }
                if (x == 4) {
                    findViewById<ImageView>(R.id.imageView).setImageResource(R.drawable.zyzz4)
                }
            }

        }
        findViewById<Button>(R.id.buttonright).setOnClickListener {
            if (x != 0) {
                x -= 1;
                if (x == 1) {
                    findViewById<ImageView>(R.id.imageView).setImageResource(R.drawable.zyzz1)
                }
                if (x == 2) {
                    findViewById<ImageView>(R.id.imageView).setImageResource(R.drawable.zyzz2)
                }
                if (x == 3) {
                    findViewById<ImageView>(R.id.imageView).setImageResource(R.drawable.zyzz3)
                }
                if (x == 4) {
                    findViewById<ImageView>(R.id.imageView).setImageResource(R.drawable.zyzz4)
                }
            }
        }


    }
}