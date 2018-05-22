package com.fengmangbilu.microservice.user.repositories;

import org.springframework.stereotype.Repository;

import com.fengmangbilu.microservice.user.entities.UserPointDetail;
import com.fengmangbilu.repository.DefaultRepository;

@Repository
public interface UserPointDetailRepository extends DefaultRepository<UserPointDetail, Long> {

}
