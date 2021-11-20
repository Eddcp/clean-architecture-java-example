package com.example.exampleapi.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.Arrays;
import java.util.List;

import static com.google.common.collect.Sets.newHashSet;

@Configuration
@EnableSwagger2
public class SwaggerConfig {

    public static final String RESOURCES = "com.example.exampleapi.resource";

    /**
     * conf do swagger
     *
     * @return
     */
    @Bean
    public Docket apiDoc(final Environment environment) {

        final List<String> profiles = Arrays.asList(environment.getActiveProfiles());

        final String description = "Api exemplo em arquitetura limpa";

        final ApiInfo build = new ApiInfoBuilder().title("Voce esta no ambiente: " + profiles.toString())
                .description(description)
                .build();

        return new Docket(DocumentationType.SWAGGER_2).select()
                .apis(RequestHandlerSelectors.basePackage(RESOURCES))
                .paths(PathSelectors.any())
                .build()
                .protocols(newHashSet("http", "https"))
                .apiInfo(build)
                .enableUrlTemplating(false);
    }

}
