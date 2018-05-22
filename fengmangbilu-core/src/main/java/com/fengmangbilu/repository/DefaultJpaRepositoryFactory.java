package com.fengmangbilu.repository;

import java.io.Serializable;

import javax.persistence.EntityManager;

import org.springframework.data.jpa.repository.support.JpaEntityInformation;
import org.springframework.data.jpa.repository.support.JpaRepositoryFactory;
import org.springframework.data.jpa.repository.support.SimpleJpaRepository;
import org.springframework.data.repository.core.RepositoryInformation;
import org.springframework.data.repository.core.RepositoryMetadata;

/**
 * @author Justice
 */
public class DefaultJpaRepositoryFactory<T, ID extends Serializable> extends JpaRepositoryFactory {

	/**
	 * @param entityManager
	 */
	public DefaultJpaRepositoryFactory(EntityManager entityManager) {

		super(entityManager);
	}

	@Override
	@SuppressWarnings("unchecked")
	protected SimpleJpaRepository<?, ?> getTargetRepository(RepositoryInformation information, EntityManager em) {
		Class<?> repositoryInterface = information.getRepositoryInterface();
		if (DefaultRepository.class.isAssignableFrom(repositoryInterface)) {
			JpaEntityInformation<T, ID> entityMetadata = getEntityInformation((Class<T>) information.getDomainType());
			return new DefaultJpaRepository<T, ID>(entityMetadata, em);
		}
		return super.getTargetRepository(information, em);
	}

	@Override
	protected Class<?> getRepositoryBaseClass(RepositoryMetadata metadata) {
		return DefaultJpaRepository.class;
	}
}
