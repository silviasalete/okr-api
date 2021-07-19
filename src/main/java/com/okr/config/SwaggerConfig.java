package com.okr.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.service.VendorExtension;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;
import springfox.documentation.builders.PathSelectors;

import java.util.ArrayList;

@Configuration
@EnableSwagger2
public class SwaggerConfig {
    @Bean
    public Docket productApi(){
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.basePackage(""))
                .paths(PathSelectors.regex("/api.*"))
                .build()
                .apiInfo(metaInfo());
    }

    private ApiInfo metaInfo() {
         ApiInfo apiInfo = new ApiInfo(
                "Objectives API REST",
                "API RESTE of OKR",
                "1.0",
                "Terms of Service",
                new Contact("Salete Costa", "http://saletecosta.com","silvia.samtech@gmail.com"),
                "Apache Licence Version 2.0",
                "http://www.apache.org/licence.html", new ArrayList<VendorExtension>()
        );

        return apiInfo;
    }
}
