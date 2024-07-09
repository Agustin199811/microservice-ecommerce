package com.uce.inventory.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.inventory.Model.Inventory;
import com.uce.inventory.Repository.InventoryRepository;

@Service
public class InventoryServices {
    @Autowired
    private InventoryRepository inventoryRepository;

    public Inventory addInventory(Inventory inventory) {
        return inventoryRepository.save(inventory);
    }

    public Inventory getInventoryByProductId(Long productId) {
        return inventoryRepository.findById(productId).orElse(null);
    }

    public List<Inventory> getAllInventory() {
        return inventoryRepository.findAll();
    }
}
