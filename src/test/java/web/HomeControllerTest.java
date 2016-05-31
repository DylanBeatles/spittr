/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2016 All Rights Reserved.
 */
package web;

import org.junit.Test;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import spittr.web.controller.HomeController;

/**
 * 
 * @author wb-zhanglu.y
 * @version $Id: HomeControllerTest.java, v 0.1 May 31, 2016 1:14:05 PM wb-zhanglu.y Exp $
 */
public class HomeControllerTest {
    private HomeController homeController;

    @Test
    public void testhome() throws Exception {
        homeController = new HomeController();
        MockMvc mockMvc = MockMvcBuilders.standaloneSetup(homeController).build();
        mockMvc.perform(MockMvcRequestBuilders.get("/home.htm")).andExpect(
            MockMvcResultMatchers.view().name("index"));
    }
}
