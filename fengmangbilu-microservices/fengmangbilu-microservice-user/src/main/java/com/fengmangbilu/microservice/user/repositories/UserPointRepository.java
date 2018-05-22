package com.fengmangbilu.microservice.user.repositories;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.fengmangbilu.microservice.user.entities.UserPoint;
import com.fengmangbilu.repository.DefaultRepository;

@Repository
public interface UserPointRepository extends DefaultRepository<UserPoint, Long> {

	@Modifying
	@Query("update UserPoint u set u.points = (u.points + ?2),u.totalPoints = (u.totalPoints + ?2) where u.userId = ?1")
	int gainPoints(String userId, long points);
	
	@Modifying
	@Query("update UserPoint u set u.points = (u.points + ?2),u.totalExpend = (u.totalExpend + ?2) where u.userId = ?1")
	int costPoints(String userId, long points);

	UserPoint findByUserId(String userId);
}
