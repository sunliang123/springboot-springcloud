package com.fengmangbilu.oacloud.security.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSON;
import com.fengmangbilu.web.Response;

@Service
public class UserService implements UserDetailsService{
	
	@Autowired
	private UserClient userClient;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		Response response = userClient.findByMobile(username);
		if(response.getData() == null){
			throw new UsernameNotFoundException(null);
		}
		String data = JSON.toJSONString(response.getData());
		User user = JSON.parseObject(data, User.class);
		return user;
	}

}
