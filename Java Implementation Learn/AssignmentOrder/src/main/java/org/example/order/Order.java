package org.example.order;

/**
 * Order class represents a delivery order with destination, distance, and preparation time.
 */

public class Order {

    String destination; // The destination of the order
    double distance; // The distance to the destination in kilometers
    double preparationTime; // The time needed to prepare the order in hours

    /**
     * Constructs a new Order object with the specified destination, distance, and preparation time.
     *
     * @param destination     the destination of the order
     * @param distance        the distance to the destination in kilometers
     * @param preparationTime the time needed to prepare the order in hours
     */
    public Order(String destination, double distance, double preparationTime) {
        this.destination = destination;
        this.distance = distance;
        this.preparationTime = preparationTime;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }

    public double getPreparationTime() {
        return preparationTime;
    }

    public void setPreparationTime(double preparationTime) {
        this.preparationTime = preparationTime;
    }
}
