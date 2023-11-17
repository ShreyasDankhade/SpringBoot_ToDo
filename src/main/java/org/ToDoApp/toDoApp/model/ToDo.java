package org.ToDoApp.toDoApp.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.ToDoApp.User.model.User;

import javax.persistence.*;


@Entity
@Table( name = "todo_table")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ToDo {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String content;
    private Boolean completed = Boolean.FALSE;

//    @ManyToOne
//    @JoinColumn(name = "user_id")
//    private User user;
}