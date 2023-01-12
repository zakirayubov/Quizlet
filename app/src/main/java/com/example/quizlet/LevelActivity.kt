package com.example.quizlet

import android.content.Intent
import android.os.Bundle
import android.view.MenuItem
import android.view.View
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


class LevelActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.game_levels)

        setSupportActionBar(findViewById(R.id.levelToolbar))
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.setDisplayShowHomeEnabled(true)


        changeLevel()
    }

    private fun changeLevel() {

        val level1: TextView = findViewById(R.id.level1)
        level1.setOnClickListener(View.OnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            intent.putExtra("levelNum", "Level 1")
            startActivity(intent)
        })

        val level2: TextView = findViewById(R.id.level2)
        level2.setOnClickListener(View.OnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            intent.putExtra("levelNum", "Level 2")
            startActivity(intent)
        })

        val level3: TextView = findViewById(R.id.level3)
        level3.setOnClickListener(View.OnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            intent.putExtra("levelNum", "Level 3")
            startActivity(intent)
        })

        val level4: TextView = findViewById(R.id.level4)
        level4.setOnClickListener(View.OnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            intent.putExtra("levelNum", "Level 4")
            startActivity(intent)
        })

        val level5: TextView = findViewById(R.id.level5)
        level5.setOnClickListener(View.OnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            intent.putExtra("levelNum", "Level 5")
            startActivity(intent)
        })

        val level6: TextView = findViewById(R.id.level6)
        level6.setOnClickListener(View.OnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            intent.putExtra("levelNum", "Level 6")
            startActivity(intent)
        })

        val level7: TextView = findViewById(R.id.level7)
        level7.setOnClickListener(View.OnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            intent.putExtra("levelNum", "Level 7")
            startActivity(intent)
        })

        val level8: TextView = findViewById(R.id.level8)
        level8.setOnClickListener(View.OnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            intent.putExtra("levelNum", "Level 8")
            startActivity(intent)
        })

        val level9: TextView = findViewById(R.id.level9)
        level9.setOnClickListener(View.OnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            intent.putExtra("levelNum", "Level 9")
            startActivity(intent)
        })

        val level10: TextView = findViewById(R.id.level10)
        level10.setOnClickListener(View.OnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            intent.putExtra("levelNum", "Level 10")
            startActivity(intent)
        })

        val level11: TextView = findViewById(R.id.level11)
        level11.setOnClickListener(View.OnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            intent.putExtra("levelNum", "Level 11")
            startActivity(intent)
        })

        val level12: TextView = findViewById(R.id.level12)
        level12.setOnClickListener(View.OnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            intent.putExtra("levelNum", "Level 12")
            startActivity(intent)
        })

        val level13: TextView = findViewById(R.id.level13)
        level13.setOnClickListener(View.OnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            intent.putExtra("levelNum", "Level 13")
            startActivity(intent)
        })

        val level14: TextView = findViewById(R.id.level14)
        level14.setOnClickListener(View.OnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            intent.putExtra("levelNum", "Level 14")
            startActivity(intent)
        })

        val level15: TextView = findViewById(R.id.level15)
        level15.setOnClickListener(View.OnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            intent.putExtra("levelNum", "Level 15")
            startActivity(intent)
        })
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        // handle arrow click here
        if (item.itemId == android.R.id.home) {
            finish() // close this activity and return to preview activity (if there is any)
        }
        return super.onOptionsItemSelected(item)
    }

}