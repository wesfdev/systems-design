/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gt.com.budget.model.util;

import java.io.Serializable;

/**
 *
 * @author alex
 */
public class RestResponse <T> implements Serializable
{
    public static final String SUCCES = "SUCCESS";
    public static final String ERROR = "FAIL";
    public static final Integer OK = 200;
    public static final Integer UNKNOW_EXEPTION = 500;
    
    private Integer code;
    private String description;
    private T souce;

    public RestResponse(Integer code, String description, T souce) {
        this.code = code;
        this.description = description;
        this.souce = souce;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public T getSouce() {
        return souce;
    }

    public void setSouce(T souce) {
        this.souce = souce;
    }
    
    
}
