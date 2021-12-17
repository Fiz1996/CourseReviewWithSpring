package com.example.coursereviewapplication.review.entity;

import com.example.coursereviewapplication.core.BaseEntity;
import com.example.coursereviewapplication.course.entity.Course;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
public class Review extends BaseEntity {

    private int rating;
    private String description;
    @ManyToOne
    private Course course;

    protected Review( ) {
        super();
    }

    public Review(int rating, String description) {
        this.rating = rating;
        this.description = description;
    }
}
