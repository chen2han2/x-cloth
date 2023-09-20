package com.ch.cloth.sys.entity;

public class Cloth {
    private int clothTypeId;
    private String smallClothType;
    private String largeClothType;
    public int getClothTypeId() {
        return clothTypeId;
    }
    public void setClothTypeId(int clothTypeId) {
        this.clothTypeId = clothTypeId;
    }
    public String getSmallClothType() {
        return smallClothType;
    }
    public void setSmallClothType(String smallClothType) {
        this.smallClothType = smallClothType;
    }
    public String getLargeClothType() {
        return largeClothType;
    }
    public void setLargeClothType(String largeClothType) {
        this.largeClothType = largeClothType;
    }
}
