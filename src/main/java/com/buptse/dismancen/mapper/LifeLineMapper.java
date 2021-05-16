package com.buptse.dismancen.mapper;

import com.buptse.dismancen.entity.LifeLine;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author ASJA
 * @since 2021-05-12
 */
public interface LifeLineMapper extends BaseMapper<LifeLine> {
    void saveAllNoRepeat(List<LifeLine> list);
}
