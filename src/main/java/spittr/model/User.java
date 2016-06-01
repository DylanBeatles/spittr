/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2016 All Rights Reserved.
 */
package spittr.model;

import javax.validation.constraints.Max;

import com.sun.istack.internal.NotNull;

/**
 * 
 * @author wb-zhanglu.y
 * @version $Id: User.java, v 0.1 May 31, 2016 4:13:47 PM wb-zhanglu.y Exp $
 */
public class User {
    @NotNull
    @Max(value = 30)
    private String name;

    @NotNull
    private String passWord;

    /**
     * Getter method for property <tt>name</tt>.
     * 
     * @return property value of name
     */
    public String getName() {
        return name;
    }

    /**
     * Setter method for property <tt>name</tt>.
     * 
     * @param name value to be assigned to property name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Getter method for property <tt>passWord</tt>.
     * 
     * @return property value of passWord
     */
    public String getPassWord() {
        return passWord;
    }

    /**
     * Setter method for property <tt>passWord</tt>.
     * 
     * @param passWord value to be assigned to property passWord
     */
    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

}
