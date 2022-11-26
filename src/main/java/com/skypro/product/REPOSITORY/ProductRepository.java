package com.skypro.product.REPOSITORY;

import org.springframework.stereotype.Repository;
import org.springframework.web.context.annotation.SessionScope;

import java.util.ArrayList;
import java.util.List;

@Repository
@SessionScope
public class ProductRepository {
    private final List<Integer> idList = new ArrayList<>();
    public void addTo(List<Integer>ids){
        idList.addAll(ids);
    }
    public List<Integer> getTo(){
        return this.idList;
    }

}

