package ess.controller.repository;

import org.springframework.data.querydsl.QueryDslPredicateExecutor;
import org.springframework.data.repository.PagingAndSortingRepository;

import ess.model.ChangeRequest;

public interface ChangeRequestRepo extends PagingAndSortingRepository<ChangeRequest, Long>,
		QueryDslPredicateExecutor<ChangeRequest> {

}
