package com.ch.cloth.sys.entity;

public class Feed {
    private int feedId;
    private int feedType;
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
