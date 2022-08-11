package com.dreamplay.white

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import com.dreamplay.R

class Game : AppCompatActivity(),GameInt {
    lateinit var  rootLayout: LinearLayout
    lateinit var startBtn: ImageView
    lateinit var mGameView:Games
    lateinit var score: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_game)
        startBtn=findViewById(R.id.start_btn)
        rootLayout=findViewById(R.id.rootL)
        score=findViewById(R.id.scoreView)
        mGameView=Games(this,this)
        startBtn.setOnClickListener{

            rootLayout.addView(mGameView)
            startBtn.visibility= View.GONE
            score.visibility= View.GONE

        }
    }

    override fun closeGame(mScore: Int) {
        score.text="Score : $mScore"
        rootLayout.removeView(mGameView)
        startBtn.visibility= View.VISIBLE
        score.visibility= View.VISIBLE



    }

}