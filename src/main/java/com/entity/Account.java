package com.entity;

import javax.validation.constraints.Pattern;
import java.io.Serializable;

public class Account implements Serializable {
    private Integer id;

    @Pattern(regexp = "(^[a-zA-Z0-9]{5,20}$)|(^[\\u2E80-\\u9FFF]{2,5})"
            ,message = "用户名必须是5-20位数字或2-5位中文")
    private String account;

    @Pattern(regexp = "(^[a-zA-Z0-9]{6,20}$)",message = "密码应该为6-20位数字加字母")
    private String password;

    private Integer role;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account == null ? null : account.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public Integer getRole() {
        return role;
    }

    public void setRole(Integer role) {
        this.role = role;
    }

    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", account='" + account + '\'' +
                ", password='" + password + '\'' +
                ", role=" + role +
                '}';
    }
}