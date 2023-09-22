package com.ch.cloth.sys.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ch.cloth.sys.entity.Feed;
import com.ch.cloth.sys.mapper.FeedMapper;
import com.ch.cloth.sys.service.IFeedService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

@Service
public class FeedServiceImpl extends ServiceImpl<FeedMapper, Feed> implements IFeedService {

    @Resource
    private FeedMapper feedMapper;

    @Override
    @Transactional
    public void addFeed(Feed feed){
    feedMapper.insert(feed);

    }

}
