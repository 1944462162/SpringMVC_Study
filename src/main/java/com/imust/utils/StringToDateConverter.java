package com.imust.utils;

import org.springframework.core.convert.converter.Converter;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Author: wangJianBo
 * Date: 2020/1/30 18:43
 * Content:
 */
public class StringToDateConverter implements Converter<String, Date> {

    /**
     * 自定义转换格式步骤：
     *
     * 1.编写类型转换器的类
     * 2.在配置文件中配置自定义类型转换器
     * 3.在开启SpringMVC注解的支持中导入自定义的类型转换器
     *
     * @param source 传入转进的字符串
     * @return
     */
    @Override
    public Date convert(String source) {
        if (source == null){
            throw new RuntimeException("没有传入数据");
        }
        else{
            DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
            try {
                return dateFormat.parse(source);
            } catch (ParseException e) {
                throw new RuntimeException("类型转换出现错误");
            }
        }
    }
}
