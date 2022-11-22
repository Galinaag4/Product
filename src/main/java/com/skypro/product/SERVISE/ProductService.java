package com.skypro.product.SERVISE;

import com.skypro.product.MODEL.Product;
import com.skypro.product.RECORD.ProductRequest;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Service
public class ProductService {
     Map<Integer, Product> products = new HashMap<>();
    public Collection<Product> getAllProduct(){
        return this.products.values();
    }
    public Product addProduct(ProductRequest productRequest){
        if (StringUtils.isBlank(productRequest.getName())){
            throw  new IllegalArgumentException(" Введите название");
        }
        Product product = new Product(StringUtils.capitalize(productRequest.getName()),
                productRequest.getPrice());

        this.products.put(product.getId(), product);
        return product;
    }
}
