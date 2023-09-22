package com.ch.cloth.sys.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ch.cloth.sys.entity.Account;
import com.ch.cloth.sys.mapper.AccountMapper;
import com.ch.cloth.sys.service.IAccountService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class AccountServiceImpl extends ServiceImpl<AccountMapper, Account> implements IAccountService {



    @Resource
    private AccountMapper accountMapper;

    @Override
    public boolean insertAccount(Account account){
        LambdaQueryWrapper<Account> wrapper = new LambdaQueryWrapper<>();
        wrapper.eq(Account::getAccount,account.getAccount());
        Account insertAccount = this.baseMapper.selectOne(wrapper);
        if(insertAccount!=null){
            return false;
        }
        accountMapper.insert(account);
        return true;
    }

    @Override
    public boolean loginAccount(Account account){
        LambdaQueryWrapper<Account> wrapper = new LambdaQueryWrapper<>();
        wrapper.eq(Account::getAccount,account.getAccount());
        Account loginAccount = this.baseMapper.selectOne(wrapper);
        if(loginAccount!=null&& account.getPassword().equals(loginAccount.getPassword())){
            return true;
        }
        return false;
    }

    @Override
    public void updateAccount(Account account){
        accountMapper.updateAccount(account);

        }

    @Override
    public boolean updateAccountByAccountId(int accountId,String account){
        int updateAccount =accountMapper.findAccountByAccount(account);
        if(updateAccount!=0){
            return false;
        }
        accountMapper.updateAccountByAccountId(accountId,account);
        return true;
    }

    @Override
    public void updateVipByAccountId(int accountId,int isVip,String vipTime,int vipType){
        accountMapper.updateVipByAccountId(accountId,isVip,vipTime,vipType);
    }

    @Override
    public void updatePublishByAccountId(int accountId,int remainPublishTimes,String lastPublishTime){
        accountMapper.updatePublishByAccountId(accountId,remainPublishTimes,lastPublishTime);
    }

    @Override
    public Account findAccountByNamePassword(String account,String password){
        return accountMapper.findAccountByNamePassword(account,password);
    }

    @Override
    public Account findAccountByName(String account){
        return accountMapper.findAccountByName(account);
    }
}
