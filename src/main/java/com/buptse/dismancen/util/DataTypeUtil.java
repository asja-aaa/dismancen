package com.buptse.dismancen.util;

import com.buptse.dismancen.entity.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @ClassName DataTypeUtil
 * @Description TODO
 * @Author ASJA
 * @Date 2021/5/12 21:24
 * @Version 1.0
 */
public class DataTypeUtil {
    public static final HashMap datetype = new HashMap<String ,String>(){{
        put("1", "BasicEarthquake");
        put("2", "Forecast");
        put("3", "HouseDestory");
        put("4", "LifeLine");
        put("5", "PeoLoss");
        put("6","SecDisaster");
    }};

}
