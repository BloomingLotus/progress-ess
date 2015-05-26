package ess.controller.repository;

import org.springframework.data.querydsl.QueryDslPredicateExecutor;
import org.springframework.data.repository.PagingAndSortingRepository;

import ess.model.ComputerExperience;
import ess.model.Education;
import ess.model.Training;

public interface TrainingRepo extends QueryDslPredicateExecutor<Training>,
		PagingAndSortingRepository<Training, Long> {

}
