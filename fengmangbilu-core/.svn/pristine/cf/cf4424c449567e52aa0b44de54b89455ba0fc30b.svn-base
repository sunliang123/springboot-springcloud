package com.fengmangbilu.repository.config;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import org.springframework.context.annotation.ComponentScan.Filter;
import org.springframework.context.annotation.Import;
import org.springframework.data.repository.query.QueryLookupStrategy.Key;

import com.fengmangbilu.repository.DefaultJpaRepositoryFactoryBean;
import com.fengmangbilu.repository.DefaultRepository;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Inherited
@Import(DefaultJpaRepositoriesRegistrar.class)
public @interface EnableDefaultJpaRepositories {

	String[] value() default {};

	String[] basePackages() default {"com.fengmangbilu.**.repositories"};

	Class<?>[] basePackageClasses() default {};

	Filter[] includeFilters() default {};

	Filter[] excludeFilters() default {};

	String repositoryImplementationPostfix() default "Impl";

	String namedQueriesLocation() default "";

	Key queryLookupStrategy() default Key.CREATE_IF_NOT_FOUND;

	Class<?> repositoryFactoryBeanClass() default DefaultJpaRepositoryFactoryBean.class;

	Class<?> repositoryBaseClass() default DefaultRepository.class;

	String entityManagerFactoryRef() default "entityManagerFactory";

	String transactionManagerRef() default "transactionManager";

	boolean considerNestedRepositories() default false;

	boolean enableDefaultTransactions() default true;
}