package com.fengmangbilu.microservice.user.services;

import com.fengmangbilu.microservice.user.entities.UserPoint;
import com.fengmangbilu.microservice.user.enums.BizType;
import com.fengmangbilu.microservice.user.enums.PointSource;
import com.fengmangbilu.microservice.user.repositories.UserPointRepository;
import com.fengmangbilu.service.DefaultJpaService;

public interface UserPointService extends DefaultJpaService<UserPoint, Long, UserPointRepository> {

	public UserPoint gainPoints(PointSource source, BizType bizType, String acquireReason, String userId, long points);
	
	public UserPoint costPoints(PointSource source, BizType bizType, String acquireReason, String userId, long points);

}
