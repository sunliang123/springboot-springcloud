package com.fengmangbilu.microservice.user.controllers;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.datatables.mapping.DataTablesInput;
import org.springframework.data.jpa.datatables.mapping.DataTablesOutput;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.util.StringUtils;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.fengmangbilu.microservice.user.entities.UserPointDetail;
import com.fengmangbilu.microservice.user.services.UserPointDetailService;

import io.swagger.annotations.Api;

@Api
@Validated
@RestController
@RequestMapping("point")
public class PointController {

	@Autowired
	private UserPointDetailService userPointDetailService;

	@GetMapping("getUserPointDetails")
	public DataTablesOutput<UserPointDetail> getUserPointDetails(@AuthenticationPrincipal String userId,
			@DateTimeFormat(pattern = "yyyy-MM-dd") @RequestParam(required = false) final Date startDate,
			@DateTimeFormat(pattern = "yyyy-MM-dd") @RequestParam(required = false) final Date endDate,
			@Valid @ModelAttribute DataTablesInput input) {
		Specification<UserPointDetail> specification = new Specification<UserPointDetail>() {
			@Override
			public Predicate toPredicate(Root<UserPointDetail> root, CriteriaQuery<?> query, CriteriaBuilder cb) {
				List<Predicate> predicates = new ArrayList<>();
				if (!StringUtils.isEmpty(startDate)) {
					predicates.add(cb.greaterThanOrEqualTo(root.get("createdDate"), startDate));
				}
				if (!StringUtils.isEmpty(endDate)) {
					predicates.add(cb.lessThanOrEqualTo(root.get("createdDate"), endDate));
				}
				predicates.add(cb.equal(root.get("userId"), userId));
				cb.and(predicates.toArray(new Predicate[predicates.size()]));

				query.where(cb.and(predicates.toArray(new Predicate[predicates.size()])));
				query.orderBy(cb.desc(root.get("createdDate")));

				return query.getRestriction();
			}
		};
		return userPointDetailService.findAll(input, specification);
	}

}
