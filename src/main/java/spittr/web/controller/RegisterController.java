/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2016 All Rights Reserved.
 */
package spittr.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import spittr.model.User;
import spittr.service.business.UserService;

/**
 * 
 * @author wb-zhanglu.y
 * @version $Id: RegisterController.java, v 0.1 May 31, 2016 4:13:06 PM wb-zhanglu.y Exp $
 */
@Controller
public class RegisterController {
    @Autowired
    private UserService userService;

    @RequestMapping(value = "/register.htm", method = RequestMethod.POST)
    public String register(User user, ModelMap modelMap) {
        this.userService.createUser(user);
        modelMap.put("user", user);
        return "suscess";
    }

    /**
     * Getter method for property <tt>userService</tt>.
     * 
     * @return property value of userService
     */
    public UserService getUserService() {
        return userService;
    }

    /**
     * Setter method for property <tt>userService</tt>.
     * 
     * @param userService value to be assigned to property userService
     */
    public void setUserService(UserService userService) {
        this.userService = userService;
    }

}
