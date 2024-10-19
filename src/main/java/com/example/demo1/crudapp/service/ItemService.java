package com.example.demo1.crudapp.service;

import com.example.demo1.crudapp.model.Item;

import java.util.List;

public interface ItemService {

    List<Item> getAllItems();

    Item getItemById(String id);

    Item createItem(Item item);

    Item updateItem(String id, Item newItem);

    boolean deleteItem(String id);
}
