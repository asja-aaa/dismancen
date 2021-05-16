package com.buptse.dismancen.service.impl;

import com.buptse.dismancen.entity.Forecast;
import com.buptse.dismancen.mapper.ForecastMapper;
import com.buptse.dismancen.service.IForecastService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author ASJA
 * @since 2021-05-12
 */
@Service
public class ForecastServiceImpl extends ServiceImpl<ForecastMapper, Forecast> implements IForecastService {

    @Override
    public void saveAllNoRepeat(List<Forecast> list) {
        getBaseMapper().saveAllNoRepeat(list);
    }
}
