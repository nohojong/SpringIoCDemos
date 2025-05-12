package com.nhj.ioc.containeroverview.dao;

public interface AccountDao {
    void saveAccount(String account);
    String getAccount(String accountId);
}