package com.ch.cloth;

import com.ch.cloth.sys.entity.User;
import com.ch.cloth.sys.mapper.UserMapper;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.util.List;

@SpringBootTest
class XAdminApplicationTests {

    @Resource
    private UserMapper userMapper;

    @Test
    void testMapper() {
        List<User> users = userMapper.selectList(null);
        System.out.println("++++++users:" + users.size());
        users.forEach(System.out::println);
    }

}
