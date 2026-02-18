package com.inventory.ServiceImpl;

import com.inventory.Entity.Inventory;
import com.inventory.GenericResponse.GenericResponse;
import com.inventory.POJO.InventoryPojo;
import com.inventory.Repository.Repository;
import com.inventory.Service.InventoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceImpl implements InventoryService {

    @Autowired
    Repository repository;



    public GenericResponse addProduct(com.inventory.Entity.Inventory inventory){
        GenericResponse genResponse =new GenericResponse();


        Inventory response=repository.save(inventory);
        if(response!=null) {
            genResponse.setStatus(HttpStatus.OK.value());
            genResponse.setStatusMessage(HttpStatus.CREATED.getReasonPhrase());
            Inventory[] arrInv=new Inventory[1];
            arrInv[0]=response;
//            InventoryPojo[] arrRes=new InventoryPojo[1];
//
//            arrRes[0]=response;

            genResponse.setData(arrInv);
        }
        return genResponse;
    }



    public GenericResponse getAllProducts(){
        GenericResponse response=new GenericResponse();
        try{
            List<Inventory> retrievedProducts=repository.findAll();
            Inventory[] invArrr=retrievedProducts.toArray(new Inventory[0]);
            response.setStatus(HttpStatus.OK.value());
            response.setStatusMessage("Retrieved All The Products");
            response.setData(invArrr);
//            Inventory[] invArr=new Inventory[retrievedProducts.size()];
//            int i=0;
//            for(Inventory inv:retrievedProducts){
//
//                invArr[i]=inv;
//                i++;
//            }


        }
        catch(DataAccessException e){
            response.setStatus(HttpStatus.INTERNAL_SERVER_ERROR.value());
            response.setStatusMessage("Failed to retrieve products");
            response.setData(new Inventory[0]);
        }

        return response;
    }
}
