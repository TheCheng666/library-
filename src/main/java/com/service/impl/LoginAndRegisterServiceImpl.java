package com.service.impl;

import com.entity.Account;
import com.entity.AccountExample;
import com.mapper.AccountMapper;
import com.service.LoginAndRegisterService;
import com.utils.MD5Utils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LoginAndRegisterServiceImpl implements LoginAndRegisterService {
    @Autowired
    AccountMapper accountMapper;

    @Override
    public boolean checkRegister(String account) {
        AccountExample example=new AccountExample();
        AccountExample.Criteria criteria=example.createCriteria();
        criteria.andAccountEqualTo(account);
        long conut=accountMapper.countByExample(example);
        return conut==1?true:false;
    }

    @Override
    public boolean saveAccount(Account account) {
        boolean b=this.checkRegister(account.getAccount());
        if (!b){
            String old_password=account.getPassword();
            String md5_password=MD5Utils.md5(old_password);
            account.setPassword(md5_password);
            Integer result=accountMapper.insertSelective(account);
            return result>0?true:false;
        }else {
            return false;
        }
    }

    @Override
    public boolean checkAccount(Account account) {
        String old_password=account.getPassword();
        String md5_password=MD5Utils.md5(old_password);
        account.setPassword(md5_password);
        AccountExample example=new AccountExample();
        AccountExample.Criteria criteria=example.createCriteria();
        criteria.andAccountEqualTo(account.getAccount())
                .andPasswordEqualTo(account.getPassword())
                .andRoleEqualTo(account.getRole());
        long result=accountMapper.countByExample(example);
        return result==1?true:false;
    }

    @Override
    public Account getAccount(Account account) {
        Account completeAccount=accountMapper.selectCompleteAccount(account.getAccount());
        return completeAccount;
    }


}
