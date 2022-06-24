package com.example.course;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseRepository extends JpaRepository <Course,String> {
Course findByid(int id);
String deleteByid(int id);



}
