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
        StoreService ss = new StoreServiceImpl(mocking());
        System.out.println(ss.isExist("cow"));
        System.out.println(ss.isExist("VasiliyIvanovich"));
        System.out.println(ss.isExist("rat"));
    }

    private static ItemsDao mocking() {
        ItemsDao dao = mock(ItemsDaoFileBasedImpl.class);
        Item item1 = new Item("cow", 12);
        Item item2 = new Item("rat", 3);
        Item item3 = new Item("VasiliyIvanovich", 1);
        when(dao.select("cow")).thenReturn(item1);
        when(dao.select("rat")).thenReturn(item2);
        when(dao.select("VasiliyIvanovish")).thenReturn(item1);
        return dao;
    }
}
