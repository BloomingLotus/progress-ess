package ess.controller.repository;

import org.springframework.data.querydsl.QueryDslPredicateExecutor;
import org.springframework.data.repository.PagingAndSortingRepository;

import ess.model.EmergencyContact;

public interface EmergencyContactRepo extends
		PagingAndSortingRepository<EmergencyContact, Long>, QueryDslPredicateExecutor<EmergencyContact> {

}
