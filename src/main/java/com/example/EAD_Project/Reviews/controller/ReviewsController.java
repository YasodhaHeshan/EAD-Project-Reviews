package com.example.EAD_Project.Reviews.controller;

import com.example.EAD_Project.Reviews.data.Reviews;
import com.example.EAD_Project.Reviews.service.ReviewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/reviews")
public class ReviewsController {

    @Autowired
    private ReviewsService reviewsService;

    @PostMapping("/reviews")
    public ResponseEntity<Reviews> createReview(@RequestBody Reviews review) {
        return ResponseEntity.ok(reviewsService.createReview(review));
    }

    @GetMapping("/hotel/{hotelId}")
    public ResponseEntity<List<Reviews>> getReviewsByHotelId(@PathVariable int hotelId) {
        return ResponseEntity.ok(reviewsService.getReviewsByHotelId(hotelId));
    }

    @GetMapping("/user/{userId}")
    public ResponseEntity<List<Reviews>> getReviewsByUserId(@PathVariable int userId) {
        return ResponseEntity.ok(reviewsService.getReviewsByUserId(userId));
    }

    @GetMapping("/reviews/{id}")
    public ResponseEntity<Reviews> getReviewById(@PathVariable int id) {
        Reviews review = reviewsService.getReviewById(id);
        if (review != null) {
            return ResponseEntity.ok(review);
        }
        return ResponseEntity.notFound().build();
    }

    @DeleteMapping("/reviews/{id}")
    public ResponseEntity<Void> deleteReview(@PathVariable int id) {
        reviewsService.deleteReview(id);
        return ResponseEntity.ok().build();
    }
} 