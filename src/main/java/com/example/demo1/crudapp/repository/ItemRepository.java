package com.example.demo1.crudapp.repository;

import com.example.demo1.crudapp.model.Item;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ItemRepository extends MongoRepository<Item, String> {
}
