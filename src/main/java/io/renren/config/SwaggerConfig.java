package io.renren.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
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
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.ArrayList;
import java.util.List;

/**
 * swagger配置
 *
 * @author huyi
 * @create 2017/12/15 16:33
 */
@Configuration
@ComponentScan(basePackages ={"io.renren.modules.**.controller"})
public class SwaggerConfig {
    @Bean
    public Docket createRestApi() {
        //可以添加多个header或参数
        ParameterBuilder aParameterBuilder = new ParameterBuilder();
        aParameterBuilder
                .parameterType("header") //参数类型支持header, cookie, body, query etc
                .name("token") //参数名
                .defaultValue("62e347f496276d89aab103bbcc27c74b") //默认值
                .description("header中token字段测试")
                .modelRef(new ModelRef("string"))//指定参数值的类型
                .required(false).build(); //非必需，这里是全局配置，然而在登陆的时候是不用验证的
        List<Parameter> aParameters = new ArrayList<Parameter>();
        aParameters.add(aParameterBuilder.build());
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo1())
                .useDefaultResponseMessages(false)
                .select().paths(PathSelectors.any())
              /*  .apis(RequestHandlerSelectors.basePackage("io.renren.modules.sys.controller"))*/
                .build().globalOperationParameters(aParameters);

     /*   return new Docket(DocumentationType.SWAGGER_2).groupName("v2").select().apis(RequestHandlerSelectors.basePackage("io.renren.modules.*.controller"))
                .paths(PathSelectors.ant("/api/v2/**")).build().apiInfo(apiInfo1()).globalOperationParameters(aParameters);*/
    }

    private ApiInfo apiInfo1() {
        return new ApiInfoBuilder()
                .title("renren-fast")
                .termsOfServiceUrl("www.example.com")
                .contact(new Contact("huyi","http://blog.csdn.net/pc_gad","hilin2333@gmail.com"))
                .version("v0.01")
                .build();
    }

}
