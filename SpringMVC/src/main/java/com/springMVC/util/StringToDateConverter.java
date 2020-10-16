package com.springMVC.util;

import org.springframework.core.convert.converter.Converter;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class StringToDateConverter implements Converter<String, Date> {
    /**
     * 将字符串转为日期
     *
     * @param source
     * @return
     */
    @Override
    public Date convert(String source) {
        if (source == null) {
            throw new RuntimeException("传入数据为空");
        } else {
            DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
            try {
                return dateFormat.parse(source);
            } catch (Exception e) {
                throw new RuntimeException("数据转换出现错误");
            }
        }
    }
}
