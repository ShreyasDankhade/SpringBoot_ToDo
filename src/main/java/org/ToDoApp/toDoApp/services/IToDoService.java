package org.ToDoApp.toDoApp.services;

//import org.ToDoApp.toDoApp.dto.ToDoDTO;
import org.ToDoApp.toDoApp.model.ToDo;

import java.util.List;


public interface IToDoService {
    public List<ToDo> getAllTodo();
    public ToDo getToDoByid(Long todo_id);
    public ToDo createToDo(ToDo t);
    public void createToDoByUserId(Long user_id, ToDo t);
    public void deleteToDoWithid(Long todo_id);
    public void deleteToDoIdforSpecificUserId(Long todo_id, Long user_id);
    public void toDoCompletedToggle(Long todo_id);


}
