package com.bhaskar.ecom.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderItem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private Product product;

    private int quantity;
    private BigDecimal totalPrice;

    @ManyToOne
    private Order  orders;

    public OrderItem(Product product, int quantity, BigDecimal totalPrice, Order orders) {
        this.product = product;
        this.quantity = quantity;
        this.totalPrice = totalPrice;
        this.orders = orders;
    }
}
