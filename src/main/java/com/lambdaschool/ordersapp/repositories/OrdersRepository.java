package com.lambdaschool.ordersapp.repositories;

import com.lambdaschool.ordersapp.models.Order;
import org.springframework.data.repository.CrudRepository;

public interface OrdersRepository extends CrudRepository<Order, Long>
{
}
