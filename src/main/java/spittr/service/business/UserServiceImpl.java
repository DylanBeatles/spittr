/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2016 All Rights Reserved.
 */
package spittr.service.business;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Component;

import spittr.model.User;

/**
 * 
 * @author wb-zhanglu.y
 * @version $Id: UserServiceImpl.java, v 0.1 May 31, 2016 4:16:30 PM wb-zhanglu.y Exp $
 */
@Component
public class UserServiceImpl implements UserService {
    private static Map<Integer, User> userMap  = new HashMap<Integer, User>();

    private static int                maxIndex = 0;

    /** 
     * @see spittr.service.business.UserService#createUser(spittr.model.User)
     */
    public boolean createUser(User user) {
        return userMap.put(maxIndex++, user) != null;
    }

}
