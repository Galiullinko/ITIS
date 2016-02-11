package ru.itis.inform.store;

import ru.itis.inform.store.dao.ItemsDao;
import ru.itis.inform.store.dao.ItemsDaoFileBasedImpl;
import ru.itis.inform.store.dao.models.Item;
import ru.itis.inform.store.services.StoreService;
import ru.itis.inform.store.services.StoreServiceImpl;

import java.io.IOException;

/**
 * Created by Galiullin_ko on 10/02/16.
 */
public class wer {
    public static void main(String[] args) throws IOException {
        StoreService ss = new StoreServiceImpl(new ItemsDaoFileBasedImpl("/Users/admin/IdeaProjects/ITIS/Store/src/main/java/ru/itis/inform/store/res/data.txt"));
        ss.buy("pen");
        boolean b = ss.isExist("brains");
        Item item = new Item("Halva", 0);
        System.out.println(item);

    }
}
