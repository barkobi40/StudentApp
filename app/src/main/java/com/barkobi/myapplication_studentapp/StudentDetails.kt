package com.barkobi.myapplication_studentapp

import android.os.Bundle
import android.os.PersistableBundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.view.menu.MenuView
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class StudentDetails : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.student_details)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        var studentName : TextView =  findViewById(R.id.name_text_view)
        var studentId : TextView = findViewById(R.id.id_text_view)
        var studentNumber : TextView = findViewById(R.id.number_text_view)
        var EditButton : Button = findViewById(R.id.edit_button)
        var CancelButton : Button = findViewById(R.id.cancel_button)
        var DeleteButton : Button = findViewById(R.id.delete_button2)

        studentName.text = intent.getStringExtra("name")
        studentId.text = intent.getStringExtra("id")
        studentNumber.text = intent.getStringExtra("number")
    }

}