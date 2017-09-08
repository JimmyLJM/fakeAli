package com.jimmy.springBootDemo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * swagger2 Restful api
 * author : jimmyLJM
 * @Configuration     让Spring来加载该类配置
 * @EnableSwagger2    启用Swagger2。
 * @Bean              创建Docket bean 放置于spring容器
 */
@Configuration
@EnableSwagger2
public class swagger2 extends WebMvcConfigurerAdapter {
    /**
     * 这个地方要重新注入一下资源文件，不然不会注入资源的，也没有注入requestHandlerMappping,相当于xml配置的
     *  <!--swagger资源配置-->
     *  <mvc:resources location="classpath:/META-INF/resources/" mapping="swagger-ui.html"/>
     *  <mvc:resources location="classpath:/META-INF/resources/webjars/" mapping="/webjars/**"/>
     *  不知道为什么，这也是spring boot的一个缺点（菜鸟觉得的）
     * @param registry
     */
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("swagger-ui.html")
                .addResourceLocations("classpath:/META-INF/resources/");
        registry.addResourceHandler("/webjars*")
                .addResourceLocations("classpath:/META-INF/resources/webjars/");
    }


    @Bean
    public Docket api(){
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .select()                               // 选择那些路径和api会生成document
//                .apis(RequestHandlerSelectors.any())    // 对所有api进行监控
                .apis(RequestHandlerSelectors.basePackage("com.jimmy.springBootDemo.controller"))
                .paths(PathSelectors.any())             // 对所有路径进行监控
                .build();
    }


    public ApiInfo apiInfo() {

        Contact contact = new Contact("jimmy","https://github.com/JimmyLJM/","ljm506937617@163.com");
        return new ApiInfoBuilder()
                .title("Spring Boot中使用Swagger2构建RESTful APIs")
                .description("Spring Boot Notes 准备中……")
                .contact(contact)
                .version("1.0")
                .build();
    }
}
