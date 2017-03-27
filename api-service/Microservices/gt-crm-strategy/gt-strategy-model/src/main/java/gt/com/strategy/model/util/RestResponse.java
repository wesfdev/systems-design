/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gt.com.strategy.model.util;

import java.io.Serializable;

/**
 *
 * @author alex
 * @param <T>
 */
public class RestResponse<T> implements Serializable{
    public static final String SUCCESS = "SUCCESS";
    public static final String ERROR = "FAIL";
    public static final Integer OK = 200;
    public static final Integer UNKNOW_EXCEPTION = 500;
    
    private Integer code;
    private String description;
    private T source;

    public RestResponse(Integer code, String description, T source) {
        this.code = code;
        this.description = description;
        this.source = source;
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

    public T getSource() {
        return source;
    }

    public void setSource(T source) {
        this.source = source;
    }
    
    
}
