package com.example.EAD_Project.Reviews.controller;

import com.example.EAD_Project.Reviews.data.Reviews;
import com.example.EAD_Project.Reviews.service.ReviewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ReviewsController {

    @Autowired
    private ReviewsService reviewsService;

    @PostMapping("/reviews")
    public ResponseEntity<Reviews> createReview(@RequestBody Reviews review) {
        return ResponseEntity.ok(reviewsService.createReview(review));
    }

    @GetMapping("/hotel/{hotelId}/reviews")
    public ResponseEntity<List<Reviews>> getReviewsByHotelId(@PathVariable String hotelId) {
        return ResponseEntity.ok(reviewsService.getReviewsByHotelId(hotelId));
    }

    @GetMapping("/user/{userId}/reviews")
    public ResponseEntity<List<Reviews>> getReviewsByUserId(@PathVariable String userId) {
        return ResponseEntity.ok(reviewsService.getReviewsByUserId(userId));
    }

    @GetMapping("/reviews/{id}")
    public ResponseEntity<Reviews> getReviewById(@PathVariable String id) {
        Reviews review = reviewsService.getReviewById(id);
        if (review != null) {
            return ResponseEntity.ok(review);
        }
        return ResponseEntity.notFound().build();
    }

    @DeleteMapping("/reviews/{id}")
    public ResponseEntity<Void> deleteReview(@PathVariable String id) {
        reviewsService.deleteReview(id);
        return ResponseEntity.ok().build();
    }
} 