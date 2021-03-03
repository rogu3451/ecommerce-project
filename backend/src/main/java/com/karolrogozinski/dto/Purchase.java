package com.karolrogozinski.dto;

import com.karolrogozinski.entity.Address;
import com.karolrogozinski.entity.Customer;
import com.karolrogozinski.entity.Order;
import com.karolrogozinski.entity.OrderItem;
import lombok.Data;
import java.util.Set;

@Data
public class Purchase {

    private Customer customer;
    private Address shippingAddress;
    private Address billingAddress;
    private Order order;
    private Set<OrderItem> orderItems;

}
