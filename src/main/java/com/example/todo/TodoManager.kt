package com.example.todo

import java.time.Instant
import java.util.Date

object TodoManager {

    private val todoList = mutableListOf(
        TodoA(1, "Prepare presentation for meeting", Date.from(Instant.now())),
        TodoA(2, "Finish report on project progress", Date.from(Instant.now())),
        TodoA(3, "Schedule follow-up call with client", Date.from(Instant.now())),
        TodoA(4, "Review and update project timeline", Date.from(Instant.now())),
        TodoA(5, "Prepare agenda for team meeting", Date.from(Instant.now())),
        TodoA(6, "Research new software tools for development", Date.from(Instant.now())),
        TodoA(7, "Send feedback to team members on recent work", Date.from(Instant.now())),
        TodoA(8, "Draft proposal for new project", Date.from(Instant.now())),
        TodoA(9, "Attend training session on agile methodologies", Date.from(Instant.now())),
        TodoA(10, "Plan and organize team building activity", Date.from(Instant.now())),
        TodoA(11, "Review and finalize budget for next quarter", Date.from(Instant.now())),
        TodoA(12, "Update documentation for software release", Date.from(Instant.now()))
    )


    fun getAllTodo() : List<TodoA>{
        return todoList
    }

    fun addTodo(title : String){
        todoList.add(TodoA(System.currentTimeMillis().toInt(),title, Date.from(Instant.now())))
    }

    fun deleteTodo(id : Int){
        todoList.removeIf{
            it.id==id
        }
    }

}