package org.example.delivery;

import org.example.order.Order;

import java.util.List;

/**
 * DeliveryExecutive is an abstract class representing a delivery executive.
 * It provides functionality to calculate the time to deliver orders.
 */
public abstract class DeliveryExecutive {
    String name; // The name of the delivery executive
    double currentLocation; // The current location of the delivery executive

    /**
     * Constructs a new DeliveryExecutive object with the specified name and current location.
     *
     * @param name            the name of the delivery executive
     * @param currentLocation the current location of the delivery executive
     */
    public DeliveryExecutive(String name, double currentLocation) {
        this.name = name;
        this.currentLocation = currentLocation;
    }

    /**
     * Calculates the time to deliver a list of orders.
     *
     * @param orders the list of orders to be delivered
     * @return the total time to deliver the orders
     */
    public abstract double calculateDeliveryTime(List<Order> orders);
}
