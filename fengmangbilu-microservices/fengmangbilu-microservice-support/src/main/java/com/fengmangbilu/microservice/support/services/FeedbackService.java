package com.fengmangbilu.microservice.support.services;

import com.fengmangbilu.microservice.support.entites.Feedback;
import com.fengmangbilu.microservice.support.repositories.FeedbackRepository;
import com.fengmangbilu.service.DefaultJpaService;

public interface FeedbackService extends DefaultJpaService<Feedback, String, FeedbackRepository>{ 

}
