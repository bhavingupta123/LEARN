package org.example;

import java.util.List;
import java.util.ArrayList;

import org.example.delivery.AmanDelivery;
import org.example.delivery.DeliveryExecutive;
import org.example.order.Order;


public class Main {
    public static void main(String[] args) {
        // Creating delivery executive Aman
        DeliveryExecutive amanDeliveryExecutive = new AmanDelivery("Aman", 0.0);

        // Creating orders that Aman will deliver
        List<Order> orders = new ArrayList<>();
        orders.add(new Order("Destination 1", 5.0, 0.10));
        orders.add(new Order("Destination 2", 10.0, 0.20));

        // Calculating delivery time for Aman
        double deliveryTime = amanDeliveryExecutive.calculateDeliveryTime(orders);
        System.out.println("Total delivery time: " + deliveryTime + " hours");
    }
}
