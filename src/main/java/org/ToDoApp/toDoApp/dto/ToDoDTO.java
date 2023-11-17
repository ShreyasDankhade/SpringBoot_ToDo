//package org.ToDoApp.toDoApp.dto;
//
//import org.ToDoApp.User.model.UserDetails;
//import org.springframework.beans.factory.annotation.Autowired;
//
//public class ToDoDTO {
//
//    @Autowired
//    UserDetails userDetails;
//    private Long id;
//    private String name = userDetails.getFirstName()+ userDetails.getLastName();
//    private Long userId = userDetails.getUserId();
//
//    public ToDoDTO() {
//    }
//
//    public ToDoDTO(UserDetails userDetails, Long id, String name, Long userId) {
//        this.userDetails = userDetails;
//        this.id = id;
//        this.name = name;
//        this.userId = userId;
//    }
//
//    public UserDetails getUserDetails() {
//        return userDetails;
//    }
//
//    public void setUserDetails(UserDetails userDetails) {
//        this.userDetails = userDetails;
//    }
//
//    public Long getId() {
//        return id;
//    }
//
//    public void setId(Long id) {
//        this.id = id;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public Long getUserId() {
//        return userId;
//    }
//
//    public void setUserId(Long userId) {
//        this.userId = userId;
//    }
//
//    @Override
//    public String toString() {
//        return "ToDoDTO{" +
//                ", id=" + id +
//                ", name='" + name + '\'' +
//                ", userId=" + userId +
//                '}';
//    }
//}
