/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2016 All Rights Reserved.
 */
package spittr.config;

import javax.servlet.MultipartConfigElement;
import javax.servlet.ServletRegistration.Dynamic;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import spittr.service.config.RootConfig;
import spittr.web.config.WebConfig;

/**
 * 
 * @author wb-zhanglu.y
 * @version $Id: SpittrWebAppInitializer.java, v 0.1 May 31, 2016 2:07:09 PM wb-zhanglu.y Exp $
 */
public class SpittrWebAppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

    /** 
     * @see org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer#getRootConfigClasses()
     */
    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class<?>[] { RootConfig.class };
    }

    /** 
     * @see org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer#getServletConfigClasses()
     */
    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class<?>[] { WebConfig.class };
    }

    /** 
     * @see org.springframework.web.servlet.support.AbstractDispatcherServletInitializer#getServletMappings()
     */
    @Override
    protected String[] getServletMappings() {
        return new String[] { "/" };
    }

    /**
     * 支持文件上传的配置
     * @see org.springframework.web.servlet.support.AbstractDispatcherServletInitializer#customizeRegistration(javax.servlet.ServletRegistration.Dynamic)
     */
    @Override
    protected void customizeRegistration(Dynamic registration) {
        /**
         * the first parameter means the uploaded file saved path
         * second:max size of uploaded file
         * third:max size of the request
         */
        registration.setMultipartConfig(new MultipartConfigElement("/tmp/spittr/uploads", 2048000,
            4194304, 0));
    }

}
