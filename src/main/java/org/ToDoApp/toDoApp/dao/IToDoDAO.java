package org.ToDoApp.toDoApp.dao;

import org.ToDoApp.User.model.User;
import org.ToDoApp.toDoApp.model.ToDo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IToDoDAO extends JpaRepository<ToDo, Long> {
}


