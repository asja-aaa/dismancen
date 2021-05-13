package com.buptse.dismancen.util;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.TypeReference;

import java.util.List;

/**
 * @ClassName JsonUtil
 * @Description TODO
 * @Author ASJA
 * @Date 2021/5/12 21:59
 * @Version 1.0
 */
public class JsonUtil {
    /**
     * 将JSON转换成List对象
     * @param json
     * @param tClass
     * @param <T>
     * @return
     */
    public static <T> List<T> jsonToList(String json, Class<T> tClass){
        @SuppressWarnings("unchecked")
        List<T> list = JSON.parseObject(json,new TypeReference<List<T>>(){});
        return list;
    }

    /**
     * JSON 转换成POJO
     * @param json
     * @param tClass
     * @param <T>
     * @return
     */
    public static <T> T getObject(String json,Class<T> tClass){
        return JSONObject.parseObject(json,tClass);
    }

    /**
     * Entity  转换成JSON
     * @param bean
     * @param <T>
     * @return
     */
    public static <T> String getJSON(T bean){
        String jsonString = JSON.toJSONString(bean);
        return jsonString;
    }


}
