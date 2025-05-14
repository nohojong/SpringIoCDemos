package com.nhj.ioc.containeroverview.service;

public class DefaultServiceLocator {
    private static final ServerService serverService = new ServerService();
    private static final AccountService accountService = new AccountService();

    public ServerService createServerServiceInstance() {
        return serverService;
    }

    public AccountService createAccountServiceInstance() {
        return accountService;
    }
}