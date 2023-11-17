package org.ToDoApp.SignUp.dao;

import org.ToDoApp.SignUp.model.UserDetail;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ISignUpDAO extends JpaRepository<UserDetail, Long> {
}
