package com.example.hng8_20

import android.content.Intent
import android.media.Image
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView
import java.util.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val displayButton = findViewById<Button>(R.id.displayBtn)

        //This takes input from the user
        val name: EditText = findViewById(R.id.editText)

        //This will display the input text
        val getName: TextView = findViewById(R.id.displayView)

        //button display text that is entered by the user
        displayButton.setOnClickListener {

            val str:String = name.text.toString()

            getName.text = str

        }


        //This will make the zuri.team clickable lunching url

        var imageView: ImageView = findViewById(R.id.zuriImageView)
        imageView.run {
            setOnClickListener(View.OnClickListener {
                val locale: Any? = null
                val uri = String.format(locale as Locale?, "https://zuri.team/")
                val intent = Intent(Intent.ACTION_VIEW, Uri.parse(uri))
                startActivity(intent)
            })
        }

        //This will make the HNG clickable lunching url

        var image2View: ImageView = findViewById(R.id.hngImage)
        image2View.run {
            setOnClickListener(View.OnClickListener {
                val locale: Any? = null
                val uri = String.format(locale as Locale?, "https://hng.tech/")
                val intent = Intent(Intent.ACTION_VIEW, Uri.parse(uri))
                startActivity(intent)
            })
        }


    }


}