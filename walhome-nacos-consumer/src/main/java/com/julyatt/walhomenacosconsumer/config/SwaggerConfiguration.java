package com.julyatt.walhomenacosconsumer.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @author guosh28325
 * @Description
 * @date 2020-04-18 11:46
 */

@Configuration
@EnableSwagger2
public class SwaggerConfiguration {
    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("用户中心Restful APIs")
                .description("用户中心API接口文档")
                .termsOfServiceUrl("")
                .version("1.0.0")
                .contact(new Contact("ccsteam", "", "")).build();
    }

    @Bean
    public Docket customImplementation() {
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.julyatt"))
                .paths(PathSelectors.any())
                .build()
                .apiInfo(this.apiInfo()).enable(true);

        //.globalOperationParameters(parameters);
    }
}
