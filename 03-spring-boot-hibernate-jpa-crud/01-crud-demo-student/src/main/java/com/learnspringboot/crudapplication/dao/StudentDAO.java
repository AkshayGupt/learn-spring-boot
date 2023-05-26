package com.learnspringboot.crudapplication.dao;

import com.learnspringboot.crudapplication.entity.Student;
import java.util.*;

public interface StudentDAO {

    void save(Student theStudent);

    Student find(String firstName);

    List<Student> findAll();

    void delete(String firstName);

    int deleteAll();

    void update(Student student);
}
