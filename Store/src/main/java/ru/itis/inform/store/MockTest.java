package ru.itis.inform.store;

import ru.itis.inform.store.dao.ItemsDao;
import ru.itis.inform.store.dao.ItemsDaoFileBasedImpl;
import ru.itis.inform.store.dao.models.Item;
import ru.itis.inform.store.services.StoreService;
import ru.itis.inform.store.services.StoreServiceImpl;

import java.io.IOException;
import java.nio.channels.Pipe;

import static org.mockito.Mockito.*;

/**
 * Created by Galiullin_ko on 11/02/16.
 */
public class MockTest {
    public static void main(String[] args) throws IOException {
        StoreService ss = new StoreServiceImpl();
        System.out.println(ss.isExist("pen"));
        System.out.println(ss.isExist("toy"));
        System.out.println(ss.isExist("rat"));
    }

}
