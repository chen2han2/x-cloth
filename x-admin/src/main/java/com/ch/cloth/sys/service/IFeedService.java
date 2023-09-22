package com.ch.cloth.sys.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.ch.cloth.sys.entity.Feed;

public interface IFeedService extends IService<Feed> {
    void addFeed(Feed feed);
}
