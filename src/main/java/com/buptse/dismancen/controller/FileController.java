package com.buptse.dismancen.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.TypeReference;
import com.buptse.dismancen.common.CommonResult;
import com.buptse.dismancen.common.constant.DATA_TYPE;
import com.buptse.dismancen.common.constant.RESULT;
import com.buptse.dismancen.common.dto.FileDto;
import com.buptse.dismancen.common.util.JsonUtil;
import com.buptse.dismancen.common.util.XmlUtil;
import com.buptse.dismancen.entity.BasicEarthquake;
import com.buptse.dismancen.service.IBasicEarthquakeService;
import com.sun.deploy.security.ValidationState;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.lang.reflect.Type;


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

    @Autowired
    private IBasicEarthquakeService basicEarthquakeService;

    @GetMapping("/input/basicearthquake")
    public @ResponseBody String fileInput(@RequestParam String filePath) throws ClassNotFoundException {

        int index = filePath.indexOf(".");
        FileDto<BasicEarthquake> fileDto = new FileDto<BasicEarthquake>();

        if(DATA_TYPE.JSON.getType().contains(filePath.substring(index+1))) {

            String josnStr = JsonUtil.getJsonString(filePath);
            if("".equals(josnStr)){ return JSON.toJSONString(CommonResult.failFast(RESULT.FILE_PATH_ERROR)); }
            fileDto = JSON.parseObject(josnStr,new TypeReference<FileDto<BasicEarthquake>>(){});

        }else if(DATA_TYPE.XML.getType().contains(filePath.substring(index+1))) {

            fileDto = XmlUtil.convertXmlFileToObject(new FileDto<BasicEarthquake>(){}.getClass(), filePath);

        }else{
            return JSON.toJSONString(CommonResult.failFast(RESULT.FILE_TYPE_ERROR));
        }



        if(!basicEarthquakeService.saveOrUpdateBatch(fileDto.getDisasterInfo().getInfo())){
           return JSON.toJSONString(CommonResult.failFast(RESULT.SAVE_OR_UPDATE_ERROR));
        }

        return JSON.toJSONString(CommonResult.failFast(RESULT.SUCCESS));

    }

}
