package ess.controller.repository;

import org.springframework.data.querydsl.QueryDslPredicateExecutor;
import org.springframework.data.repository.PagingAndSortingRepository;

import ess.webUI.model.BlogPost;

public interface BlogPostRepository extends QueryDslPredicateExecutor<BlogPost>, PagingAndSortingRepository<BlogPost, Long> {

}
