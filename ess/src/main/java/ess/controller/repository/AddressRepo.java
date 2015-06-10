package ess.controller.repository;

import org.springframework.data.querydsl.QueryDslPredicateExecutor;
import org.springframework.data.repository.PagingAndSortingRepository;

import ess.model.Address;
import ess.model.Certified;
import ess.model.ComputerExperience;
import ess.model.Education;
import ess.model.Training;
import ess.model.WorkExperience;

public interface AddressRepo extends QueryDslPredicateExecutor<Address>,
		PagingAndSortingRepository<Address, Long> {

}
