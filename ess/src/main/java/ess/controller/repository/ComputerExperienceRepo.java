package ess.controller.repository;

import org.springframework.data.querydsl.QueryDslPredicateExecutor;
import org.springframework.data.repository.PagingAndSortingRepository;

import ess.model.ComputerExperience;
import ess.model.Education;

public interface ComputerExperienceRepo extends QueryDslPredicateExecutor<ComputerExperience>,
		PagingAndSortingRepository<ComputerExperience, Long> {

}
