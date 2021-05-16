package com.buptse.dismancen.mapper;

import com.buptse.dismancen.entity.Forecast;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author ASJA
 * @since 2021-05-12
 */
public interface ForecastMapper extends BaseMapper<Forecast> {
    void saveAllNoRepeat(List<Forecast> list);
}
