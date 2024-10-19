package com.example.demo1.crudapp.service;

import com.example.demo1.crudapp.model.Item;
import com.example.demo1.crudapp.repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ItemServiceImpl implements ItemService {

    @Autowired
    private ItemRepository itemRepository;

    @Override
    public List<Item> getAllItems() {
        return itemRepository.findAll();
    }

    @Override
    public Item getItemById(String id) {
        return itemRepository.findById(id).orElse(null);
    }

    @Override
    public Item createItem(Item item) {
        return itemRepository.save(item);
    }

    @Override
    public Item updateItem(String id, Item newItem) {
        if (itemRepository.existsById(id)) {
            newItem.setId(id);
            return itemRepository.save(newItem);
        }
        return null;
    }

    @Override
    public boolean deleteItem(String id) {
        if (itemRepository.existsById(id)) {
            itemRepository.deleteById(id);
            return true;
        }
        return false;
    }
}
