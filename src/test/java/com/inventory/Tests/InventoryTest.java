package com.inventory.Tests;

import com.inventory.Entity.Inventory;
import com.inventory.GenericResponse.GenericResponse;
import com.inventory.Repository.Repository;
import com.inventory.Service.InventoryService;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.http.HttpStatus;

import java.util.List;

import static org.antlr.v4.runtime.tree.xpath.XPath.findAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension .class)
public class InventoryTest {
    @InjectMocks
    private InventoryService service;

@Mock
    private Repository repository;

void getAllProducts_success(){
    Inventory product=new Inventory();

    product.setProductName("LED Desk Lamp");
    product.setProductCode("DL-010");
    product.setProductPrice(999.50);
    product.setProductStock(70);
    product.setProductCategory("Home");

    List<Inventory> mockList=List.of(product);
    when(repository.findAll()).thenReturn(mockList);

    GenericResponse response = service.getAllProducts();

    assertEquals(HttpStatus.OK.value(),response.getStatus());
    assertEquals("Retrieved All Products",response.getStatusMessage());

    Inventory[] invArr=(Inventory[]) response.getData();

    assertEquals(1,invArr.length);
}
}
