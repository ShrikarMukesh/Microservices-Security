package com.javatechie.service;

import com.javatechie.client.RestaurantServiceClient;
import com.javatechie.dto.OrderResponseDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

@Service
public class SwiggyAppService {

    @Autowired
    private RestaurantServiceClient restaurantServiceClient;

    public String greeting() {
        return "Welcome to Swiggy App Service";
    }

    public OrderResponseDTO checkOrderStatus(@PathVariable String orderId) {
        return restaurantServiceClient.fetchOrderStatus(orderId);
    }
}
