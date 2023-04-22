package com.trawell.backend.controller;

import com.trawell.backend.model.Product;
import com.trawell.backend.service.MarketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MarketController {

    @Autowired
    MarketService marketService;

    @GetMapping("/allItems")
    public ResponseEntity<List<Product>> returnAllItems(){
        List<Product> productList = marketService.getAllItems();
        return new ResponseEntity<List<Product>>(productList, HttpStatus.OK);
    }

    @PostMapping("/addItem")
    public ResponseEntity<String> postItem(@RequestBody Product product){
        marketService.addItem(product);
        return new ResponseEntity<String>("Successfully Added", HttpStatus.OK);
    }
}
