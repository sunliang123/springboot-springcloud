package com.fengmangbilu.blog.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fengmangbilu.blog.entities.Blog;
import com.fengmangbilu.blog.repositories.BlogRepository;
import com.fengmangbilu.service.DefaultJpaServiceImpl;

@Service
public class BlogServiceImpl extends DefaultJpaServiceImpl<Blog, Long, BlogRepository> implements BlogService {

	@Autowired
	private BlogRepository repository;

	@Override
	public List<Object[]> countGroupByCreateDate() {
		return repository.countGroupByCreateDate();
	}

	@Override
	public List<Blog> findByTagsIn(Long id) {
		return repository.findByTagsIn(id);
	}

}
