package com.ch.cloth.sys.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.ch.cloth.sys.entity.Account;

public interface IAccountService extends IService<Account> {
    boolean insertAccount(Account account);

    boolean loginAccount(Account account);

    void updateAccount(Account account);

    boolean updateAccountByAccountId(int accountId,String account);

    void updateVipByAccountId(int accountId,int isVip,String vipTime,int vipType);

    void updatePublishByAccountId(int accountId,int remainPublishTimes,String lastPublishTime);

    Account findAccountByNamePassword(String account,String password);

    Account findAccountByName(String account);

}
