package com.barkobi.myapplication_studentapp

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.barkobi.myapplication_studentapp.R

class AddStudentActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_add_student)

        enableEdgeToEdge()

        val saveButton: Button = findViewById(R.id.add_student_activity_save_button)
        val cancelButton: Button = findViewById(R.id.add_student_activity_cancel_button)
        val nameEditText: EditText = findViewById(R.id.add_student_activity_name_edit_text)
        val idEditText: EditText = findViewById(R.id.add_student_activity_id_edit_text)
        val numberEditText: EditText = findViewById(R.id.add_student_activity_number_edit_text)
        val saveMessageTextView: TextView = findViewById(R.id.add_student_activity_text_message_edit_text)

        val rootLayout = findViewById<androidx.constraintlayout.widget.ConstraintLayout>(R.id.main_root_layout)

        ViewCompat.setOnApplyWindowInsetsListener(rootLayout) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        cancelButton.setOnClickListener {
            finish()
        }

        saveButton.setOnClickListener {
            saveMessageTextView.text =
                "${nameEditText.text} (ID: ${idEditText.text}, Phone: ${numberEditText.text}) is saved!!!"
        }
    }
}
