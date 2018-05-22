package com.fengmangbilu.repository;

import java.io.Serializable;

import javax.persistence.EntityManager;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.support.JpaRepositoryFactoryBean;
import org.springframework.data.repository.core.support.RepositoryFactorySupport;

/**
 * @author Justice
 */
public class DefaultJpaRepositoryFactoryBean<T extends JpaRepository<R, ID>, R, ID extends Serializable>
		extends JpaRepositoryFactoryBean<T, R, ID> {

	public DefaultJpaRepositoryFactoryBean(Class<? extends T> repositoryInterface) {
		super(repositoryInterface);
	}

	@Override
	protected RepositoryFactorySupport createRepositoryFactory(EntityManager entityManager) {
		return new DefaultJpaRepositoryFactory<T, ID>(entityManager);
	}
}
