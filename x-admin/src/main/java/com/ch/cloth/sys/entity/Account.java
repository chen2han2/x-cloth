package com.ch.cloth.sys.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@TableName("account_inf")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Account {
    @TableId(value = "account_id")
    private int accountId;
    private String account;
    private String password;
    private String logoPath;
    private int personType;
    private int remainPublishTimes;
    private String lastPublishTime;
    private int isVip;
    private String vipTime;
    private int vipType;

    public int getAccountId() {
        return accountId;
    }

    public void setAccountId(int accountId) {
        this.accountId = accountId;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getLogoPath() {
        return logoPath;
    }

    public void setLogoPath(String logoPath) {
        this.logoPath = logoPath;
    }

    public int getPersonType() {
        return personType;
    }

    public void setPersonType(int personType) {
        this.personType = personType;
    }

    public int getRemainPublishTimes() {
        return remainPublishTimes;
    }

    public void setRemainPublishTimes(int remainPublishTimes) {
        this.remainPublishTimes = remainPublishTimes;
    }

    public String getLastPublishTime() {
        return lastPublishTime;
    }

    public void setLastPublishTime(String lastPublishTime) {
        this.lastPublishTime = lastPublishTime;
    }

    public int getIsVip() {
        return isVip;
    }

    public void setIsVip(int isVip) {
        this.isVip = isVip;
    }

    public String getVipTime() {
        return vipTime;
    }

    public void setVipTime(String vipTime) {
        this.vipTime = vipTime;
    }

    public int getVipType() {
        return vipType;
    }

    public void setVipType(int vipType) {
        this.vipType = vipType;
    }
}
