package org.ToDoApp.User.model;


import lombok.*;
import org.ToDoApp.toDoApp.model.ToDo;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "User_table")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private Integer userStatus;
    private String email;
    private String password;

    @OneToMany(cascade = CascadeType.ALL)
    private List<ToDo> toDoList;

}