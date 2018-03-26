package com.lexin;

import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class ApiResponse {

    private static String DEFAULT_MSG = "success";
    private static int DEFAULT_CODE = 200;

    private int code;
    private String message;
    private Object data;

    public ApiResponse(Object data) {
        this(DEFAULT_CODE, DEFAULT_MSG, data);
    }


    public ApiResponse(int code, String message, Object data) {
        this.code = code;
        if (StringUtils.isNotEmpty(message)) {
            this.message = message;
        }
        this.data = data;
    }


    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }


    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return ReflectionToStringBuilder.toString(this);
    }
}
