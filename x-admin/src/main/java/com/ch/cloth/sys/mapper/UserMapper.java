package com.ch.cloth.sys.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.ch.cloth.sys.entity.User;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *

 */
public interface UserMapper extends BaseMapper<User> {

    public int getRoleNameByUserId();
}
