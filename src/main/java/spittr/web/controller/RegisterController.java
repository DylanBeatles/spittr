/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2016 All Rights Reserved.
 */
package spittr.web.controller;

import java.io.File;
import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.Errors;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

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

    /**
     * 
     * 
     * @param profilePicture 用户上传头像图片
     * @param errors validate错误信息
     * @param user 
     * @param modelMap
     * @return
     */
    @RequestMapping(value = "/register.htm", method = RequestMethod.POST)
    public String register(@RequestPart("profilePicture") MultipartFile profilePicture,
                           Errors errors, @Validated User user, ModelMap modelMap) {
        this.userService.createUser(user);
        modelMap.put("user", user);
        try {
            profilePicture.transferTo(new File("/data/spittr/"
                                               + profilePicture.getOriginalFilename()));
        } catch (IllegalStateException e) {
        } catch (IOException e) {
        }
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
