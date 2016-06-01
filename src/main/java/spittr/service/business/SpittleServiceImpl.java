/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2016 All Rights Reserved.
 */
package spittr.service.business;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Component;

import spittr.model.Spittle;

/**
 * 
 * @author wb-zhanglu.y
 * @version $Id: SpittleServiceImpl.java, v 0.1 Jun 1, 2016 7:04:36 PM wb-zhanglu.y Exp $
 */
@Component
public class SpittleServiceImpl implements SpittleService {
    private static final Map<Integer, Spittle> spittleRspority = new HashMap<Integer, Spittle>();

    static {
        Spittle spittle = new Spittle();
        spittle.setContent("conntent1111");
        spittle.setDate("20160101");
        spittle.setTitle("title111");
        spittleRspority.put(1, spittle);
    }

    /** 
     * @see spittr.service.business.SpittleService#getSpittleById(int)
     */
    public Spittle getSpittleById(int id) {
        return spittleRspority.get(id);
    }

}
