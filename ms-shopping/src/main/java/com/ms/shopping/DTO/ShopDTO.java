package com.ms.shopping.DTO;

import java.time.LocalDateTime;

public record ShopDTO(String userIdentifier,
                      float total,
                      LocalDateTime data) {
}
