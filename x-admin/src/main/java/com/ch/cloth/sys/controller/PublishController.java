package com.ch.cloth.sys.controller;

import com.ch.cloth.common.vo.Result;
import com.ch.cloth.sys.entity.Publish;
import com.ch.cloth.sys.service.IPublishService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("/publish")
// @CrossOrigin   跨域处理
public class PublishController {
    @Autowired
    private IPublishService publishService;


    /**
     * http://localhost:9999/publish/insertPublishInfo?accountId=1&publishTime=111&workInfo=aaa
     * @param publish
     * @return
     */
    @GetMapping("/insertPublishInfo")
    public Result<?> insertPublishInfo(Publish publish){
        publishService.insertPublishInfo(publish);
        return Result.success("发布信息成功");
    }

    /**
     * http://localhost:9999/publish/findAllPublishInfosByAccountId?accountId=1
     * @param accountId
     * @return
     */
    @GetMapping("/findAllPublishInfosByAccountId")
    public Result<?> findAllPublishInfosByAccountId(@RequestParam("accountId")int accountId){
        List<Publish> publishList =  publishService.findAllPublishInfosByAccountId(accountId);
        return Result.success(publishList, "查询发布信息成功");
    }

    /**
     * http://localhost:9999/publish/updateByPublishId?publishId=1&publishTime=2023.09.21
     * @param publish
     * @return
     */
    @GetMapping("/updateByPublishId")
    public Result<?> updateByPublishId(Publish publish){
        publishService.updateByPublishId(publish);
        return Result.success("更新发布信息成功");
    }

    /**
     * http://localhost:9999/publish/deleteByPublishId?publishId=2
     * @param publishId
     * @return
     */
    @GetMapping("/deleteByPublishId")
    public Result<?> deleteByPublishId(int publishId){
        publishService.deleteByPublishId(publishId);
        return Result.success("删除发布信息成功");
    }
}
