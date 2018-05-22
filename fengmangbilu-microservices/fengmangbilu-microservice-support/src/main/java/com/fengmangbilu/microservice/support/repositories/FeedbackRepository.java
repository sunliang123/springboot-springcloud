package com.fengmangbilu.microservice.support.repositories;

import org.springframework.stereotype.Repository;

import com.fengmangbilu.microservice.support.entites.Feedback;
import com.fengmangbilu.repository.DefaultRepository;

@Repository
public interface FeedbackRepository extends DefaultRepository<Feedback, String> {
	
}
