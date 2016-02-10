package ru.itis.inform.store.dao.models;

public class Item {
    String itemName;
    int amount;

    public Item(String itemName, int amount) {
        this.itemName = itemName;
        this.amount = amount;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
}
