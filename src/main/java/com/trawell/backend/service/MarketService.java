package com.trawell.backend.service;

import com.trawell.backend.model.Product;
import com.trawell.backend.repository.MarketRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MarketService {

    @Autowired
    MarketRepository marketRepository;

    public List<Product> getAllItems(){
        return marketRepository.findAll();
    }

    public void addItem(Product product){
        Product instanceProduct = new Product();
        instanceProduct.setProduct_name(product.getProduct_name());
        instanceProduct.setProduct_desc(product.getProduct_desc());
        instanceProduct.setProduct_price(product.getProduct_price());
        instanceProduct.setProduct_img(product.getProduct_img());
        instanceProduct.setLocation(product.getLocation());

        marketRepository.save(instanceProduct);
    }
}
