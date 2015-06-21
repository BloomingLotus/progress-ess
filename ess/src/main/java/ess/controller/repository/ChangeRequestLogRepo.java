package ess.controller.repository;

import org.springframework.data.querydsl.QueryDslPredicateExecutor;
import org.springframework.data.repository.PagingAndSortingRepository;

import ess.model.ChangeRequestLog;

public interface ChangeRequestLogRepo extends PagingAndSortingRepository<ChangeRequestLog, Long>,
		QueryDslPredicateExecutor<ChangeRequestLog> {

}
