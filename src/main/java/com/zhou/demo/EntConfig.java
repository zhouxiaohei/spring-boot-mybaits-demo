package com.zhou.demo;

import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

import java.util.Properties;

@Configuration 
public class EntConfig {

    @Value("${spring.swagger.package}")
    private String swagerPackage;
	 /** 
     * 创建API应用 
     * apiInfo() 增加API相关信息 
     * 通过select()函数返回一个ApiSelectorBuilder实例,用来控制哪些接口暴露给Swagger来展现， 
     * 本例采用指定扫描的包路径来定义指定要建立API的目录。 
     *  
     */
    @Bean  
    public Docket createRestApi() {  
        return new Docket(DocumentationType.SWAGGER_2)  
                .apiInfo(apiInfo())  
                .select()  
                .apis(RequestHandlerSelectors.basePackage(swagerPackage)) //swagget扫描目录
                .paths(PathSelectors.any())  
                .build();  
    }  
    
    /** 
     * 创建该API的基本信息（这些基本信息会展现在文档页面中） 
     * 访问地址：http://项目实际地址/swagger-ui.html 
     */
    private ApiInfo apiInfo() {  
        return new ApiInfoBuilder()  
                .title("新企速递")
                .description("新企速递 China DaaS Technology Corp., Ltd")
                .termsOfServiceUrl("http://www.chinadaas.com/")
                .version("1.0")
                .build();  
    }

    @Bean
    public PageHelper pageHelper() {
        PageHelper pageHelper = new PageHelper();
        Properties p = new Properties();
        p.setProperty("offsetAsPageNum", "true");
        p.setProperty("rowBoundsWithCount", "true");
        p.setProperty("reasonable", "true");
        pageHelper.setProperties(p);
        return pageHelper;
    }

}
