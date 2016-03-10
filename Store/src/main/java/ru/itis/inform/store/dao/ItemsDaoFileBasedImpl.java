package ru.itis.inform.store.dao;

import ru.itis.inform.store.dao.models.Item;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.stream.Stream;

public class ItemsDaoFileBasedImpl implements ItemReader{
    HashMap<String, Item> hashMap = null;
    BufferedReader br = null;

    public ItemsDaoFileBasedImpl(String pathString) throws IOException {
        try {
            br = new BufferedReader(new FileReader(pathString));
            String sCurrentLine;
            String key = null;
            Integer q = null;
            int i = 0;
            hashMap = new HashMap<>();
            while ((sCurrentLine = br.readLine()) != null) {
                i++;
                if (i % 2 == 1) {
                    key = sCurrentLine;
                } else {
                    q = Integer.valueOf(sCurrentLine);
                    hashMap.put(key, new Item(key, q));
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public HashMap<String, Item> getHashMap() {
        return hashMap;
    }
}
