package ru.itis.inform.store.dao;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import ru.itis.inform.store.dao.models.Item;

import java.util.Map;

/**
 * Created by Galiullin_ko on 03/03/16.
 */
public class ItemsDaoHashMapImpl implements ItemsDao {
    Map<String, Item> map = null;

    public ItemsDaoHashMapImpl() {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("app-context.xml");

        ItemReader<String, Item> ir = (ItemReader<String, Item>) context.getBean("itemReader", ItemReader.class);
        map = ir.getHashMap();
    }

    @Override
    public void delete(String itemName) {
        Item item = map.get(itemName);
        int value = item.getAmount();
        value--;
        item.setAmount(value);
        if (value >= 0)
            map.replace(itemName, item);
    }

    @Override
    public Item select(String itemName) {
        Item item = map.get(itemName);
        if (item == null)
            return null;
        else if (item.getAmount() == 0)
            return null;
        else
            return item;
    }
}
