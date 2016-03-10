package ru.itis.inform.store.services;


import org.apache.log4j.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import ru.itis.inform.store.dao.ItemsDao;

public class StoreServiceImpl implements StoreService {

    ApplicationContext context =
            new ClassPathXmlApplicationContext("app-context.xml");

    ItemsDao itemsDao = (ItemsDao)context.getBean("itemsDao", ItemsDao.class);

    private static final Logger log = Logger.getLogger(StoreServiceImpl.class);


    public void buy(String itemName) {
        itemsDao.delete(itemName);
        log.info("Buy StoreServiceImpl: " + itemName);
    }

    public boolean isExist(String itemName) {
        log.info("isExist StoreServiceImpl: " + itemName);
        return itemsDao.select(itemName) != null;
    }
}

