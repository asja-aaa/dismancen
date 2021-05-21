package com.buptse.dismancen.controller.openapi;

import com.buptse.dismancen.common.dto.MapVDto;
import com.buptse.dismancen.entity.BasicEarthquake;
import com.buptse.dismancen.service.IBasicEarthquakeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @ClassName GaoDe
 * @Description TODO
 * @Author ASJA
 * @Date 2021/5/21 15:18
 * @Version 1.0
 */

@RestController
@RequestMapping(value = "//mapv")
public class GaoDe {

    @Autowired
    private IBasicEarthquakeService service;

    @GetMapping("/jsonp")
    public Map<String,List<MapVDto>> basicEarthquakeMapv(){
        Map<String, List<MapVDto>> map = new HashMap<>();
        map.put("data",MapVDto.mapVDtoList(service.list()));
        return map;
    }
}
