package com.ijse.database.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ijse.database.entity.Item;
import com.ijse.database.repository.ItemRepository;

@Service
public class ItemServiceImpl implements ItemService{
    
    @Autowired
    private ItemRepository itemRepository;

    @Override
    public Item createItem(Item item){
        //create user in DB
        return itemRepository.save(item);
    }
}
