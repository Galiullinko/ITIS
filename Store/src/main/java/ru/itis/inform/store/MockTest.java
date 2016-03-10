package ru.itis.inform.store;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
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
        //    Factory
        //    ItemsDao itemsDao = StoreFactory.getInstance().getItemsDao();
        //    StoreService service = StoreFactory.getInstance().getStoreService();
        //    service.setDao(itemsDao);

        ApplicationContext context =
                new ClassPathXmlApplicationContext("app-context.xml");

        ItemsDao itemsDao = (ItemsDao)context.getBean("itemsDao", ItemsDao.class);

        StoreService ss = new StoreServiceImpl();
        ss.setDao(itemsDao);

        System.out.println(ss.isExist("pen"));
        System.out.println(ss.isExist("toy"));
        System.out.println(ss.isExist("rat"));
    }

}
