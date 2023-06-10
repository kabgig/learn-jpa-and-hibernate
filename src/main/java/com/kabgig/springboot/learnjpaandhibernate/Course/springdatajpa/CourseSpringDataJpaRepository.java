package com.kabgig.springboot.learnjpaandhibernate.Course.springdatajpa;

import com.kabgig.springboot.learnjpaandhibernate.Course.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseSpringDataJpaRepository extends JpaRepository<Course,Long> {

}
