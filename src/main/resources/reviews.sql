create database reviews;
use reviews;

CREATE TABLE review (
    id INT AUTO_INCREMENT PRIMARY KEY,
    hotel_id INT NOT NULL,
    user_id INT NOT NULL,
    message VARCHAR(255),
    rating INT NOT NULL,
    created_date DATE
);

INSERT INTO review (hotel_id, user_id, message, rating, created_date) 
VALUES 
    (1, 101, 'Great stay! The staff were very friendly.', 5, '2024-11-25'),
    (2, 102, 'Room was clean but the location was noisy.', 3, '2024-11-20'),
    (1, 103, 'Amazing experience, highly recommend!', 5, '2024-11-22'),
    (3, 104, 'The food was excellent, but the service was slow.', 4, '2024-11-18'),
    (2, 105, 'Decent hotel for the price.', 3, '2024-11-15'),
    (3, 106, 'Very disappointing stay. Rooms were not clean.', 2, '2024-11-10');
    
select * from review;    
