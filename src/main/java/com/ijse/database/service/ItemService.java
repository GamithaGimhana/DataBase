package com.ijse.database.service;

import org.springframework.stereotype.Service;

import com.ijse.database.entity.Item;

@Service
public interface ItemService {
    
    Item createItem(Item item);  
}
