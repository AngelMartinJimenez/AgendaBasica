package com.agenda.app.AgendaBasica.config;

import springfox.documentation.spi.DocumentationType;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spring.web.plugins.Docket;

@Configuration
@EnableSwagger2


public class ApplicationContextConfig {

	 @Bean
		public Docket productApi() {
			return new Docket(DocumentationType.SWAGGER_2)
					.select()
					.apis(RequestHandlerSelectors.any())
					.paths(PathSelectors.any())
					.build();
		}
	
	
	 public void addViewControllers(ViewControllerRegistry registry) {         
		 
		 registry.addRedirectViewController("/docApi/v2/api-docs", "/v2/api-docs");         
		 registry.addRedirectViewController("/docApi/swagger-resources/configuration/ui", "/swagger-resources/configuration/ui");         
		 registry.addRedirectViewController("/docApi/swagger-resources/configuration/security", "/swagger-resources/configuration/security");        
		 registry.addRedirectViewController("/docApi/swagger-resources", "/swagger-resources");     }         
	 
	 public void addResourceHandlers(ResourceHandlerRegistry registry) {          
		
		 registry.addResourceHandler("/docApi/swagger-ui.html**").addResourceLocations("classpath:/META-INF/resources/swagger-ui.html");            
		 registry.addResourceHandler("/docApi/webjars/**").addResourceLocations("classpath:/META-INF/resources/webjars/");              }
	

}


//no hace falta el spring boot lo hace el solo
