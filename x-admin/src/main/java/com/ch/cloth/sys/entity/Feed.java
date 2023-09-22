package com.ch.cloth.sys.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@TableName("feed_information")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Feed {
    @TableId(value = "feed_id", type = IdType.AUTO)
    private int feedId;
    @TableField(value = "feed_type")
    private int feedType;
    @TableField(value = "feed_description")
    private String feedDescription;
    public int getFeedId() {
        return feedId;
    }
    public void setFeedId(int feedId) {
        this.feedId = feedId;
    }
    public int getFeedType() {
        return feedType;
    }
    public void setFeedType(int feedType) {
        this.feedType = feedType;
    }
    public String getFeedDescription() {
        return feedDescription;
    }
    public void setFeedDescription(String feedDescription) {
        this.feedDescription = feedDescription;
    }
}
