package ru.itis.inform.store.dao;

import java.util.Map;

/**
 * Created by Galiullin_ko on 03/03/16.
 */
public interface ItemReader<K, V> {
    public Map<K, V> getHashMap();
}
