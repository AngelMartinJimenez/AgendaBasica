package com.agenda.app.AgendaBasica.config;

import org.springframework.context.annotation.Bean;


import com.google.common.base.Predicate;

import springfox.documentation.spi.DocumentationType;
import springfox.documentation.swagger2.annotations.EnableSwagger2;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spring.web.plugins.Docket;

@EnableSwagger2


public class SwaggerConfig {
	
	@Bean
	public Docket productApi() {
		return new Docket(DocumentationType.SWAGGER_2)
				.select()
				.apis(RequestHandlerSelectors.basePackage("com.agenda.app.AgendaBasica"))
				.paths(regex("/contactos*"))
				.build();
	}

	private Predicate<String> regex(String string) {
		// TODO Auto-generated method stub
		return null;
	}
}