package com.buptse.dismancen.service;

import com.buptse.dismancen.entity.Forecast;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author ASJA
 * @since 2021-05-12
 */
public interface IForecastService extends IService<Forecast> {
    void saveAllNoRepeat(List<Forecast> list);
}
