package com.fauxkno.cruddemo.dao;

import com.fauxkno.cruddemo.entity.Student;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class StudentDAOImpl implements StudentDAO {

    // define field for entity manager
    private EntityManager entityManager;

    // inject entity manager using constructor injection
    @Autowired // this is usually already implied when only one constructor exists, but just for fun
    public StudentDAOImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    @Transactional
    public void save(Student theStudent) {
        entityManager.persist(theStudent);
    }

    @Override
    public Student findById(Integer id) {
        return entityManager.find(Student.class, id);
    }

    @Override
    public List<Student> findAll() {
        // create query
        // Student here is not the name of the database table, JPQL syntax is based on entity name and entity fields
        // lastName also is not the database name, but rather the JPA entity
        TypedQuery<Student> theQuery = entityManager.createQuery("FROM Student ORDER BY lastName asc", Student.class);

        // return query result
        return theQuery.getResultList();
    }

    // step two: implement the method you added in the DAO interface
    @Override
    public List<Student> findByLastName(String theLastName) {
        // create query
        // :theData represents a JPQL named param, prefixed with a colon
        TypedQuery<Student> theQuery = entityManager.createQuery("FROM Student WHERE lastName=:theData", Student.class);

        // set query parameters- named param is theData, the value provided in is theLastName
        theQuery.setParameter("theData", theLastName);

        // return query result
        return theQuery.getResultList();
    }

    // step two: implement the method you added in the DAO interface
    @Override
    @Transactional // since we are modifying
    public void update(Student theStudent) {
            entityManager.merge(theStudent);
        }

    @Override
    @Transactional
    public void delete(Integer id) {
        Student theStudent = entityManager.find(Student.class ,id);
        entityManager.remove(theStudent);
    }

    @Override
    @Transactional
    public int deleteAll() {
        int numRowsDeleted = entityManager.createQuery("DELETE FROM Student").executeUpdate();
        return numRowsDeleted;
    }
}
