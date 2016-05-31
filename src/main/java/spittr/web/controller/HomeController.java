/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2016 All Rights Reserved.
 */
package spittr.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * 
 * @author wb-zhanglu.y
 * @version $Id: Mycontroller.java, v 0.1 May 31, 2016 11:17:26 AM wb-zhanglu.y Exp $
 */
@Controller
public class HomeController {

    @RequestMapping(value = "/home.htm", method = RequestMethod.GET)
    public String home() {
        return "index";
    }

}
