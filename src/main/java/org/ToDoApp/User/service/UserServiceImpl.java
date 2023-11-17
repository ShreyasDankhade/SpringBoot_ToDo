package org.ToDoApp.User.service;

import org.ToDoApp.User.dao.IUserDAO;
import org.ToDoApp.User.model.User;
import org.ToDoApp.toDoApp.dao.IToDoDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.NoSuchElementException;

@Service
public class UserServiceImpl implements IUserService {
    @Autowired
    private IUserDAO userDAO;
    @Autowired
    private IToDoDAO toDoDAO;

    public List<User> getAllUser(){
//        ArrayList<User> users = new ArrayList<>();
//        toDoDAO.findAll();
        return userDAO.findAll();
    }

    public User getUserByid(Long user_id){
        return userDAO.findById(user_id).orElseThrow(NoSuchElementException::new);
    }
    public User createUser(User u){
        return userDAO.save(u);
    }

    public void deleteByid(Long user_id){
        userDAO.delete(userDAO.findById(user_id).orElseThrow(NoSuchElementException::new));
    }

}

