package com.buptse.dismancen.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.buptse.dismancen.entity.BasicEarthquake;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author ASJA
 * @since 2021-05-12
 */
public interface BasicEarthquakeMapper extends BaseMapper<BasicEarthquake> {
    void saveAllNoRepeat(List<BasicEarthquake> list);
}
