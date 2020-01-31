package com.imust.exception;

/**
 * Author: wangJianBo
 * Date: 2020/1/31 16:53
 * Content:
 */

/**
 * 自定义异常类
 */
public class SysException extends Exception{

    private String message;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public SysException(String message) {
        this.message = message;
    }
}
