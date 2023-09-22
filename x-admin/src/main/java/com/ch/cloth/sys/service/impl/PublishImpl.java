package com.ch.cloth.sys.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ch.cloth.sys.entity.Publish;
import com.ch.cloth.sys.entity.User;
import com.ch.cloth.sys.mapper.PublishMapper;
import com.ch.cloth.sys.mapper.UserMapper;
import com.ch.cloth.sys.service.IPublishService;
import com.ch.cloth.sys.service.IUserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * <p>
 *  服务实现类
 * </p>
 *

 */
@Service
public class PublishImpl extends ServiceImpl<PublishMapper, Publish> implements IPublishService {

    @Resource
    private PublishMapper publishMapper;

    @Override
    public int insertPublishInfo(Publish publish) {
        publishMapper.insert(publish);
        return 1;
    }

    @Override
    public List<Publish> findAllPublishInfosByAccountId(int accountId) {
        return null;
    }

    @Override
    public int updateByPublishId(int publishId) {
        return 0;
    }

    @Override
    public int deleteByPublishId(int publishId) {
        return 0;
    }
}







