package com.ch.cloth.sys.controller;


import com.ch.cloth.common.vo.Result;
import com.ch.cloth.sys.entity.Account;
import com.ch.cloth.sys.service.IAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/account")
public class AccountController {
    @Autowired
    private IAccountService accountService;

    /**
     * http://localhost:9999/account/insertAccount?accountId=11&account=lht&password=123456
     * @param account
     * @return
     */
    @GetMapping("/insertAccount")
    public Result<?> insertAccount(Account account){
        Boolean saf = accountService.insertAccount(account);
        if(saf){
            return Result.success("注册成功");
        }
        return Result.fail("该账号已被使用");
    }

    /**
     *http://localhost:9999/account/loginAccount?account=lht&password=123456
     * @param account
     * @return
     */
    @GetMapping("/loginAccount")
    public Result<?> loginAccount(Account account){
        Boolean saf = accountService.loginAccount(account);
        if(saf){
            return Result.success("登录成功");
        }
        return Result.fail("登录失败");
    }

    /**
     * http://localhost:9999/account/updateAccount?accountId=111&password=999999&personType=2
     * @param account
     * @return
     */
    @GetMapping("/updateAccount")
    public Result<?> updateAccount(Account account){
        accountService.updateAccount(account);
        return Result.success("更新信息成功");
    }

    /**
     *http://localhost:9999/account/updateAccountByAccountId?accountId=111&account=chenh
     * @param accountId
     * @param account
     * @return
     */
    @GetMapping("/updateAccountByAccountId")
    public Result<?> updateAccountByAccountId(int accountId,String account){
        boolean saf = accountService.updateAccountByAccountId(accountId,account);
        if(saf){
            return Result.success("更新用户名成功");
        }
        return Result.fail("该用户名已被使用");
    }

    /**
     *http://localhost:9999/account/updateVipByAccountId?accountId=111&isVip=1&vipTime=2023.9.23&vipType=4
     * @param accountId
     * @param isVip
     * @param vipTime
     * @param vipType
     * @return
     */
    @GetMapping("/updateVipByAccountId")
    public Result<?> updateVipByAccountId(int accountId,int isVip,String vipTime,int vipType){
        accountService.updateVipByAccountId(accountId,isVip,vipTime,vipType);
        return Result.success("更新会员信息成功");
    }

    /**
     * http://localhost:9999/account/updatePublishByAccountId?accountId=11&remainPublishTimes=8&lastPublishTime=2023.9.23
     * @param accountId
     * @param remainPublishTimes
     * @param lastPublishTime
     * @return
     */
    @GetMapping("/updatePublishByAccountId")
    public Result<?> updatePublishByAccountId(int accountId,int remainPublishTimes,String lastPublishTime){
        accountService.updatePublishByAccountId(accountId,remainPublishTimes,lastPublishTime);
        return Result.success("更新发布信息成功");
    }

    /**
     *http://localhost:9999/account/findAccountByNamePassword?account=chenhan&password=999999
     * @param account
     * @param password
     * @return
     */
    @GetMapping("/findAccountByNamePassword")
    public Result<Account> findAccountByNamePassword(String account,String password){
        Account account1 = accountService.findAccountByNamePassword(account,password);
        if(account1 != null){
            return Result.success(account1,"查询成功");
        }
        return Result.fail("未查找到数据");
    }


    /**
     *http://localhost:9999/account/findAccountByName?account=chenhan
     * @param account
     * @return
     */
    @GetMapping("/findAccountByName")
    public Result<Account> findAccountByName(String account){
        Account account1 = accountService.findAccountByName(account);
        if(account1 != null){
            return Result.success(account1,"查询成功");
        }
        return Result.fail("未查找到数据");
    }

    /**
     *http://localhost:9999/account/findAllAccounts
     * @return
     */
    @GetMapping("/findAllAccounts")
    public Result<List<Account>> findAllAccounts(){
        List<Account> list = accountService.list();
        return Result.success(list,"查询成功");
    }

}
