package com.utils;

import org.springframework.core.convert.converter.Converter;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 把字符串转换成日期
 */
public class ConverterUtil implements Converter<String, Date> {
    /**
     * Convert the source object of type {@code S} to target type {@code T}.
     *
     * @param source the source object to convert, which must be an instance of {@code S} (never {@code null})
     * @return the converted object, which must be an instance of {@code T} (potentially {@code null})
     * @throws IllegalArgumentException if the source cannot be converted to the desired target type
     */
    @Override
    public Date convert(String source) {
        //判断
        if (source==null){
            throw new RuntimeException("source为空！");
        }
        DateFormat df=new SimpleDateFormat("yyyy-MM-dd");
        //把字符串转换成日期
        try {
           return df.parse(source);
        } catch (ParseException e) {
            throw new RuntimeException("数据类型转换出错！");
        }
    }
}
