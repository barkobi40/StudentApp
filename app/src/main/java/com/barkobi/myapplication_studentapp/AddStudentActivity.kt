package com.barkobi.myapplication_studentapp

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.barkobi.myapplication_studentapp.R
import com.barkobi.myapplication_studentapp.model.Model
import com.barkobi.myapplication_studentapp.model.Student

class AddStudentActivity : AppCompatActivity() {

    var model = Model.shared.students
    var nameEditText: EditText? = null
    var idEditText: EditText? = null
    var numberEditText: EditText? = null
    var saveMessageTextView: TextView? = null
    var saveButton: Button? = null
    var cancelButton: Button? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_add_student)
        val rootLayout =
            findViewById<androidx.constraintlayout.widget.ConstraintLayout>(R.id.main_root_layout)
        ViewCompat.setOnApplyWindowInsetsListener(rootLayout) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        enableEdgeToEdge()


        saveButton= findViewById(R.id.add_student_activity_save_button)
        cancelButton= findViewById(R.id.add_student_activity_cancel_button)
        nameEditText = findViewById(R.id.add_student_activity_name_edit_text)
        idEditText = findViewById(R.id.add_student_activity_id_edit_text)
        numberEditText = findViewById(R.id.add_student_activity_number_edit_text)
        saveMessageTextView = findViewById(R.id.add_student_activity_text_message_edit_text)

        cancelButton?.setOnClickListener {
            finish()
        }

        saveButton?.setOnClickListener(::HandleAddStudent)

    }


    private fun HandleAddStudent(view: View) {
        var name = nameEditText?.text.toString()
        var id = idEditText?.text.toString()
        var number = numberEditText?.text.toString()

        var Student =
            Student(name = name, id = id, number = number, avatarURL = "", isChecked = false)

        model.add(Student)
        saveMessageTextView?.text =
            "${nameEditText?.text} (ID: ${idEditText?.text}, Phone: ${numberEditText?.text}) is saved!!!"

        finish()
    }
}

