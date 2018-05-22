package com.fengmangbilu.blog.services;

import org.springframework.stereotype.Service;

import com.fengmangbilu.blog.entities.Tag;
import com.fengmangbilu.blog.repositories.TagRepository;
import com.fengmangbilu.service.DefaultJpaServiceImpl;

@Service
public class TagServiceImpl extends DefaultJpaServiceImpl<Tag, Long, TagRepository> implements TagService {

}
