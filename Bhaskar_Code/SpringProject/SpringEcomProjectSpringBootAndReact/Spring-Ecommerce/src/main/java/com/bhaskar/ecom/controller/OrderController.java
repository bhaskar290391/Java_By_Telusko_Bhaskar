package com.bhaskar.ecom.controller;

import com.bhaskar.ecom.dto.OrderRequest;
import com.bhaskar.ecom.dto.OrderResponse;
import com.bhaskar.ecom.service.OrderService;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin
public class OrderController {

    @Autowired
    private OrderService orderService;

    @PostMapping("/orders/place")
    public ResponseEntity<OrderResponse> placeOrder(@RequestBody OrderRequest orderRequest){
        OrderResponse orderResponse= orderService.createOrders(orderRequest);
        return new ResponseEntity<>(orderResponse,HttpStatus.CREATED);
    }

    @GetMapping("/orders")
    public ResponseEntity<List<OrderResponse>> getAllOrders(){
       List<OrderResponse> orders= orderService.getAllOrders();
        return new ResponseEntity<>(orders,HttpStatus.OK);
    }
}
