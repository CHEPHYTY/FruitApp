package com.example.listviewproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import org.w3c.dom.Text

class FruitStory : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fruit_story)

        val fruitImg = intent.getIntExtra("Image", R.drawable.apple)
        val fruitTit = intent.getStringExtra("name")
        val fruitDes = intent.getStringExtra("Description")
        val fruitTime = intent.getStringExtra("Time")
        val fruitTag = intent.getStringExtra("Tag")
        val fruitStory = intent.getStringExtra("Story")

        var fImage = findViewById<ImageView>(R.id.FrImg)
        var fTitle = findViewById<TextView>(R.id.FTitle)
        var fDescription = findViewById<TextView>(R.id.FDes)
        var fTime = findViewById<TextView>(R.id.FTime)
        var fTag = findViewById<TextView>(R.id.FTag)
        var fStory = findViewById<TextView>(R.id.FStory)


        fImage.setImageResource(fruitImg)
        fTitle.text = fruitTit
        fDescription.text = fruitDes
        fTime.text = fruitTime
        fTag.text = fruitTag
        fStory.text = fruitStory



    }
}