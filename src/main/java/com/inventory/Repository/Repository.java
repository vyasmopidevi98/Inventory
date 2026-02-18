package com.inventory.Repository;

import com.inventory.Entity.Inventory;
import org.springframework.data.jpa.repository.JpaRepository;
@org.springframework.stereotype.Repository
public interface Repository extends JpaRepository<Inventory,Integer> {
}
