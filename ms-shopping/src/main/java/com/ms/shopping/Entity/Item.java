package com.ms.shopping.Entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import org.springframework.stereotype.Component;

@Entity
@Table(name = "item")
@Component
public class Item {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    private String productIdentifier;

    @NotNull
    private float price;

    public Item() {
    }

    public Item(Long id, String productIdentifier, float price) {
        this.id = id;
        this.productIdentifier = productIdentifier;
        this.price = price;
    }

    public Long getId() {
        return id;
    }

    public Item setId(Long id) {
        this.id = id;
        return this;
    }

    public String getProductIdentifier() {
        return productIdentifier;
    }

    public Item setProductIdentifier(String productIdentifier) {
        this.productIdentifier = productIdentifier;
        return this;
    }

    public float getPrice() {
        return price;
    }

    public Item setPrice(float price) {
        this.price = price;
        return this;
    }

    @Override
    public String toString() {
        return "Item{" +
                "id=" + id +
                ", productIdentifier='" + productIdentifier + '\'' +
                ", price=" + price +
                '}';
    }
}
