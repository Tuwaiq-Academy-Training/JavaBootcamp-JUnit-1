package com.example.springsecuritybootcamp.Repository;

import com.example.springsecuritybootcamp.Model.MyUser;
import com.example.springsecuritybootcamp.Model.Todo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface TodoRepository extends JpaRepository<Todo,Integer>{


    List<Todo> findAllByMyUser(MyUser myUser);



    Todo findTodoById(Integer id);


}
