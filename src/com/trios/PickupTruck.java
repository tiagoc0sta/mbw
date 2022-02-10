package com.trios;

/**
 * class PickupTruck that extends from vehicle class
 */
public class PickupTruck extends Vehicle {
    private double loadCapacity;

    public static double currentTruckPrice(PickupTruck c, int currentYear){
        int usedYears = currentYear - c.getYearOfPurchase(); // calculating the used years
        double usedYearsDoub = usedYears; //converting to double
        double result = (c.getPrice()-9.0/100.0*usedYearsDoub* c.getPrice());
        System.out.println("The Truck current value is: " + result);
        return result;
    }

    /**
     * default constructor
     */
    public PickupTruck() {
    }

    /**
     * constructor
     * @param registrationNum
     * @param price
     * @param model
     * @param yearOfPurchase
     * @param loadCapacity
     */
    public PickupTruck(int registrationNum, double price, String model, int yearOfPurchase, double loadCapacity) {
        super(registrationNum, price, model, yearOfPurchase);
        this.loadCapacity = loadCapacity;
    }

    /**
     * getters and setters
     * @return
     */
    public double getLoadCapacity() {
        return loadCapacity;
    }

    public void setLoadCapacity(double loadCapacity) {
        this.loadCapacity = loadCapacity;
    }
}
