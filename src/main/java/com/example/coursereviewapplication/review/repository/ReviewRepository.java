package com.example.coursereviewapplication.review.repository;

import com.example.coursereviewapplication.review.entity.Review;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface ReviewRepository extends PagingAndSortingRepository<Review,Long> {
}
