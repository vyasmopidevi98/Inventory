package com.inventory.Service;

import com.inventory.Entity.Inventory;
import com.inventory.GenericResponse.GenericResponse;

public interface InventoryService {
    public GenericResponse addProduct(Inventory inventory);

    public GenericResponse getAllProducts();
}
