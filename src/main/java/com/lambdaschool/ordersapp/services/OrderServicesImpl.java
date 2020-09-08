package com.lambdaschool.ordersapp.services;

import com.lambdaschool.ordersapp.models.Order;
import com.lambdaschool.ordersapp.repositories.OrdersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderServicesImpl implements OrderServices
{
    @Autowired
    OrdersRepository ordersrepos;

    @Override
    public Order save(Order order) {
        return ordersrepos.save(order);
    }
}
