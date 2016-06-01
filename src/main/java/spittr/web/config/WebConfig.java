/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2016 All Rights Reserved.
 */
package spittr.web.config;

import java.io.IOException;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.multipart.MultipartResolver;
import org.springframework.web.multipart.support.StandardServletMultipartResolver;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

/**
 * 
 * @author wb-zhanglu.y
 * @version $Id: WebConfig.java, v 0.1 May 31, 2016 11:16:42 AM wb-zhanglu.y Exp $
 */
@Configuration
@ComponentScan("spittr.web.controller")
@EnableWebMvc
public class WebConfig extends WebMvcConfigurerAdapter {
    @Bean
    public ViewResolver viewResolver() {
        InternalResourceViewResolver resolver = new InternalResourceViewResolver();
        resolver.setPrefix("/views/");
        resolver.setSuffix(".jsp");
        resolver.setExposeContextBeansAsAttributes(true);
        return resolver;
    }

    /**
     * 声明一个文件上传处理器
     * 
     * @return
     * @throws IOException
     */
    @Bean
    public MultipartResolver multipartResolver() throws IOException {
        return new StandardServletMultipartResolver();
    }

    /**
     * 声明一个rest视图处理器
     * 
     * @return
     */
    //    @Bean
    //    public ViewResolver cnViewResolver(ContentNegotiationManager cnManager) {
    //        ContentNegotiatingViewResolver cnViewResolver = new ContentNegotiatingViewResolver();
    //        cnViewResolver.setContentNegotiationManager(cnManager);
    //        return cnViewResolver;
    //    }

    /**
     * 声明默认的rest数据类型，当rest视图处理器无法识别客户端需要的数据类型，该配置起作用
     * @see org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter#configureContentNegotiation(org.springframework.web.servlet.config.annotation.ContentNegotiationConfigurer)
     */
    //    @Override
    //    public void configureContentNegotiation(ContentNegotiationConfigurer configurer) {
    //        configurer.defaultContentType(MediaType.APPLICATION_JSON);
    //    }

    @Override
    public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
        configurer.enable();
    }
}
