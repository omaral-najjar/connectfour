package com.example.connectfour

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class ViewScores : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_view_scores)
    }
    fun backtogameplay(view: View){
        val playersearch = Intent(this,Gameplay::class.java)
        startActivity(playersearch)
    }
}
