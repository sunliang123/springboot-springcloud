package com.fengmangbilu.repository;

import java.io.Serializable;

import org.springframework.data.jpa.datatables.mapping.DataTablesInput;
import org.springframework.data.jpa.datatables.mapping.DataTablesOutput;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.querydsl.QueryDslPredicateExecutor;
import org.springframework.data.repository.NoRepositoryBean;

import com.querydsl.core.types.Predicate;

/**
 * @author Justice
 */
@NoRepositoryBean
public interface DefaultRepository<T, ID extends Serializable>
		extends JpaRepository<T, ID>, JpaSpecificationExecutor<T>, QueryDslPredicateExecutor<T> {

	DataTablesOutput<T> findAll(DataTablesInput input);
	
	DataTablesOutput<T> findAll(DataTablesInput input, Predicate predicate);

	DataTablesOutput<T> findAll(DataTablesInput input, Specification<T> specification);
}
