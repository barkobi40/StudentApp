package com.barkobi.myapplication_studentapp.model

import java.util.ArrayList

class Model private constructor() {
    val students : MutableList<Student>  = ArrayList()
    companion object{
        val shared = Model()
    }
    init{
        for ( i in 0..20){
            val student = Student(
                "Student $i",
                id = "Student id: $i",
                number = "Student number: $i",
                avatarURL = "",
                isChecked = false
            )
            students.add(student)
        }
    }
}