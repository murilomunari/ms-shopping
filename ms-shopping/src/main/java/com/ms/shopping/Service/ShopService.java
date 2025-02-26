package com.ms.shopping.Service;

import com.ms.shopping.Repository.ShopRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ShopService {


    @Autowired
    private ShopRepository shopRepository;



}
