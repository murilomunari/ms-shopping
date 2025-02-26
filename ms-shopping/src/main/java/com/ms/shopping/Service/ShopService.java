package com.ms.shopping.Service;

import com.ms.shopping.DTO.ShopDTO;
import com.ms.shopping.Entity.Shop;
import com.ms.shopping.Repository.ShopRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Service
public class ShopService {

    @Autowired
    private ShopRepository shopRepository;

    public Shop create(ShopDTO shopDTO){
        Shop shop = new Shop();
        shop.setUserIdentifier(shopDTO.userIdentifier());
        shop.setTotal(shopDTO.total());
        shop.setData(LocalDateTime.now());

        return shopRepository.save(shop);
    }

    public List<Shop> findAll(){
        return shopRepository.findAll();
    }

    public Optional<Shop> findByName(String userIdentifier){
        return  shopRepository.findByName(userIdentifier);
    }

}
