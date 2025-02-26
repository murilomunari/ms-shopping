package com.ms.shopping.Entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Entity
@Table(name = "shop")
@Component
public class Shop {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    private String userIdentifier;

    @NotNull(message = "Total cannot be null")
    private float total;

    private LocalDateTime data;

    public Shop() {
    }

    public Shop(Long id, String userIdentifier, float total, LocalDateTime data) {
        this.id = id;
        this.userIdentifier = userIdentifier;
        this.total = total;
        this.data = data;
    }

    public Long getId() {
        return id;
    }

    public Shop setId(Long id) {
        this.id = id;
        return this;
    }

    public String getUserIdentifier() {
        return userIdentifier;
    }

    public Shop setUserIdentifier(String userIdentifier) {
        this.userIdentifier = userIdentifier;
        return this;
    }

    public float getTotal() {
        return total;
    }

    public Shop setTotal(float total) {
        this.total = total;
        return this;
    }

    public LocalDateTime getData() {
        return data;
    }

    public Shop setData(LocalDateTime data) {
        this.data = data;
        return this;
    }

    @Override
    public String toString() {
        return "Shop{" +
                "id=" + id +
                ", userIdentifier='" + userIdentifier + '\'' +
                ", total=" + total +
                ", data=" + data +
                '}';
    }
}
