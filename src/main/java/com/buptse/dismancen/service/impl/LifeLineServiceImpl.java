package com.buptse.dismancen.service.impl;

import com.buptse.dismancen.entity.LifeLine;
import com.buptse.dismancen.mapper.LifeLineMapper;
import com.buptse.dismancen.service.ILifeLineService;
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
public class LifeLineServiceImpl extends ServiceImpl<LifeLineMapper, LifeLine> implements ILifeLineService {

    @Override
    public void saveAllNoRepeat(List<LifeLine> list) {
        getBaseMapper().saveAllNoRepeat(list);
    }
}
