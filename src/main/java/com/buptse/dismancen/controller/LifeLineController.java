package com.buptse.dismancen.controller;


import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.TypeReference;
import com.buptse.dismancen.common.CommonResult;
import com.buptse.dismancen.common.constant.DATA_TYPE;
import com.buptse.dismancen.common.constant.RESULT;
import com.buptse.dismancen.common.dto.DisasterInfo;
import com.buptse.dismancen.common.dto.FileDto;
import com.buptse.dismancen.common.util.FileUtil;
import com.buptse.dismancen.entity.BasicEarthquake;
import com.buptse.dismancen.entity.LifeLine;
import com.buptse.dismancen.service.ILifeLineService;
import com.thoughtworks.xstream.XStream;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author ASJA
 * @since 2021-05-12
 */
@RestController
@RequestMapping("//life-line")
public class LifeLineController {

    @Autowired
    private ILifeLineService service;

    @GetMapping("/inputlocalfile")
    public @ResponseBody
    String fileInputLifeline(@RequestParam String filePath)  {

        int index = filePath.indexOf(".");
        String Str = FileUtil.getFileString(filePath);
        if(DATA_TYPE.JSON.getType().contains(filePath.substring(index+1))) {

            if("".equals(Str)){ return JSON.toJSONString(CommonResult.failFast(RESULT.FILE_PATH_ERROR)); }
            FileDto<LifeLine> fileDto = JSON.parseObject(Str,new TypeReference<FileDto<LifeLine>>(){});

            if(fileDto == null||fileDto.getDisasterInfo()==null){
                return JSON.toJSONString(CommonResult.failFast(RESULT.FILE_CONVERT_TO_OBJECT_ERROR));
            }

            service.saveAllNoRepeat(fileDto.getDisasterInfo().getInfo());

//            // 这个方法为mybatis-plus方法  会有重复
//            if(!service.saveOrUpdateBatch(fileDto.getDisasterInfo().getInfo())){
//                return JSON.toJSONString(CommonResult.failFast(RESULT.SAVE_OR_UPDATE_ERROR));
//            }

        }else if(DATA_TYPE.XML.getType().contains(filePath.substring(index+1))) {

            XStream xstream = new XStream();
            xstream .processAnnotations( new Class[] { DisasterInfo.class ,LifeLine.class });
            xstream.autodetectAnnotations(true);

            DisasterInfo<LifeLine> disasterInfo = (DisasterInfo<LifeLine>) xstream.fromXML(Str);
            if(disasterInfo==null){
                return JSON.toJSONString(CommonResult.failFast(RESULT.FILE_CONVERT_TO_OBJECT_ERROR));
            }

            service.saveAllNoRepeat(disasterInfo.getInfo());

//            // 这个方法为mybatis-plus方法  会有重复
//            if(!service.saveOrUpdateBatch(disasterInfo.getInfo())){
//                return JSON.toJSONString(CommonResult.failFast(RESULT.SAVE_OR_UPDATE_ERROR));
//            }


        }else{
            return JSON.toJSONString(CommonResult.failFast(RESULT.FILE_TYPE_ERROR));
        }

        return JSON.toJSONString(CommonResult.failFast(RESULT.SUCCESS));

    }

    @GetMapping("/outputlocalfile")
    public @ResponseBody
    CommonResult fileOutputBasicEqrthquake(@RequestParam String filePath){
        List<LifeLine> lifeLineList = service.list();
        DisasterInfo<LifeLine> disasterInfo = new DisasterInfo<>(lifeLineList);
        FileDto<LifeLine> fileDto = new FileDto<>(disasterInfo);

        int index = filePath.indexOf(".");

        if(DATA_TYPE.JSON.getType().contains(filePath.substring(index+1))){
            String strJson = JSON.toJSONString(fileDto);
            if(!FileUtil.writeStringToFile(filePath,strJson)){
                return CommonResult.failFast(RESULT.FILE_OUTPUT_ERROR);
            }

        }else if(DATA_TYPE.XML.getType().contains(filePath.substring(index+1))){
            XStream xstream = new XStream();
            xstream .processAnnotations( new Class[] { DisasterInfo.class ,LifeLine.class });
            xstream.autodetectAnnotations(true);
            xstream.aliasSystemAttribute(null, "class"); // 去掉 class 属性
            String strXml = xstream.toXML(fileDto.getDisasterInfo());

            if(!FileUtil.writeStringToFile(filePath,strXml)){
                return CommonResult.failFast(RESULT.FILE_OUTPUT_ERROR);
            }
        }else{
            return CommonResult.failFast(RESULT.FILE_TYPE_ERROR);
        }

        return CommonResult.failFast(RESULT.SUCCESS);

    }

}
