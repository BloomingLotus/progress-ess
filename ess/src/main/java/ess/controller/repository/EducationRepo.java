package ess.controller.repository;

import org.springframework.data.querydsl.QueryDslPredicateExecutor;
import org.springframework.data.repository.PagingAndSortingRepository;

import ess.model.Education;

public interface EducationRepo extends QueryDslPredicateExecutor<Education>,
		PagingAndSortingRepository<Education, Long> {

}
