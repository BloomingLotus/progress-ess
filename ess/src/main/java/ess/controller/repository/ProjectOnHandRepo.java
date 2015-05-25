package ess.controller.repository;

import org.springframework.data.querydsl.QueryDslPredicateExecutor;
import org.springframework.data.repository.PagingAndSortingRepository;

import ess.model.ComputerExperience;
import ess.model.Education;
import ess.model.ProjectOnHand;

public interface ProjectOnHandRepo extends QueryDslPredicateExecutor< ProjectOnHand>,
		PagingAndSortingRepository< ProjectOnHand, Long> {

}
