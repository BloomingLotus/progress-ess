package ess.security.service;

import org.springframework.data.querydsl.QueryDslPredicateExecutor;
import org.springframework.data.repository.PagingAndSortingRepository;

import ess.security.model.User;

public interface UserRepository extends QueryDslPredicateExecutor<User>,
		PagingAndSortingRepository<User, Long> {

}
