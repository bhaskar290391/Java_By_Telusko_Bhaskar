package com.bhaskar.ecom.dao;

import com.bhaskar.ecom.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrderRepository extends JpaRepository<Order,Long> {

    List<Order> findByOrderId(String orderId);

    List<Order> findByEmail(String email);
}
