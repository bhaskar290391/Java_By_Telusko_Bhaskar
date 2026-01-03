package com.bhaskar.ecom.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.List;

@Entity()
@Table(name = "orders")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String orderId;
    private String customerName;
    private String email;
    private String status;
    private LocalDate orderdate;

    @OneToMany(cascade = CascadeType.ALL,mappedBy = "orders")
    private List<OrderItem> orderItems;
}
