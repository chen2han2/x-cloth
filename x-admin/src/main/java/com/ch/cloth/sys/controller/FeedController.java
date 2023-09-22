package com.ch.cloth.sys.controller;

import com.ch.cloth.common.vo.Result;
import com.ch.cloth.sys.entity.Feed;
import com.ch.cloth.sys.service.IFeedService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/feed")
public class FeedController {
    @Autowired
    private IFeedService feedService;

    /**
     * http://localhost:9999/feed/addFeed?feedType=2&feedDescription=平台规则及政策
     * @param feed
     * @return
     */
    @GetMapping("/addFeed")
    public Result<?> addFeed(Feed feed){
    feedService.addFeed(feed);
    return Result.success("提交反馈信息成功");
    }
}


