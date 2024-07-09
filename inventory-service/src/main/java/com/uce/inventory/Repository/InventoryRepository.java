package com.uce.inventory.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.uce.inventory.Model.Inventory;

@Repository
public interface InventoryRepository extends JpaRepository<Inventory, Long>{
    
}
