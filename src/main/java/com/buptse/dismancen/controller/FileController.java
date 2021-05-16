//package com.buptse.dismancen.controller;
//
//import com.alibaba.fastjson.JSON;
//import com.alibaba.fastjson.TypeReference;
//import com.buptse.dismancen.common.CommonResult;
//import com.buptse.dismancen.common.constant.DATA_TYPE;
//import com.buptse.dismancen.common.constant.RESULT;
//import com.buptse.dismancen.common.dto.DisasterInfo;
//import com.buptse.dismancen.common.dto.FileDto;
//import com.buptse.dismancen.common.util.FileUtil;
//import com.buptse.dismancen.entity.BasicEarthquake;
//import com.buptse.dismancen.service.*;
//import com.thoughtworks.xstream.XStream;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.*;
//
//
//
///**
// * @ClassName FileController
// * @Description TODO
// * @Author ASJA
// * @Date 2021/5/12 20:34
// * @Version 1.0
// */
//
//@RequestMapping("//file")
//@Controller
//@Deprecated
//public class FileController {
//
//    @Autowired
//    private IBasicEarthquakeService basicEarthquakeService;
//
//    @Autowired
//    private IForecastService forecastService;
//
//    @Autowired
//    private IHouseDestoryService houseDestoryService;
//
//    @Autowired
//    private ILifeLineService lifeLineService;
//
//    @Autowired
//    private IPeoLossService peoLossService;
//
//    @Autowired
//    private ISecDisasterService secDisasterService;
//
//
//
//    @GetMapping("/input")
//    public @ResponseBody String fileInputBasicEarthquake(@RequestParam String filePath) {
//
//        int index = filePath.indexOf(".");
//        String Str = FileUtil.getFileString(filePath);
//        if(DATA_TYPE.JSON.getType().contains(filePath.substring(index+1))) {
//
//            if("".equals(Str)){ return JSON.toJSONString(CommonResult.failFast(RESULT.FILE_PATH_ERROR)); }
//            FileDto<BasicEarthquake> fileDto = JSON.parseObject(Str,new TypeReference<FileDto<BasicEarthquake>>(){});
//
//            if(fileDto == null||fileDto.getDisasterInfo()==null){
//                return JSON.toJSONString(CommonResult.failFast(RESULT.FILE_CONVERT_TO_OBJECT_ERROR));
//            }
//
//            basicEarthquakeService.saveAllNoRepeat(fileDto.getDisasterInfo().getInfo());
//
////            // 这个方法为mybatis-plus方法  会有重复
////            if(!basicEarthquakeService.saveOrUpdateBatch(fileDto.getDisasterInfo().getInfo())){
////                return JSON.toJSONString(CommonResult.failFast(RESULT.SAVE_OR_UPDATE_ERROR));
////            }
//
//        }else if(DATA_TYPE.XML.getType().contains(filePath.substring(index+1))) {
//
//            XStream xstream = new XStream();
//            xstream .processAnnotations( new Class[] { DisasterInfo.class ,BasicEarthquake.class });
//            xstream.autodetectAnnotations(true);
//
//            DisasterInfo<BasicEarthquake> disasterInfo = (DisasterInfo<BasicEarthquake>) xstream.fromXML(Str);
//            if(disasterInfo==null){
//                return JSON.toJSONString(CommonResult.failFast(RESULT.FILE_CONVERT_TO_OBJECT_ERROR));
//            }
//
//            basicEarthquakeService.saveAllNoRepeat(disasterInfo.getInfo());
//
////            // 这个方法为mybatis-plus方法  会有重复
////            if(!basicEarthquakeService.saveOrUpdateBatch(disasterInfo.getInfo())){
////                return JSON.toJSONString(CommonResult.failFast(RESULT.SAVE_OR_UPDATE_ERROR));
////            }
//
//
//        }else{
//            return JSON.toJSONString(CommonResult.failFast(RESULT.FILE_TYPE_ERROR));
//        }
//
//        return JSON.toJSONString(CommonResult.failFast(RESULT.SUCCESS));
//
//    }
//
//    @GetMapping("/input")
//    public @ResponseBody String fileInputForecast(@RequestParam String filePath)  {
//
//        int index = filePath.indexOf(".");
//        String Str = FileUtil.getFileString(filePath);
//        if(DATA_TYPE.JSON.getType().contains(filePath.substring(index+1))) {
//
//            if("".equals(Str)){ return JSON.toJSONString(CommonResult.failFast(RESULT.FILE_PATH_ERROR)); }
//            FileDto<BasicEarthquake> fileDto = JSON.parseObject(Str,new TypeReference<FileDto<BasicEarthquake>>(){});
//
//            if(fileDto == null||fileDto.getDisasterInfo()==null){
//                return JSON.toJSONString(CommonResult.failFast(RESULT.FILE_CONVERT_TO_OBJECT_ERROR));
//            }
//
//            basicEarthquakeService.saveAllNoRepeat(fileDto.getDisasterInfo().getInfo());
//
////            // 这个方法为mybatis-plus方法  会有重复
////            if(!basicEarthquakeService.saveOrUpdateBatch(fileDto.getDisasterInfo().getInfo())){
////                return JSON.toJSONString(CommonResult.failFast(RESULT.SAVE_OR_UPDATE_ERROR));
////            }
//
//        }else if(DATA_TYPE.XML.getType().contains(filePath.substring(index+1))) {
//
//            XStream xstream = new XStream();
//            xstream .processAnnotations( new Class[] { DisasterInfo.class ,BasicEarthquake.class });
//            xstream.autodetectAnnotations(true);
//
//            DisasterInfo<BasicEarthquake> disasterInfo = (DisasterInfo<BasicEarthquake>) xstream.fromXML(Str);
//            if(disasterInfo==null){
//                return JSON.toJSONString(CommonResult.failFast(RESULT.FILE_CONVERT_TO_OBJECT_ERROR));
//            }
//
//            basicEarthquakeService.saveAllNoRepeat(disasterInfo.getInfo());
//
////            // 这个方法为mybatis-plus方法  会有重复
////            if(!basicEarthquakeService.saveOrUpdateBatch(disasterInfo.getInfo())){
////                return JSON.toJSONString(CommonResult.failFast(RESULT.SAVE_OR_UPDATE_ERROR));
////            }
//
//
//        }else{
//            return JSON.toJSONString(CommonResult.failFast(RESULT.FILE_TYPE_ERROR));
//        }
//
//        return JSON.toJSONString(CommonResult.failFast(RESULT.SUCCESS));
//
//    }
//
//    @GetMapping("/input")
//    public @ResponseBody String fileInputHouseDestory(@RequestParam String filePath)  {
//
//        int index = filePath.indexOf(".");
//        String Str = FileUtil.getFileString(filePath);
//        if(DATA_TYPE.JSON.getType().contains(filePath.substring(index+1))) {
//
//            if("".equals(Str)){ return JSON.toJSONString(CommonResult.failFast(RESULT.FILE_PATH_ERROR)); }
//            FileDto<BasicEarthquake> fileDto = JSON.parseObject(Str,new TypeReference<FileDto<BasicEarthquake>>(){});
//
//            if(fileDto == null||fileDto.getDisasterInfo()==null){
//                return JSON.toJSONString(CommonResult.failFast(RESULT.FILE_CONVERT_TO_OBJECT_ERROR));
//            }
//
//            basicEarthquakeService.saveAllNoRepeat(fileDto.getDisasterInfo().getInfo());
//
////            // 这个方法为mybatis-plus方法  会有重复
////            if(!basicEarthquakeService.saveOrUpdateBatch(fileDto.getDisasterInfo().getInfo())){
////                return JSON.toJSONString(CommonResult.failFast(RESULT.SAVE_OR_UPDATE_ERROR));
////            }
//
//        }else if(DATA_TYPE.XML.getType().contains(filePath.substring(index+1))) {
//
//            XStream xstream = new XStream();
//            xstream .processAnnotations( new Class[] { DisasterInfo.class ,BasicEarthquake.class });
//            xstream.autodetectAnnotations(true);
//
//            DisasterInfo<BasicEarthquake> disasterInfo = (DisasterInfo<BasicEarthquake>) xstream.fromXML(Str);
//            if(disasterInfo==null){
//                return JSON.toJSONString(CommonResult.failFast(RESULT.FILE_CONVERT_TO_OBJECT_ERROR));
//            }
//
//            basicEarthquakeService.saveAllNoRepeat(disasterInfo.getInfo());
//
////            // 这个方法为mybatis-plus方法  会有重复
////            if(!basicEarthquakeService.saveOrUpdateBatch(disasterInfo.getInfo())){
////                return JSON.toJSONString(CommonResult.failFast(RESULT.SAVE_OR_UPDATE_ERROR));
////            }
//
//
//        }else{
//            return JSON.toJSONString(CommonResult.failFast(RESULT.FILE_TYPE_ERROR));
//        }
//
//        return JSON.toJSONString(CommonResult.failFast(RESULT.SUCCESS));
//
//    }
//
//    @GetMapping("/input")
//    public @ResponseBody String fileInputLifeline(@RequestParam String filePath)  {
//
//        int index = filePath.indexOf(".");
//        String Str = FileUtil.getFileString(filePath);
//        if(DATA_TYPE.JSON.getType().contains(filePath.substring(index+1))) {
//
//            if("".equals(Str)){ return JSON.toJSONString(CommonResult.failFast(RESULT.FILE_PATH_ERROR)); }
//            FileDto<BasicEarthquake> fileDto = JSON.parseObject(Str,new TypeReference<FileDto<BasicEarthquake>>(){});
//
//            if(fileDto == null||fileDto.getDisasterInfo()==null){
//                return JSON.toJSONString(CommonResult.failFast(RESULT.FILE_CONVERT_TO_OBJECT_ERROR));
//            }
//
//            basicEarthquakeService.saveAllNoRepeat(fileDto.getDisasterInfo().getInfo());
//
////            // 这个方法为mybatis-plus方法  会有重复
////            if(!basicEarthquakeService.saveOrUpdateBatch(fileDto.getDisasterInfo().getInfo())){
////                return JSON.toJSONString(CommonResult.failFast(RESULT.SAVE_OR_UPDATE_ERROR));
////            }
//
//        }else if(DATA_TYPE.XML.getType().contains(filePath.substring(index+1))) {
//
//            XStream xstream = new XStream();
//            xstream .processAnnotations( new Class[] { DisasterInfo.class ,BasicEarthquake.class });
//            xstream.autodetectAnnotations(true);
//
//            DisasterInfo<BasicEarthquake> disasterInfo = (DisasterInfo<BasicEarthquake>) xstream.fromXML(Str);
//            if(disasterInfo==null){
//                return JSON.toJSONString(CommonResult.failFast(RESULT.FILE_CONVERT_TO_OBJECT_ERROR));
//            }
//
//            basicEarthquakeService.saveAllNoRepeat(disasterInfo.getInfo());
//
////            // 这个方法为mybatis-plus方法  会有重复
////            if(!basicEarthquakeService.saveOrUpdateBatch(disasterInfo.getInfo())){
////                return JSON.toJSONString(CommonResult.failFast(RESULT.SAVE_OR_UPDATE_ERROR));
////            }
//
//
//        }else{
//            return JSON.toJSONString(CommonResult.failFast(RESULT.FILE_TYPE_ERROR));
//        }
//
//        return JSON.toJSONString(CommonResult.failFast(RESULT.SUCCESS));
//
//    }
//
//    @GetMapping("/input")
//    public @ResponseBody String fileInputPeoloss(@RequestParam String filePath)  {
//
//        int index = filePath.indexOf(".");
//        String Str = FileUtil.getFileString(filePath);
//        if(DATA_TYPE.JSON.getType().contains(filePath.substring(index+1))) {
//
//            if("".equals(Str)){ return JSON.toJSONString(CommonResult.failFast(RESULT.FILE_PATH_ERROR)); }
//            FileDto<BasicEarthquake> fileDto = JSON.parseObject(Str,new TypeReference<FileDto<BasicEarthquake>>(){});
//
//            if(fileDto == null||fileDto.getDisasterInfo()==null){
//                return JSON.toJSONString(CommonResult.failFast(RESULT.FILE_CONVERT_TO_OBJECT_ERROR));
//            }
//
//            basicEarthquakeService.saveAllNoRepeat(fileDto.getDisasterInfo().getInfo());
//
////            // 这个方法为mybatis-plus方法  会有重复
////            if(!basicEarthquakeService.saveOrUpdateBatch(fileDto.getDisasterInfo().getInfo())){
////                return JSON.toJSONString(CommonResult.failFast(RESULT.SAVE_OR_UPDATE_ERROR));
////            }
//
//        }else if(DATA_TYPE.XML.getType().contains(filePath.substring(index+1))) {
//
//            XStream xstream = new XStream();
//            xstream .processAnnotations( new Class[] { DisasterInfo.class ,BasicEarthquake.class });
//            xstream.autodetectAnnotations(true);
//
//            DisasterInfo<BasicEarthquake> disasterInfo = (DisasterInfo<BasicEarthquake>) xstream.fromXML(Str);
//            if(disasterInfo==null){
//                return JSON.toJSONString(CommonResult.failFast(RESULT.FILE_CONVERT_TO_OBJECT_ERROR));
//            }
//
//            basicEarthquakeService.saveAllNoRepeat(disasterInfo.getInfo());
//
////            // 这个方法为mybatis-plus方法  会有重复
////            if(!basicEarthquakeService.saveOrUpdateBatch(disasterInfo.getInfo())){
////                return JSON.toJSONString(CommonResult.failFast(RESULT.SAVE_OR_UPDATE_ERROR));
////            }
//
//
//        }else{
//            return JSON.toJSONString(CommonResult.failFast(RESULT.FILE_TYPE_ERROR));
//        }
//
//        return JSON.toJSONString(CommonResult.failFast(RESULT.SUCCESS));
//
//    }
//
//    @GetMapping("/input")
//    public @ResponseBody String fileInputSecDisaster(@RequestParam String filePath)  {
//
//        int index = filePath.indexOf(".");
//        String Str = FileUtil.getFileString(filePath);
//        if(DATA_TYPE.JSON.getType().contains(filePath.substring(index+1))) {
//
//            if("".equals(Str)){ return JSON.toJSONString(CommonResult.failFast(RESULT.FILE_PATH_ERROR)); }
//            FileDto<BasicEarthquake> fileDto = JSON.parseObject(Str,new TypeReference<FileDto<BasicEarthquake>>(){});
//
//            if(fileDto == null||fileDto.getDisasterInfo()==null){
//                return JSON.toJSONString(CommonResult.failFast(RESULT.FILE_CONVERT_TO_OBJECT_ERROR));
//            }
//
//            basicEarthquakeService.saveAllNoRepeat(fileDto.getDisasterInfo().getInfo());
//
////            // 这个方法为mybatis-plus方法  会有重复
////            if(!basicEarthquakeService.saveOrUpdateBatch(fileDto.getDisasterInfo().getInfo())){
////                return JSON.toJSONString(CommonResult.failFast(RESULT.SAVE_OR_UPDATE_ERROR));
////            }
//
//        }else if(DATA_TYPE.XML.getType().contains(filePath.substring(index+1))) {
//
//            XStream xstream = new XStream();
//            xstream .processAnnotations( new Class[] { DisasterInfo.class ,BasicEarthquake.class });
//            xstream.autodetectAnnotations(true);
//
//            DisasterInfo<BasicEarthquake> disasterInfo = (DisasterInfo<BasicEarthquake>) xstream.fromXML(Str);
//            if(disasterInfo==null){
//                return JSON.toJSONString(CommonResult.failFast(RESULT.FILE_CONVERT_TO_OBJECT_ERROR));
//            }
//
//            basicEarthquakeService.saveAllNoRepeat(disasterInfo.getInfo());
//
////            // 这个方法为mybatis-plus方法  会有重复
////            if(!basicEarthquakeService.saveOrUpdateBatch(disasterInfo.getInfo())){
////                return JSON.toJSONString(CommonResult.failFast(RESULT.SAVE_OR_UPDATE_ERROR));
////            }
//
//
//        }else{
//            return JSON.toJSONString(CommonResult.failFast(RESULT.FILE_TYPE_ERROR));
//        }
//
//        return JSON.toJSONString(CommonResult.failFast(RESULT.SUCCESS));
//
//    }
//
//}
