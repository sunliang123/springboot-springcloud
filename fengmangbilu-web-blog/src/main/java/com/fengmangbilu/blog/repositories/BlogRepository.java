package com.fengmangbilu.blog.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.fengmangbilu.blog.entities.Blog;
import com.fengmangbilu.repository.DefaultRepository;

@Repository
public interface BlogRepository extends DefaultRepository<Blog, Long> {

	@Query(value = "select b.createdDate,count(*) as count from Blog b group by date_format(b.createdDate,'%Y-%m') order by b.createdDate asc")
	List<Object[]> countGroupByCreateDate();

	@Query(value = "select b from Blog b left join b.tags t where t.id in (?1) order by b.createdDate asc")
	List<Blog> findByTagsIn(Long id);
}
