package com.example.coursereviewapplication.core;

import com.example.coursereviewapplication.course.entity.Course;
import com.example.coursereviewapplication.course.repository.CourseRepository;
import com.example.coursereviewapplication.review.entity.Review;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class DatabaseLoader implements ApplicationRunner {
    private final CourseRepository courses;
    @Autowired
    public DatabaseLoader(CourseRepository courses) {
        this.courses = courses;
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
        Course course = new Course("Java basics","https://teamtreehouse/com/library/javabasics");
        course.addReview(new Review( 3,"testing"));
        courses.save(course);
    }
}
