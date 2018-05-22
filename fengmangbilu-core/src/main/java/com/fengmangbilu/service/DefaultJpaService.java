package com.fengmangbilu.service;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.datatables.mapping.DataTablesInput;
import org.springframework.data.jpa.datatables.mapping.DataTablesOutput;
import org.springframework.data.jpa.domain.Specification;

import com.fengmangbilu.repository.DefaultRepository;
import com.querydsl.core.types.OrderSpecifier;
import com.querydsl.core.types.Predicate;

/**
 * {@link DefaultRepository}
 * 
 * @author Infinite Justice
 * @since 1.0
 */
public interface DefaultJpaService<T, ID extends Serializable, R extends DefaultRepository<T, ID>> {

	T save(T entity);

	T saveAndFlush(T entity);

	List<T> save(Iterable<T> entities);

	T getOne(ID id);

	T findOne(ID id);

	T findOne(Specification<T> spec);

	T findOne(Predicate predicate);

	void delete(ID id);

	void delete(T entity);

	void deleteAll();

	void deleteInBatch(Iterable<T> entities);

	void deleteAllInBatch();

	List<T> findAll();

	List<T> findAll(Iterable<ID> ids);

	List<T> findAll(Sort sort);

	Page<T> findAll(Pageable pageable);

	List<T> findAll(Specification<T> spec);

	Page<T> findAll(Specification<T> spec, Pageable pageable);

	List<T> findAll(Specification<T> spec, Sort sort);

	Iterable<T> findAll(Predicate predicate);

	Iterable<T> findAll(Predicate predicate, Sort sort);

	Iterable<T> findAll(Predicate predicate, OrderSpecifier<?>... orders);

	Iterable<T> findAll(OrderSpecifier<?>... orders);

	Page<T> findAll(Predicate predicate, Pageable pageable);

	long count();

	long count(Specification<T> spec);

	long count(Predicate predicate);

	boolean exists(ID id);

	boolean exists(Predicate predicate);

	void flush();

	DataTablesOutput<T> findAll(DataTablesInput input);

	DataTablesOutput<T> findAll(DataTablesInput input, Predicate predicate);

	DataTablesOutput<T> findAll(DataTablesInput input, Specification<T> specification);
}
