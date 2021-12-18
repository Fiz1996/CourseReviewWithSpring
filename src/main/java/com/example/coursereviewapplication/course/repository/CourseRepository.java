package com.example.coursereviewapplication.course.repository;

import com.example.coursereviewapplication.course.entity.Course;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RestResource;

public interface CourseRepository extends PagingAndSortingRepository<Course,Long> {
    @RestResource(rel = "tittle-contains" ,path = "containsTittle")
    Page<Course> findByTitleContaining(@Param("tittle") String tittle, Pageable page);
}
