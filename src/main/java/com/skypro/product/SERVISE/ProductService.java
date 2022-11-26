package com.skypro.product.SERVISE;

import com.skypro.product.REPOSITORY.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service
public class ProductService {
    private final ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public void addTo(List<Integer> ids){
        this.productRepository.addTo(ids);
    }
    public List<Integer> getTo(){
        return this.productRepository.getTo();
    }


}

