package com.uce.ecommerceOrder.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.ecommerceOrder.Model.Order;
import com.uce.ecommerceOrder.Repository.OrderRepository;

@Service
public class OrderService {
    
    @Autowired
    private OrderRepository orderRepository;

    public List<Order> getAllOrders(){
        return orderRepository.findAll();
    }

    public List<Order> getOrdersByCustomer(String customer) {
        return orderRepository.findByCustomer(customer);
    }

    public Order saveOrder(Order order) {
        return orderRepository.save(order);
    }
    

}
