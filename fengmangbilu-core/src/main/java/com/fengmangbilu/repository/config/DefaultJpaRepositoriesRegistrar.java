package com.fengmangbilu.repository.config;

import java.lang.annotation.Annotation;

import org.springframework.data.jpa.repository.config.JpaRepositoryConfigExtension;
import org.springframework.data.repository.config.RepositoryBeanDefinitionRegistrarSupport;
import org.springframework.data.repository.config.RepositoryConfigurationExtension;

class DefaultJpaRepositoriesRegistrar extends RepositoryBeanDefinitionRegistrarSupport {

	@Override
	protected Class<? extends Annotation> getAnnotation() {
		return EnableDefaultJpaRepositories.class;
	}

	@Override
	protected RepositoryConfigurationExtension getExtension() {
		return new JpaRepositoryConfigExtension();
	}
}
