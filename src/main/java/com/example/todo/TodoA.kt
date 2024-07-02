package com.example.todo

import java.time.Instant
import java.util.Date

data class TodoA(
    var id: Int, var title: String, var createdAt: Date
)


fun getFakeTodo(): List<TodoA> {
    return listOf(

        TodoA(1, "First todo", Date.from(Instant.now())),
        TodoA(2, "Second todo", Date.from(Instant.now())),
        TodoA(3, "This is my third todo", Date.from(Instant.now())),
        TodoA(4, "this will be my forth todo so that i can use it in UI ", Date.from(Instant.now())),


        );
}