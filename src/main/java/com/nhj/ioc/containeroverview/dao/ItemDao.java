package com.nhj.ioc.containeroverview.dao;

public interface ItemDao {
    void saveItem(String item);
    String getItem(String itemId);
}