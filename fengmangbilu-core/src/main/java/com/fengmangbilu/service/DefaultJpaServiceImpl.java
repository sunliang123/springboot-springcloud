package com.fengmangbilu.service;

import java.io.Serializable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.datatables.mapping.DataTablesInput;
import org.springframework.data.jpa.datatables.mapping.DataTablesOutput;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

import com.fengmangbilu.repository.DefaultRepository;
import com.querydsl.core.types.OrderSpecifier;
import com.querydsl.core.types.Predicate;

@Service
public abstract class DefaultJpaServiceImpl<T, ID extends Serializable, R extends DefaultRepository<T, ID>>
		implements DefaultJpaService<T, ID, R> {

	@Autowired
	private R repository;

	@Override
	public T save(T entity) {
		return repository.save(entity);
	}

	@Override
	public T saveAndFlush(T entity) {
		return repository.saveAndFlush(entity);
	}

	@Override
	public List<T> save(Iterable<T> entities) {
		return repository.save(entities);
	}

	@Override
	public T getOne(ID id) {
		return repository.getOne(id);
	}

	@Override
	public T findOne(ID id) {
		return repository.findOne(id);
	}

	@Override
	public T findOne(Specification<T> spec) {
		return repository.findOne(spec);
	}

	@Override
	public T findOne(Predicate predicate) {
		return repository.findOne(predicate);
	}

	@Override
	public void delete(ID id) {
		repository.delete(id);
	}

	@Override
	public void delete(T entity) {
		repository.delete(entity);
	}

	@Override
	public void deleteAll() {
		repository.deleteAll();
	}

	@Override
	public void deleteInBatch(Iterable<T> entities) {
		repository.deleteAllInBatch();
	}

	@Override
	public void deleteAllInBatch() {
		repository.deleteAllInBatch();
	}

	@Override
	public List<T> findAll() {
		return repository.findAll();
	}

	@Override
	public List<T> findAll(Iterable<ID> ids) {
		return repository.findAll(ids);
	}

	@Override
	public List<T> findAll(Sort sort) {
		return repository.findAll(sort);
	}

	@Override
	public Page<T> findAll(Pageable pageable) {
		return repository.findAll(pageable);
	}

	@Override
	public List<T> findAll(Specification<T> spec) {
		return repository.findAll(spec);
	}

	@Override
	public Page<T> findAll(Specification<T> spec, Pageable pageable) {
		return repository.findAll(spec, pageable);
	}

	@Override
	public List<T> findAll(Specification<T> spec, Sort sort) {
		return repository.findAll(spec, sort);
	}

	@Override
	public Iterable<T> findAll(Predicate predicate) {
		return repository.findAll(predicate);
	}

	@Override
	public Iterable<T> findAll(Predicate predicate, Sort sort) {
		return repository.findAll(predicate, sort);
	}

	@Override
	public Iterable<T> findAll(Predicate predicate, OrderSpecifier<?>... orders) {
		return repository.findAll(predicate, orders);
	}

	@Override
	public Iterable<T> findAll(OrderSpecifier<?>... orders) {
		return repository.findAll(orders);
	}

	@Override
	public Page<T> findAll(Predicate predicate, Pageable pageable) {
		return repository.findAll(predicate, pageable);
	}

	@Override
	public long count() {
		return repository.count();
	}

	@Override
	public long count(Specification<T> spec) {
		return repository.count(spec);
	}

	@Override
	public long count(Predicate predicate) {
		return repository.count(predicate);
	}

	@Override
	public boolean exists(ID id) {
		return repository.exists(id);
	}

	@Override
	public boolean exists(Predicate predicate) {
		return repository.exists(predicate);
	}

	@Override
	public void flush() {
		repository.flush();
	}

	/*--------------------------------------------
	|                 DataTables                |
	============================================*/

	@Override
	public DataTablesOutput<T> findAll(DataTablesInput input) {
		return repository.findAll(input);
	}

	@Override
	public DataTablesOutput<T> findAll(DataTablesInput input, Predicate predicate) {
		return repository.findAll(input, predicate);
	}

	@Override
	public DataTablesOutput<T> findAll(DataTablesInput input, Specification<T> specification) {
		return repository.findAll(input, specification);
	}
}
