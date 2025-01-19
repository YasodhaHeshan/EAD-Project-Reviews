# EAD-Project-Reviews
Reviews Micro Service of EAD project

## Table of Contents
- [Introduction](#introduction)
- [Installation](#installation)
- [Usage](#usage)
- [Project Architecture](#project-architecture)
- [API Endpoints](#api-endpoints)

## Introduction
The EAD-Project-Reviews repository contains the Reviews Micro Service of the EAD project. This service is responsible for managing and handling reviews.

## Installation
To install the project, follow these steps:

1. Clone the repository:
   ```bash
   git clone https://github.com/YasodhaHeshan/EAD-Project-Reviews
   ```
2. Navigate to the project directory:
   ```bash
   cd EAD-Project-Reviews
   ```    
3. Install dependencies using Maven:
   ```bash
   ./mvnw spring-boot:run
   ```

## Usage
To use the Reviews Micro Service, follow these steps:

1. Start the application:
   ```bash
   ./mvnw spring-boot:run
   ```
2. Access the service at `http://localhost:8080`.

## Project Architecture
The project follows a microservices architecture. The Reviews Micro Service is built using Spring Boot and Maven. It interacts with other microservices in the EAD project to provide a seamless experience.

## API Endpoints
The following are the main API endpoints provided by the Reviews Micro Service:

- `GET /reviews`: Retrieve all reviews.
- `POST /reviews`: Create a new review.
- `GET /reviews/{id}`: Retrieve a specific review by ID.
- `PUT /reviews/{id}`: Update a review by ID.
- `DELETE /reviews/{id}`: Delete a review by ID.
- `GET /user/{userId}/reviews`: Retrieve all reviews by a specific user.
- `GET /hotel/{hotelId}/reviews`: Retrieve all reviews for a specific hotel.