package org.ToDoApp.User.service;

import org.ToDoApp.User.model.User;
import org.ToDoApp.toDoApp.model.ToDo;

import java.util.List;

public interface IUserService {
    public List<User> getAllUser();
    public User getUserByid(Long user_id);
    public User createUser(User u);

    public void deleteByid(Long user_id);

}
