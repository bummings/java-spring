package com.fauxkno.cruddemo.dao;

import com.fauxkno.cruddemo.entity.Student;

import java.util.List;

public interface StudentDAO {

    void save(Student theStudent);

    Student findById(Integer id);

    List<Student> findAll();

    // step one: add method in the DAO interface
    List<Student> findByLastName(String theLastName);

    void update(Student theStudent);

    void delete(Integer id);

    // int so that it returns the number of rows deleted
    int deleteAll();


}
