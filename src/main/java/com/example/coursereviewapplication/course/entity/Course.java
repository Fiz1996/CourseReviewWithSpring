package com.example.coursereviewapplication.course.entity;

import com.example.coursereviewapplication.core.BaseEntity;
import com.example.coursereviewapplication.review.entity.Review;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
public class Course extends BaseEntity {

    private String title;
    private String url;
    @OneToMany(mappedBy = "course", cascade = CascadeType.ALL)
    private List<Review> reviewList;

    protected Course() {
        super();
        reviewList = new ArrayList<>();
    }

    public Course(String title, String url) {
        this();
        this.title = title;
        this.url = url;
    }

    public void addReview(Review review) {
        review.setCourse(this);
        reviewList.add(review);
    }
}
