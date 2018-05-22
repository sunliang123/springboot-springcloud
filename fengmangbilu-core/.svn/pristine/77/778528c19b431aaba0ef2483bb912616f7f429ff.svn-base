package com.fengmangbilu.validator;

import static org.hibernate.validator.internal.util.logging.Messages.MESSAGES;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import org.apache.commons.beanutils.BeanUtils;
import org.hibernate.validator.internal.util.Contracts;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import com.fengmangbilu.validator.constraints.Unique;

public class UniqueValidator implements ConstraintValidator<Unique, Object> {

	@PersistenceContext
	EntityManager em;

	private String reportOn;

	@Override
	public void initialize(final Unique constraintAnnotation) {
		Contracts.assertNotEmpty(constraintAnnotation.reportOn(), MESSAGES.parameterMustNotBeEmpty("reportOn"));
		reportOn = constraintAnnotation.reportOn();
	}

	@Override
	@SuppressWarnings({"rawtypes", "unchecked"})
	@Transactional(readOnly = true, propagation = Propagation.REQUIRES_NEW)
	public boolean isValid(final Object object, final ConstraintValidatorContext context) {
		try {
			Class clazz = object.getClass();
			Object value = BeanUtils.getProperty(object, reportOn);
			CriteriaBuilder builder = em.getCriteriaBuilder();
			CriteriaQuery<Long> criteria = builder.createQuery(Long.class);
			Root root = criteria.from(clazz);
			List<Predicate> predicates = new ArrayList<>();
			predicates.add(builder.equal(root.get(reportOn), value));
			criteria.select(builder.count(root)).where(predicates.toArray(new Predicate[predicates.size()]));
			Long result = em.createQuery(criteria).getSingleResult();
			if (result == 1) {
				context.disableDefaultConstraintViolation();
				context.buildConstraintViolationWithTemplate(context.getDefaultConstraintMessageTemplate())
						.addPropertyNode(reportOn).addConstraintViolation();
			}
			return result == 0;
		} catch (NoResultException e) {
			return true;
		} catch (Exception e) {
			return false;
		}
	}
}
