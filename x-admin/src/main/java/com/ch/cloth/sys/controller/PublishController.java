package com.ch.cloth.sys.controller;

import com.ch.cloth.common.vo.Result;
import com.ch.cloth.sys.entity.Publish;
import com.ch.cloth.sys.service.IPublishService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("/publish")
// @CrossOrigin   跨域处理
public class PublishController {
    @Autowired
    private IPublishService publishService;



    @GetMapping("/insertPublishInfo")
    public Result<?> insertPublishInfo(Publish publish){
        publishService.insertPublishInfo(publish);
        return Result.success("发布信息成功");
    }


}
