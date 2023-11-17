package org.ToDoApp.toDoApp.controller;

import org.ToDoApp.toDoApp.model.ToDo;
import org.ToDoApp.toDoApp.services.IToDoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("todo")
public class ToDoController {
    @Autowired
    IToDoService toDoService;

    @GetMapping("/getAlltodo")
    public List<ToDo> getAll(){
        return toDoService.getAllTodo();
    }

    @GetMapping("/getToDoByid/{todo_id}")
    public ToDo getByid(@PathVariable Long todo_id){
        return toDoService.getToDoByid(todo_id);
    }


    @PostMapping("/createToDo")
    public String createToDo(@RequestBody ToDo t){
        toDoService.createToDo(t);
        return "To Do Task Created Successfully";
    }

    @PostMapping("/createToDoByUserId/{id}")
    public String createToDoByUserId(@PathVariable Long id, @RequestBody ToDo t){
        toDoService.createToDoByUserId(id,t);
        return "To Do Task has been added to the specified "+id;
    }

    @PostMapping("toDoCompleted/{todo_id}")
    public String toDoCoompleted(@PathVariable Long todo_id){
        toDoService.toDoCompletedToggle(todo_id);
        return "To Do Task Completed";
    }


    @DeleteMapping("/deleteToDo/{todo_id}")
    public String deleteToDo(@PathVariable Long todo_id){
        toDoService.deleteToDoWithid(todo_id);
        return "To Do Task Deleted Succcessfully";
    }

    @DeleteMapping("{user_id}/{todo_id}")
    public String deleteToDoforSpecificUser(@PathVariable Long todo_id,@PathVariable Long user_id){
        toDoService.deleteToDoIdforSpecificUserId(todo_id,user_id);
        return "To Do Task Delete";
    }


}