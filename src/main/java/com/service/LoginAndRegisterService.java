package com.service;

import com.entity.Account;

import java.util.List;

public interface LoginAndRegisterService {
    boolean checkRegister(String account);

    boolean saveAccount(Account account);

    boolean checkAccount(Account account);

    Account getAccount(Account account);
}
