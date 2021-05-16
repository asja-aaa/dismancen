package com.buptse.dismancen.service;

import com.buptse.dismancen.entity.LifeLine;
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
public interface ILifeLineService extends IService<LifeLine> {
    void saveAllNoRepeat(List<LifeLine> list);
}
