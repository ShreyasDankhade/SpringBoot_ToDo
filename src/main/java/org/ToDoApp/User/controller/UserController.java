package org.ToDoApp.User.controller;

import org.ToDoApp.User.model.User;
import org.ToDoApp.User.service.IUserService;
import org.ToDoApp.toDoApp.model.ToDo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("user")
public class UserController {
    @Autowired
    IUserService userService;

    @GetMapping("/getAlluser")
    public List<User> getAllusers(){
        return userService.getAllUser();
    }

    @GetMapping("/getUserById/{id}")
    public User getUserById(@PathVariable(name = "id") Long id){
        return userService.getUserByid(id);
    }
    @PostMapping("/createUser")
    public String createUser(@RequestBody User u){
        userService.createUser(u);
        return "User Created Successfully";
    }



    @DeleteMapping("/deleteUser/{id}")
    public String deleteUser(@PathVariable(name = "id") Long id){
        userService.deleteByid(id);
        return "User Deleted Successfully";
    }
}