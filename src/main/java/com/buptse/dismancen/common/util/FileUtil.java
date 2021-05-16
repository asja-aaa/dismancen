package com.buptse.dismancen.common.util;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.TypeReference;
import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.util.List;

/**
 * @ClassName JsonUtil
 * @Description TODO
 * @Author ASJA
 * @Date 2021/5/12 21:59
 * @Version 1.0
 */
public class FileUtil {

    /**
     * JSON文件转String
     * @param filePath
     * @return
     */
    public static String getFileString(String filePath){
        String josnStr = "";
        if("".equals(filePath)){
            System.out.println("please input the fileName，like '?filePath=xxx'");
            return  josnStr;
        }

        try {
            josnStr = FileUtils.readFileToString(new File(filePath),"utf-8");
        } catch (IOException e) {
            System.out.println("file open error , please check the input file name and path");
            e.printStackTrace();
        }
        return  josnStr;
    }




}
