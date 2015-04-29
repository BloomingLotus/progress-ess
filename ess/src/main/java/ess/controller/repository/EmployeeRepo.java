package ess.controller.repository;

import org.springframework.data.querydsl.QueryDslPredicateExecutor;
import org.springframework.data.repository.PagingAndSortingRepository;

import ess.model.Employee;

public interface EmployeeRepo extends QueryDslPredicateExecutor<Employee>,
		PagingAndSortingRepository<Employee, Long> {

}
