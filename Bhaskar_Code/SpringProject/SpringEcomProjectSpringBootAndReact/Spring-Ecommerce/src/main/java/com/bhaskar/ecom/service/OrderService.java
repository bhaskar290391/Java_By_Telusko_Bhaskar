package com.bhaskar.ecom.service;

import com.bhaskar.ecom.dao.ProductRepository;
import com.bhaskar.ecom.dto.OrderItemRequest;
import com.bhaskar.ecom.dto.OrderItemResponse;
import com.bhaskar.ecom.dto.OrderRequest;
import com.bhaskar.ecom.dto.OrderResponse;
import com.bhaskar.ecom.entity.Order;
import com.bhaskar.ecom.entity.OrderItem;
import com.bhaskar.ecom.entity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.bhaskar.ecom.dao.OrderRepository;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class OrderService {

    @Autowired
    private OrderRepository orderRepo;

    @Autowired
    private ProductRepository productRepo;


    public OrderResponse createOrders(OrderRequest orderRequest) {


        Order order=new Order();
        List<OrderItem> orderItems =new ArrayList<>();
        List<OrderItemResponse> orderItemResponses=new ArrayList<>();

        String orderId= UUID.randomUUID().toString().toUpperCase().substring(0,8);
        order.setOrderId(orderId);
        order.setCustomerName(orderRequest.customerName());
        order.setEmail(orderRequest.email());
        order.setStatus("Placed");
        order.setOrderdate(LocalDate.now());


        for(OrderItemRequest item: orderRequest.items()){

           Product product= productRepo.findById(Math.toIntExact(item.productId())).orElseThrow(()->new RuntimeException("Product not found"));
           product.setQuantity(product.getQuantity()- item.quantity());
           productRepo.save(product);

            OrderItem orderitem =new OrderItem(product,item.quantity() ,product.getPrice().multiply(BigDecimal.valueOf(item.quantity())),order);
            orderItems.add(orderitem);
        }
        order.setOrderItems(orderItems);


        Order savedOrders = orderRepo.save(order);


        for(OrderItem items : savedOrders.getOrderItems()){
            OrderItemResponse itemsData=new OrderItemResponse(items.getProduct().getName(), items.getQuantity(),items.getTotalPrice());
            orderItemResponses.add(itemsData);
        }
        OrderResponse response=new OrderResponse(savedOrders.getOrderId(),
                savedOrders.getCustomerName(),
                savedOrders.getEmail(),
                savedOrders.getStatus(),
                savedOrders.getOrderdate(),
                orderItemResponses
        );

        return response;
    }

    public List<OrderResponse> getAllOrders() {

        List<Order> orders = orderRepo.findAll();
        List<OrderResponse> orderResponses=new ArrayList<>();
        List<OrderItemResponse> orderItemResponses=new ArrayList<>();

        for(Order order:orders){

           for(OrderItem items : order.getOrderItems()){
                OrderItemResponse itemsData=new OrderItemResponse(items.getProduct().getName(), items.getQuantity(),items.getTotalPrice());
               orderItemResponses.add(itemsData);
            }
            OrderResponse response=new OrderResponse(order.getOrderId(),
                    order.getCustomerName(),
                    order.getEmail(),
                    order.getStatus(),
                    order.getOrderdate(),
                    orderItemResponses
                    );

            orderResponses.add(response);
        }

        return orderResponses;
    }
}
