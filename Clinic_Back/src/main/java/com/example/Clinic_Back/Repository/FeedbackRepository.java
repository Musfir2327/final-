package com.example.Clinic_Back.Repository;


import com.example.Clinic_Back.Entity.Feedback;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface FeedbackRepository extends MongoRepository<Feedback, String> {
}
