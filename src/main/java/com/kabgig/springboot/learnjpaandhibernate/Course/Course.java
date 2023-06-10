package com.kabgig.springboot.learnjpaandhibernate.Course;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity (name="Course") //don't need if table name and clss name are the same
public class Course {

    @Id
    private long id;
   // @Column(name="name") //don't need if column nameis same as variable
    private String name;
   // @Column(name="author")
    private String author;

    public Course() {
    }

    public Course(long id, String name, String author) {
        this.id = id;
        this.name = name;
        this.author = author;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "Course{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", author='" + author + '\'' +
                '}';
    }
}
