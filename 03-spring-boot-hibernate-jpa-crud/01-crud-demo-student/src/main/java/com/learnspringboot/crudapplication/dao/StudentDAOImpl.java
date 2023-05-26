package com.learnspringboot.crudapplication.dao;

import com.learnspringboot.crudapplication.entity.Student;
import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class StudentDAOImpl implements StudentDAO{

    //Defining the field for entityManager
    private EntityManager entityManager;

    //Inject entityManager using construction injection
    public StudentDAOImpl(EntityManager entityManager){
        this.entityManager = entityManager;
    }

    @Override
    @Transactional
    public void save(Student theStudent) {
        entityManager.persist(theStudent);
    }

    @Override
    public Student find(String firstName) {
        Query query = entityManager.createQuery("from Student where firstName = :firstName", Student.class);
        query.setParameter("firstName", firstName);
        Student student = (Student) query.getSingleResult();
        return student;
    }

    @Override
    public List<Student> findAll() {
        Query query = entityManager.createQuery("FROM Student", Student.class);
        List<Student> allStudents = query.getResultList();
        return allStudents;
    }

    @Override
    @Transactional
    public void delete(String firstName) {
        Student student = find(firstName);
        entityManager.remove(student);
        //TODO: Examine why the below code threw an error
        // try executeUpdate and setParameter on the same query line
//        Query query = entityManager.createQuery("DELETE FROM Student where firstName = :firstName", Student.class);
//        query.setParameter("firstName", firstName);
//        int rowsDeleted = query.executeUpdate();
    }

    @Override
    @Transactional
    public int deleteAll() {
        int numberOfRowsDeleted  = entityManager.createQuery("DELETE from Student").executeUpdate();
//        int numberOfRowsDeleted = query.executeUpdate();
        return numberOfRowsDeleted;
    }

    @Override
    @Transactional
    public void update(Student student){
        entityManager.merge(student);
    }
}
