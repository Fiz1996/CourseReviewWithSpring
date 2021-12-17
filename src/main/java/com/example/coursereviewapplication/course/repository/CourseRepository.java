package com.example.coursereviewapplication.course.repository;

import com.example.coursereviewapplication.course.entity.Course;
import org.springframework.data.repository.CrudRepository;

public interface CourseRepository extends CrudRepository<Course,Long> {
}
