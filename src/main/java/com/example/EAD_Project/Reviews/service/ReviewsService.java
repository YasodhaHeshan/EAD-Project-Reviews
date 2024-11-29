package com.example.EAD_Project.Reviews.service;

import com.example.EAD_Project.Reviews.data.Reviews;
import com.example.EAD_Project.Reviews.repository.ReviewsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class ReviewsService {

    @Autowired
    private ReviewsRepository reviewsRepository;

    public Reviews createReview(Reviews review) {
        review.setCreatedDate(new Date());
        return reviewsRepository.save(review);
    }

    public List<Reviews> getReviewsByHotelId(int hotelId) {
        return reviewsRepository.findByHotelId(hotelId);
    }

    public List<Reviews> getReviewsByUserId(int userId) {
        return reviewsRepository.findByUserId(userId);
    }

    public Reviews getReviewById(int id) {
        return reviewsRepository.findById(id).orElse(null);
    }

    public void deleteReview(int id) {
        reviewsRepository.deleteById(id);
    }
} 