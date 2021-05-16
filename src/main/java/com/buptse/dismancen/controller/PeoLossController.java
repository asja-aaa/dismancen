package com.buptse.dismancen.controller;


import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.TypeReference;
import com.buptse.dismancen.common.CommonResult;
import com.buptse.dismancen.common.constant.DATA_TYPE;
import com.buptse.dismancen.common.constant.RESULT;
import com.buptse.dismancen.common.dto.DisasterInfo;
import com.buptse.dismancen.common.dto.FileDto;
import com.buptse.dismancen.common.util.FileUtil;
import com.buptse.dismancen.entity.PeoLoss;
import com.buptse.dismancen.service.IPeoLossService;
import com.thoughtworks.xstream.XStream;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author ASJA
 * @since 2021-05-12
 */
@RestController
@RequestMapping("//peo-loss")
public class PeoLossController {

    @Autowired
    private IPeoLossService service;

    @GetMapping("/inputlocalfile")
    public @ResponseBody
    String fileInputPeoloss(@RequestParam String filePath)  {

        int index = filePath.indexOf(".");
        String Str = FileUtil.getFileString(filePath);
        if(DATA_TYPE.JSON.getType().contains(filePath.substring(index+1))) {

            if("".equals(Str)){ return JSON.toJSONString(CommonResult.failFast(RESULT.FILE_PATH_ERROR)); }
            FileDto<PeoLoss> fileDto = JSON.parseObject(Str,new TypeReference<FileDto<PeoLoss>>(){});

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
            xstream .processAnnotations( new Class[] { DisasterInfo.class ,PeoLoss.class });
            xstream.autodetectAnnotations(true);

            DisasterInfo<PeoLoss> disasterInfo = (DisasterInfo<PeoLoss>) xstream.fromXML(Str);
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
}
