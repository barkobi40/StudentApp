package com.barkobi.myapplication_studentapp.model

import java.util.ArrayList

class Model private constructor() {
    val students : MutableList<Student>  = ArrayList()
    companion object{
        val shared = Model()
    }

    fun add(student: Student){
        students.add(student)
    }

    }


