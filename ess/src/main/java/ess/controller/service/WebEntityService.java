package ess.controller.service;

import org.springframework.data.domain.Page;

import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonNode;

import ess.security.model.EssUserDetails;
import ess.webUI.ResponseJSend;
import ess.webUI.model.BlogPost;

public interface WebEntityService {
	Iterable<BlogPost> findAllBlogPost();

	BlogPost findBlogPostBy(Long id);

	ResponseJSend<Page<BlogPost>> findBlogPostByExample(JsonNode node, Integer pageNum) throws JsonMappingException;
	
	ResponseJSend<Page<BlogPost>> findBlogPostByPageNum(Integer pageNum) throws JsonMappingException;

	ResponseJSend<Long> updateBlogPost(JsonNode node, EssUserDetails user) throws JsonMappingException;	
}
