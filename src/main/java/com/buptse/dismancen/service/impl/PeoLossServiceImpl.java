package com.buptse.dismancen.service.impl;

import com.buptse.dismancen.entity.PeoLoss;
import com.buptse.dismancen.mapper.PeoLossMapper;
import com.buptse.dismancen.service.IPeoLossService;
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
public class PeoLossServiceImpl extends ServiceImpl<PeoLossMapper, PeoLoss> implements IPeoLossService {

    @Override
    public void saveAllNoRepeat(List<PeoLoss> list) {
        getBaseMapper().saveAllNoRepeat(list);
    }
}
