package com.fengmangbilu.blog.services;

import java.util.List;

import com.fengmangbilu.blog.entities.Blog;
import com.fengmangbilu.blog.repositories.BlogRepository;
import com.fengmangbilu.service.DefaultJpaService;

public interface BlogService extends DefaultJpaService<Blog, Long, BlogRepository> {

	List<Object[]> countGroupByCreateDate();
	
	List<Blog> findByTagsIn(Long id);
}
