package com.ijse.database.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ijse.database.entity.Item;
import com.ijse.database.service.ItemService;

@RestController
public class ItemController {
    
    @Autowired
    private ItemController itemController;

    @PostMapping("/categories")
    public Item createUser(@RequestBody Item item){
        return itemService.createItem(item);
    }

    @GetMapping("/categories")
    public List<Item> getAllUsers(){
        return itemService.getAllItems();
    }

    @GetMapping("/categories/{id}")
    public Item getCategoryById(@PathVariable Long id){
        return itemService.getItemById(id);
    }
}
