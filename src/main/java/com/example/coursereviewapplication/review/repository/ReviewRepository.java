package com.example.coursereviewapplication.review.repository;

import com.example.coursereviewapplication.review.entity.Review;
import org.springframework.data.repository.CrudRepository;

public interface ReviewRepository extends CrudRepository<Review,Long> {
}
