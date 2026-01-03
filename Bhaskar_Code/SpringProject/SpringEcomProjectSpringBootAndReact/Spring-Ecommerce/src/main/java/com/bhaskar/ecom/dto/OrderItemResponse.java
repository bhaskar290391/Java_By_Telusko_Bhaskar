package com.bhaskar.ecom.dto;

import java.math.BigDecimal;

public record OrderItemResponse(String productName, Integer quantity, BigDecimal totalPrice) {
}
