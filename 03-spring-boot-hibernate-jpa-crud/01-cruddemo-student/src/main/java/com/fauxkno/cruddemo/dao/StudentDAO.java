package com.fauxkno.cruddemo.dao;

import com.fauxkno.cruddemo.entity.Student;

public interface StudentDAO {

    void save(Student theStudent);

    Student findById(Integer id);
}
