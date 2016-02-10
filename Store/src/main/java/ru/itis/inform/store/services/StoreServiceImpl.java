package ru.itis.inform.store.services;


import ru.itis.inform.store.dao.ItemsDao;
import ru.itis.inform.store.dao.ItemsDaoFileBasedImpl;
import ru.itis.inform.store.dao.models.Item;

import java.io.IOException;

public class StoreServiceImpl implements StoreService {

    ItemsDao itemsDao;

    public StoreServiceImpl(ItemsDao itemsDao) {
        this.itemsDao = itemsDao;
    }

    public void buy(String itemName) {
        itemsDao.delete(itemName);
    }

    public boolean isExist(String itemName) {
        return itemsDao.select(itemName) != null;
    }
}

