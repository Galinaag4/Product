package com.skypro.product.PRODUCTCONTROLLER;

import com.skypro.product.MODEL.Product;
import com.skypro.product.RECORD.ProductRequest;
import com.skypro.product.SERVISE.ProductService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RestController
public class ProductController {
    ProductService productService;
    public ProductController(ProductService productService){this.productService=productService;}
    @GetMapping("/products")
    public Collection<Product> getAllProduct(){
        return  this.productService.getAllProduct();

    }
    @PostMapping("/products")
    public Product createProduct(@RequestBody ProductRequest productRequest){
        return   this.productService.addProduct(productRequest);
    }

}
