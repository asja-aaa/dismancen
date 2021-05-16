package com.buptse.dismancen.service;

import com.buptse.dismancen.entity.HouseDestory;
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
public interface IHouseDestoryService extends IService<HouseDestory> {
    void saveAllNoRepeat(List<HouseDestory> list);
}
