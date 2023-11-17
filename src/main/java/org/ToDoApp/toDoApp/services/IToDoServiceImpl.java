package org.ToDoApp.toDoApp.services;

//import org.ToDoApp.User.model.UserDetails;
import org.ToDoApp.User.dao.IUserDAO;
import org.ToDoApp.User.model.User;
import org.ToDoApp.toDoApp.dao.IToDoDAO;
//import org.ToDoApp.toDoApp.dto.ToDoDTO;
import org.ToDoApp.toDoApp.model.ToDo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

@Service
public class IToDoServiceImpl implements IToDoService{

    @Autowired
    private IToDoDAO toDoDAO;
    @Autowired
    private IUserDAO userDAO;

//    public static ToDoDTO convert_Model_to_DTO(ToDo t, UserDetails uD){
//        ToDoDTO tDTO = new ToDoDTO();
//        tDTO.setId(t.getId());
//        tDTO.setName(uD.getFirstName() + uD.getLastName());
//        tDTO.setUserId(uD.getUserId());
//        return tDTO;
//    }
//
//    public static List<ToDoDTO> convert_model_list_to_dto_list(List<ToDo> toDoList){
//        List<ToDoDTO> tDTOlist = new ArrayList<>();
//        Iterator<ToDo> ToDoI = toDoList.iterator();
//        while(ToDoI.hasNext()){
//            ToDo t = ToDoI.next();
//            ToDoDTO tDTO = convert_Model_to_DTO(t,new UserDetails());
//
//        }
//    }


    public List<ToDo> getAllTodo(){
//        ArrayList<ToDo> todo = new ArrayList<>();
//        User user = new User();
//        userDAO.save(user);
        return toDoDAO.findAll();
    }

    @Override
    public ToDo getToDoByid(Long todo_id) {
        return toDoDAO.findById(todo_id).orElseThrow(NoSuchElementException::new);
    }


    public ToDo createToDo(ToDo t){
        return toDoDAO.save(t);
    }

    public void createToDoByUserId(Long user_id, ToDo t) {
        User user = userDAO.findById(user_id).orElseThrow(NoSuchElementException::new);
        user.getToDoList().add(t);
        userDAO.save(user);
    }

    public void deleteToDoWithid(Long todo_id){
        toDoDAO.delete(toDoDAO.findById(todo_id).orElseThrow(NoSuchElementException::new));
    }

    @Override
    public void deleteToDoIdforSpecificUserId(Long todo_id, Long user_id) {
        User user = userDAO.findById(user_id).orElseThrow(NoSuchElementException::new);
        ToDo toDo = toDoDAO.findById(todo_id).orElseThrow(NoSuchElementException::new);
        user.getToDoList().remove(toDo);
        toDoDAO.deleteById(todo_id);
    }

    @Override
    public void toDoCompletedToggle(Long todo_id) {
        ToDo toDo = toDoDAO.findById(todo_id).orElseThrow(NoSuchElementException::new);
        toDo.setCompleted(!toDo.getCompleted());
        toDoDAO.save(toDo);
    }


}