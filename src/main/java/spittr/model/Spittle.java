/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2016 All Rights Reserved.
 */
package spittr.model;

import java.io.Serializable;

/**
 * 
 * @author wb-zhanglu.y
 * @version $Id: Spittle.java, v 0.1 Jun 1, 2016 6:54:55 PM wb-zhanglu.y Exp $
 */
public class Spittle implements Serializable {

    /**  */
    private static final long serialVersionUID = 1L;

    private String            title;

    private String            content;

    private String            date;

    /**
     * Getter method for property <tt>title</tt>.
     * 
     * @return property value of title
     */
    public String getTitle() {
        return title;
    }

    /**
     * Setter method for property <tt>title</tt>.
     * 
     * @param title value to be assigned to property title
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * Getter method for property <tt>content</tt>.
     * 
     * @return property value of content
     */
    public String getContent() {
        return content;
    }

    /**
     * Setter method for property <tt>content</tt>.
     * 
     * @param content value to be assigned to property content
     */
    public void setContent(String content) {
        this.content = content;
    }

    /**
     * Getter method for property <tt>date</tt>.
     * 
     * @return property value of date
     */
    public String getDate() {
        return date;
    }

    /**
     * Setter method for property <tt>date</tt>.
     * 
     * @param date value to be assigned to property date
     */
    public void setDate(String date) {
        this.date = date;
    }

}
