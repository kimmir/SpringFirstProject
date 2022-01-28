package com.example.demo.student;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

//Types the interface works with <Object, Type> Student, id of student is of type long
//Data access layer
//Should be used in StudentService
@Repository
public interface StudentRepository extends JpaRepository<Student,Long> {

    //SELECT * FROM student WHERE email = ?
//    @Query("SELECT s FROM Student s WHERE s.email = ?1")
    Optional<Student> findStudentByEmail(String email);
}
