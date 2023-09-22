package com.ch.cloth.sys.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.ch.cloth.sys.entity.Publish;

import java.util.List;
import java.util.Map;


public interface IPublishService extends IService<Publish> {
    int insertPublishInfo(Publish publish);
    List<Publish> findAllPublishInfosByAccountId(int accountId);
    int updateByPublishId(Publish publish);
    int deleteByPublishId(int publishId);
}
