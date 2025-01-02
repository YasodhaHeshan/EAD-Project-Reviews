package com.example.EAD_Project.Reviews.data;

import jakarta.persistence.*;

import java.util.Date;
import java.util.UUID;

@Entity
@Table(name = "review")
public class Reviews {

    @Id
    @Column(name = "id" , nullable = false, updatable = false, columnDefinition = "char(36)")
    private String id;

    @Column(name = "hotel_id" , nullable = false)
    private String hotelId;

    @Column(name = "user_id" , nullable = false)
    private String userId;

    @Column(name = "message")
    private String message;

    @Column(name = "rating" )
    private int rating;

    @Column(name = "created_date" , updatable = false)
    private java.util.Date createdDate;

    @Column(name = "updated_date" )
    private java.util.Date updatedDate;

    public Reviews() {
        this.id= UUID.randomUUID().toString();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getHotelId() {
        return hotelId;
    }

    public void setHotelId(String hotelId) {
        this.hotelId = hotelId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public Date getUpdatedDate() {
        return updatedDate;
    }

    public void setUpdatedDate(Date updatedDate) {
        this.updatedDate = updatedDate;
    }
}
