package ru.itis.inform.store.services;


import org.apache.log4j.Logger;
import ru.itis.inform.store.dao.ItemsDao;
import ru.itis.inform.store.dao.ItemsDaoFileBasedImpl;
import ru.itis.inform.store.dao.models.Item;

import java.io.IOException;

public class StoreServiceImpl implements StoreService {

    ItemsDao itemsDao;
    private static final Logger log = Logger.getLogger(StoreServiceImpl.class);

    public StoreServiceImpl(ItemsDao itemsDao) {
        this.itemsDao = itemsDao;
        log.info("Constructor StoreServiceImpl");
    }

    public void buy(String itemName) {
        itemsDao.delete(itemName);
        log.info("Buy StoreServiceImpl: " + itemName);
    }

    public boolean isExist(String itemName) {
        log.info("isExist StoreServiceImpl: " + itemName);
        return itemsDao.select(itemName) != null;
    }
}

