package ess.controller.service;

import java.util.Date;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.mysema.query.BooleanBuilder;

import ess.controller.repository.BlogPostRepository;
import ess.model.ChangeRequest;
import ess.security.model.EssUserDetails;
import ess.webUI.DefaultProperty;
import ess.webUI.ResponseJSend;
import ess.webUI.ResponseStatus;
import ess.webUI.model.BlogPost;
import ess.webUI.model.QBlogPost;


@Service
@Transactional
public class WebEntityServiceJPA implements WebEntityService {

	@Autowired
	BlogPostRepository blogPostRepo;
	
	@Override
	public Iterable<BlogPost> findAllBlogPost() {
		
		return blogPostRepo.findAll();
	}

	@Override
	public BlogPost findBlogPostBy(Long id) {
		return blogPostRepo.findOne(id);
	}

	
	
	@Override
	public ResponseJSend<Page<BlogPost>> findBlogPostByPageNum(Integer pageNum) throws JsonMappingException {
		PageRequest pageRequest =
	            new PageRequest(pageNum -1, DefaultProperty.NUMBER_OF_ELEMENT_PER_PAGE, Sort.Direction.DESC, "createdTime");
		
		Page<BlogPost> posts = blogPostRepo.findAll(pageRequest); 
		
		ResponseJSend<Page<BlogPost>> response = new ResponseJSend<Page<BlogPost>>();
		response.data=posts;
		response.status=ResponseStatus.SUCCESS;
		
		return response;
	}

	@Override
	public ResponseJSend<Page<BlogPost>> findBlogPostByExample(JsonNode node, Integer pageNum) throws JsonMappingException {
		
		ObjectNode object = (ObjectNode) node;
		BlogPost webModel;
		
		ObjectMapper mapper = new ObjectMapper();
		mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
		
		
		try {
			webModel = mapper.treeToValue(object, BlogPost.class);
		} catch (JsonProcessingException e) {
			e.printStackTrace();
			throw new JsonMappingException(e.getMessage() + "\n  JSON: " + node.toString());
		}
		
		QBlogPost q = QBlogPost.blogPost;
		
		BooleanBuilder p = new BooleanBuilder();
		
		PageRequest pageRequest =
	            new PageRequest(pageNum -1, DefaultProperty.NUMBER_OF_ELEMENT_PER_PAGE, Sort.Direction.DESC, "createdTime");
		
		Page<BlogPost> posts = blogPostRepo.findAll(p, pageRequest); 
		
		ResponseJSend<Page<BlogPost>> response = new ResponseJSend<Page<BlogPost>>();
		response.data=posts;
		response.status=ResponseStatus.SUCCESS;
		
		return response;

	}

	
	
	@Override
	public ResponseJSend<Long> updateBlogPost(JsonNode node, EssUserDetails user) throws JsonMappingException {
		ObjectNode object = (ObjectNode) node;
		BlogPost webModel, dbModel;
		
		ObjectMapper mapper = new ObjectMapper();
		mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
		
		
		try {
			webModel = mapper.treeToValue(object, BlogPost.class);
		} catch (JsonProcessingException e) {
			e.printStackTrace();
			throw new JsonMappingException(e.getMessage() + "\n  JSON: " + node.toString());
		}
		
		
		if(webModel.getId() == null) {
			dbModel = new BlogPost();
			dbModel.setCreatedBy(user.getEmployee());
			dbModel.setCreatedTime(new Date());
		} else {
			dbModel = blogPostRepo.findOne(webModel.getId());
		}
		
		dbModel.setTag(webModel.getTag());
		dbModel.setText(webModel.getText());
		dbModel.setTitle(webModel.getTitle());

		dbModel.setLastUpdatedBy(user.getEmployee());
		dbModel.setLastUpdatedTime(new Date());
		blogPostRepo.save(dbModel);
		
		ResponseJSend<Long> response = new ResponseJSend<Long>();
		response.status = ResponseStatus.SUCCESS;
		response.data = dbModel.getId(); 
		return response;
	}
	
	

}
