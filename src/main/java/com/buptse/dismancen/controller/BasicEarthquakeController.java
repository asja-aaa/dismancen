package com.buptse.dismancen.controller;


import com.buptse.dismancen.entity.BasicEarthquake;
import com.buptse.dismancen.service.IBasicEarthquakeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

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
@RequestMapping("//basic-earthquake")
public class BasicEarthquakeController {

    @Autowired
    private IBasicEarthquakeService service;

    @GetMapping("/list")
    public List<BasicEarthquake> list(){
        return service.list();
    }

    @GetMapping("/count")
    public int count(){
        return service.count();
    }




}
