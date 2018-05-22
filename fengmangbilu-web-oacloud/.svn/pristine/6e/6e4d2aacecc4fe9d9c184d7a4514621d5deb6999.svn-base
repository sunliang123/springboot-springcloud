package com.fengmangbilu.oacloud;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import com.fengmangbilu.config.EnableDefaultWebMvc;
import com.fengmangbilu.config.EnableRedisCache;
import com.google.common.collect.Lists;

import io.swagger.annotations.Api;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.ParameterBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.schema.ModelRef;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.service.Parameter;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger.web.SwaggerResource;
import springfox.documentation.swagger.web.SwaggerResourcesProvider;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@EnableSwagger2
@EnableZuulProxy
@EnableRedisCache
@EnableFeignClients
@EnableDefaultWebMvc
@SpringCloudApplication
public class OaCloudApplication {

    public static void main(String[] args) {
        SpringApplication.run(OaCloudApplication.class, args);
    }
    
    @Bean
    public Docket createRestApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .select()
                .apis(RequestHandlerSelectors.withClassAnnotation(Api.class))
                .paths(PathSelectors.any())
                .build()
                .globalOperationParameters(Lists.newArrayList(parameter()))
                .useDefaultResponseMessages(false);
    }

    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("web网关")
                .description("")
                .contact(new Contact("Justice","","314922957@qq.com"))
                .version("1.0")
                .build();
    }
    
    private Parameter parameter() {
    	return new ParameterBuilder()
				.name("Authorization")
				.description("token")
				.modelRef(new ModelRef("string"))
				.parameterType("header")
				.required(false)
				.build();
    }
    
	@Primary
	@Component
	@Configuration
	public class DocumentationController implements SwaggerResourcesProvider {

		@Override
		public List<SwaggerResource> get() {
			List<SwaggerResource> resources = new ArrayList<SwaggerResource>();
			resources.add(swaggerResource("user", "/user/v2/api-docs"));
			resources.add(swaggerResource("oa", "/oa/v2/api-docs"));
			resources.add(swaggerResource("support", "/support/v2/api-docs"));
			return resources;
		}

		private SwaggerResource swaggerResource(String name, String location) {
			SwaggerResource swaggerResource = new SwaggerResource();
			swaggerResource.setName(name);
			swaggerResource.setLocation(location);
			swaggerResource.setSwaggerVersion(DocumentationType.SWAGGER_2.getVersion());
			return swaggerResource;
		}

	}

}
