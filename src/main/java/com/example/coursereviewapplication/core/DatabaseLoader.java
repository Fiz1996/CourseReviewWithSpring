package com.example.coursereviewapplication.core;

import com.example.coursereviewapplication.course.entity.Course;
import com.example.coursereviewapplication.course.repository.CourseRepository;
import com.example.coursereviewapplication.review.entity.Review;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

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
        String [] templates= {
                "Up and Running with %s",
                "%s basics",
                "%s for Beginners  "
        };

        String [] buzzWords = {
                "Spring data res",
                "Java for beginners "
        };
        List<Course> bunchOfCourses = new ArrayList<>();
        IntStream.range(0, 100)
                .forEach(i -> {
                    String template = templates[i % templates.length];
                    String buzzword = buzzWords[i % buzzWords.length];
                    String title = String.format(template, buzzword);
                    Course c = new Course(title, "http://www.example.com");
                    c.addReview(new Review(i % 5, String.format("Moar %s please!!!", buzzword)));
                    bunchOfCourses.add(c);
                });
//         courses.save(bunchOfCourses);
    }
}
