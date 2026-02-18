package com.inventory.Controller;

import com.inventory.Entity.Inventory;
import com.inventory.GenericResponse.GenericResponse;
import com.inventory.Service.InventoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    @Autowired
    InventoryService service;

    @PostMapping("/addproduct")
    public GenericResponse addProduct(@RequestBody Inventory inventory){
        GenericResponse savedProduct=service.addProduct(inventory);
        return savedProduct;
    }
    @GetMapping("/getAllProducts")
    public GenericResponse getAllProducts(){
        GenericResponse retrievedProducts=service.getAllProducts();
        return retrievedProducts;
    }

    public GenericResponse stockIn()

}
