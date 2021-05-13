package com.buptse.dismancen.controller;

import com.alibaba.fastjson.JSON;
import com.buptse.dismancen.entity.BasicEarthquake;
import com.buptse.dismancen.entity.Entity;
import com.buptse.dismancen.util.DataTypeUtil;
import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @ClassName FileController
 * @Description TODO
 * @Author ASJA
 * @Date 2021/5/12 20:34
 * @Version 1.0
 */

@RequestMapping("//file")
@Controller
public class FileController {

    @GetMapping("input")
    public @ResponseBody
    String fileInput(@RequestParam String filePath,
                     @RequestParam String dataType){

        if("".equals(filePath)){
            return "please input the fileName，like '?filePath=xxx'";
        }

        String [] file = filePath.split(".");
        if(file.length > 1){return "please input the correct file Path And Name";}

        if(!DataTypeUtil.datetype.containsKey(dataType)){
            return "please input the correct dataType code , reder=====>>>>>"+JSON.toJSONString(DataTypeUtil.datetype);;
        }
        BufferedReader bufferedReader;
        try {
             bufferedReader = new BufferedReader(new FileReader(filePath));
        } catch (FileNotFoundException e) {
            System.out.println("file open error , please check the input file name and path");
            e.printStackTrace();
        }







    }

}
