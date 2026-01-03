package com.bhaskar.ecom.dto;

import java.math.BigDecimal;

public record OrderItemRequest(Long productId,
                               Integer quantity,
                               BigDecimal totalPrice) {
}
