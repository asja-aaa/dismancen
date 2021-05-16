package com.buptse.dismancen.common.util;

import com.thoughtworks.xstream.converters.basic.AbstractSingleValueConverter;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * @ClassName DTZConvert
 * @Description TODO
 * @Author ASJA
 * @Date 2021/5/16 12:06
 * @Version 1.0
 */

public class DTZConverter extends AbstractSingleValueConverter {

    @Override
    public boolean canConvert(Class type) {
        return type.equals(LocalDateTime.class);
    }

    @Override
    public Object fromString(String dtz) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        return LocalDateTime.parse(dtz, formatter);
    }
}