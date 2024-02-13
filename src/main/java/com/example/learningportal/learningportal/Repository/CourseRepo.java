package com.example.learningportal.learningportal.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.learningportal.learningportal.entity.Courses;

public interface CourseRepo extends JpaRepository<Courses, Long> {

}
