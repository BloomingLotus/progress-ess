package ess;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.web.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;

import ess.controller.service.EntityService;
import ess.controller.service.EntityServiceJPA;

public class ServletInitializer extends SpringBootServletInitializer {

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(EssApplication.class);
	}

    @Bean
	public EntityService entityService() {
		return new EntityServiceJPA();
	}
}
