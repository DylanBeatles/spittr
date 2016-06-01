/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2016 All Rights Reserved.
 */
package spittr.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import spittr.model.Spittle;
import spittr.service.business.SpittleService;

/**
 * 
 * @author wb-zhanglu.y
 * @version $Id: SpittleController.java, v 0.1 Jun 1, 2016 6:59:31 PM wb-zhanglu.y Exp $
 */
@RestController
public class SpittleController {
    @Autowired
    private SpittleService spittleService;

    @RequestMapping(value = "/readSpittle.htm", headers = "Accept=*/*", method = RequestMethod.GET)
    public Spittle readSpittle(@RequestParam(value = "id", defaultValue = "1") int id) {
        return spittleService.getSpittleById(id);

    }

    /**
     * Getter method for property <tt>spittleService</tt>.
     * 
     * @return property value of spittleService
     */
    public SpittleService getSpittleService() {
        return spittleService;
    }

    /**
     * Setter method for property <tt>spittleService</tt>.
     * 
     * @param spittleService value to be assigned to property spittleService
     */
    public void setSpittleService(SpittleService spittleService) {
        this.spittleService = spittleService;
    }

}
