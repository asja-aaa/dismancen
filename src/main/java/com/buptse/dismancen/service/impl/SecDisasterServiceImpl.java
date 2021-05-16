package com.buptse.dismancen.service.impl;

import com.buptse.dismancen.entity.SecDisaster;
import com.buptse.dismancen.mapper.SecDisasterMapper;
import com.buptse.dismancen.service.ISecDisasterService;
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
public class SecDisasterServiceImpl extends ServiceImpl<SecDisasterMapper, SecDisaster> implements ISecDisasterService {

    @Override
    public void saveAllNoRepeat(List<SecDisaster> list) {
        getBaseMapper().saveAllNoRepeat(list);
    }
}
