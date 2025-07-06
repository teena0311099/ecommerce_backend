package com.ecommerce.orders;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import java.time.LocalDate;

@Document("orders")
public class Order {
    @Id
    private String id;
    private String orderId;
    private String customer;
    private String item;
    private LocalDate deliveryDate;
    private double deliveryPricing;
    private String status;

    // Getters and Setters
}
