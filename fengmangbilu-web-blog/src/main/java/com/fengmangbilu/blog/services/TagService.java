package com.fengmangbilu.blog.services;

import com.fengmangbilu.blog.entities.Tag;
import com.fengmangbilu.blog.repositories.TagRepository;
import com.fengmangbilu.service.DefaultJpaService;

public interface TagService extends DefaultJpaService<Tag, Long, TagRepository> {

}
