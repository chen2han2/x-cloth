package com.ch.cloth.sys.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.ch.cloth.sys.entity.Publish;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *

 */
public interface PublishMapper extends BaseMapper<Publish> {
    public List<Publish> findAllPublishInfosByAccountId(int accountId);
    public int updateByPublishId(Publish publish);
    public int deleteByPublishId(int publishId);
}
