package com.example.sportsreport

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Window
import kotlinx.android.synthetic.main.activity_main.*
import java.util.logging.Handler

class MainActivity : AppCompatActivity() {
     lateinit var handler:Handler
    override fun onCreate(savedInstanceState: Bundle?) {
     //title rmoving line
        requestWindowFeature(Window.FEATURE_NO_TITLE)
        supportActionBar?.hide()

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        iv_notes.alpha=0f
        iv_notes.animate().setDuration(1000).alpha(1f).withEndAction{
            val i=Intent(this,SelectionActivity::class.java)
            startActivity(i)
            overridePendingTransition(android.R.anim.fade_in,android.R.anim.fade_out)
            finish()
        }

    }


}
