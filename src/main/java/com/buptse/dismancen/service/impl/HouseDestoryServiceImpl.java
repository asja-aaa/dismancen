package com.buptse.dismancen.service.impl;

import com.buptse.dismancen.entity.HouseDestory;
import com.buptse.dismancen.mapper.HouseDestoryMapper;
import com.buptse.dismancen.service.IHouseDestoryService;
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
public class HouseDestoryServiceImpl extends ServiceImpl<HouseDestoryMapper, HouseDestory> implements IHouseDestoryService {

    @Override
    public void saveAllNoRepeat(List<HouseDestory> list) {
        getBaseMapper().saveAllNoRepeat(list);
    }
}
