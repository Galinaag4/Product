package com.skypro.product.PRODUCTCONTROLLER;

import com.skypro.product.SERVISE.ProductService;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping("/store/order")
public class ProductController {
    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/add")
    public String add(@RequestParam("id") List<Integer> ids){
        this.productService.addTo(ids);
        return "Приняты параметры " + ids;
    }

    @GetMapping("/get")
    public List<Integer> get(){
    return this.productService.getTo();}



}
