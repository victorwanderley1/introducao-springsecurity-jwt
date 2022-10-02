package wanderley.victor.introducaospringsecurityjwt.doc;

import java.util.Arrays;
import java.util.HashSet;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

@Configuration
public class SwaggerConfig {
	
	private Contact contato(){
		return new Contact("Victor Wanderley", "https://www.github.com/victorwanderley1", "emaildovictor@mail.com");
	}
	
	private ApiInfoBuilder informacoesApi() {
		ApiInfoBuilder apiInfoBuilder = new ApiInfoBuilder();
		
		apiInfoBuilder.title("Introducao ao Spring Security e JWT").description("Projeto de exemplo do uso de spring security e JWT")
		.version("0.1.1-snapshot").termsOfServiceUrl("Termo de uso: Open Source").contact(this.contato());
		return apiInfoBuilder;
	}
	
	@Bean
	public Docket detalheApi() {
		Docket docket = new Docket(DocumentationType.SWAGGER_2);
		
		docket.select().apis(RequestHandlerSelectors.basePackage("wanderley.victor.introducaospringsecurityjwt.controller"))
		.paths(PathSelectors.any()).build()
		.apiInfo(this.informacoesApi().build())
		.consumes(new HashSet<String>(Arrays.asList("application/json")))
		.produces(new HashSet<String>(Arrays.asList("application/json")));
		
		return docket;
	}
	

}
