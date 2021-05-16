package com.buptse.dismancen.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.buptse.dismancen.entity.SecDisaster;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author ASJA
 * @since 2021-05-12
 */
public interface SecDisasterMapper extends BaseMapper<SecDisaster> {
    void saveAllNoRepeat(List<SecDisaster> list);
}
