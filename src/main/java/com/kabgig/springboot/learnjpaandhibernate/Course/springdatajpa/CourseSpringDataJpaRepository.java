package com.kabgig.springboot.learnjpaandhibernate.Course.springdatajpa;

import com.kabgig.springboot.learnjpaandhibernate.Course.Course;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CourseSpringDataJpaRepository extends JpaRepository<Course,Long> {
    //optionally we can define our own methods by following convention 'findByColumnName'
    List<Course> findByAuthor(String author);
    List<Course> findByName(String name);
}
