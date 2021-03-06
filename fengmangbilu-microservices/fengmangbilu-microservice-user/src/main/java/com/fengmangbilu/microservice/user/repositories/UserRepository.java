package com.fengmangbilu.microservice.user.repositories;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.fengmangbilu.microservice.user.entities.User;
import com.fengmangbilu.repository.DefaultRepository;

@Repository
public interface UserRepository extends DefaultRepository<User, String> {

	User findByMobile(String mobile);
	
	@Modifying
	@Query("update User u set u.lastLoginDate = now() where u.userId = ?1")
	int setLastLoginDateFor(String id);
	
	@Modifying
	@Query("update User u set u.avatar = ?2 where u.userId = ?1")
	int setAvatarFor(String userId,String avatar);
	
	@Modifying
	@Query("update User u set u.isCertified = 1,u.name = ?2 where u.userId = ?1")
	int setIsCertifiedFor(String userId,String name);
}
