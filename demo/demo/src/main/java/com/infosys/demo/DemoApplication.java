package com.infosys.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.WebClient;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@EnableEurekaServer
@SpringBootApplication
@EnableSwagger2
public class DemoApplication {

    
	public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

	@Bean
    public Docket apiDocket() {
        
        Docket docket = new Docket(DocumentationType.SWAGGER_2)
        .select()
        .apis(RequestHandlerSelectors.basePackage("com.infosys"))
        .paths(PathSelectors.any())
        .build();
        return docket;
        } 

    // @Bean
    // public RestTemplate getRestTemplate(){
    //     return new RestTemplate();
    // }

    // @Bean
    // public WebClient.Builder getWebClientBuilder(){
    //     return WebClient.builder();
    // }


}
