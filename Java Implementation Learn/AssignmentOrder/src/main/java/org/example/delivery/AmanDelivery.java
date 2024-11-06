package org.example.delivery;

import org.example.order.Order;

import java.util.Comparator;
import java.util.List;

/**
 * AmanDelivery class represents a delivery executive named Aman.
 * It extends the DeliveryExecutive class and provides functionality to calculate the delivery time for a list of orders.
 */

public class AmanDelivery  extends DeliveryExecutive {

    /**
     * Constructs a new AmanDelivery object with the specified name and current location.
     *
     * @param name            the name of the delivery executive
     * @param currentLocation the current location of the delivery executive
     */
    public AmanDelivery(String name, double currentLocation) {
        super(name, currentLocation);
    }

    /**
     * Calculates the total delivery time for a list of orders assigned to Aman.
     *
     * @param orders the list of orders to be delivered
     * @return the total delivery time in hours
     */
    @Override
    public double calculateDeliveryTime(List<Order> orders) {

        double speed = 20.0; // in km/hr
        double timeToReach = currentLocation / speed;

        // Sorting orders by distance
        orders.sort(Comparator.comparingDouble(Order::getDistance));

        double totalDeliveryTime = 0.0;
        for (Order order : orders) {
            // Time to reach order destination
            double timeToDestination = order.getDistance() / speed;

            // Total time including preparation time
            totalDeliveryTime += timeToReach + timeToDestination + order.getPreparationTime();

            // Update current location for next order
            currentLocation = order.getDistance();
        }

        return totalDeliveryTime;
    }
}
