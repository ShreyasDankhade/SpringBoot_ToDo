package org.ToDoApp.User.dao;

import org.ToDoApp.User.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IUserDAO extends JpaRepository<User, Long> {
}
