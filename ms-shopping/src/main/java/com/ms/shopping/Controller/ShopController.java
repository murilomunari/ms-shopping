package com.ms.shopping.Controller;

import com.ms.shopping.DTO.ShopDTO;
import com.ms.shopping.Entity.Shop;
import com.ms.shopping.Service.ShopService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/v1/shop")
public class ShopController {

    @Autowired
    private ShopService shopService;

    @PostMapping
    public ResponseEntity<Shop> create(@Valid @RequestBody ShopDTO shopDTO){
        return ResponseEntity.status(HttpStatus.CREATED).body(shopService.create(shopDTO));
    }

    @GetMapping
    public ResponseEntity<List<Shop>> findAll(){
        return ResponseEntity.status(HttpStatus.OK).body(shopService.findAll());
    }

    @GetMapping("{userIdentifier}")
    public ResponseEntity<Shop> findByName(String userIdentifier){
        return shopService.findByName(userIdentifier)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

}
