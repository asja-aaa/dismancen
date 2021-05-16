package com.buptse.dismancen.mapper;

import com.buptse.dismancen.entity.PeoLoss;
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
public interface PeoLossMapper extends BaseMapper<PeoLoss> {
    void saveAllNoRepeat(List<PeoLoss> list);
}
