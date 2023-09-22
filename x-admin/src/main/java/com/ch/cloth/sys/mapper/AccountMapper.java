package com.ch.cloth.sys.mapper;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.ch.cloth.sys.entity.Account;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface AccountMapper extends BaseMapper<Account> {
    public void updateAccount(Account account);
    public void updateAccountByAccountId(int accountId,String account);
    public int findAccountByAccount(String account);
    public void updateVipByAccountId(int accountId,int isVip,String vipTime,int vipType);
    public void updatePublishByAccountId(int accountId,int remainPublishTimes,String lastPublishTime);
    public Account findAccountByNamePassword(String account,String password);
    public Account findAccountByName(String account);
}
