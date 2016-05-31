/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2016 All Rights Reserved.
 */
package web;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
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
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = HomeController.class)
public class HomeControllerTest {
    @Autowired
    private HomeController homeController;

    @Test
    public void testHomeControllerIsNotNull() {
        Assert.assertNotNull(homeController);
    }

    @Test
    public void testhome() throws Exception {
        MockMvc mockMvc = MockMvcBuilders.standaloneSetup(homeController).build();
        mockMvc.perform(MockMvcRequestBuilders.get("/")).andExpect(
            MockMvcResultMatchers.view().name("index"));
    }
}
