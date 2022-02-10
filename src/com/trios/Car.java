package com.trios;

/**
 * class car that extends from vehicle class
 */
public class Car extends Vehicle {
    private int numOfPassengers;

    /**
     * Method to find current car price
     * @param c parameter used in this method
     * @param currentYear  parameter necessary to calculate used years
     * @return
     */
    public static double currentCarPrice(Car c, int currentYear){
        int usedYears = currentYear - c.getYearOfPurchase(); // calculating the used years
        double usedYearsDoub = usedYears; //converting to double
        double result = (c.getPrice()-15.0/100.0*usedYearsDoub* c.getPrice());
        System.out.println("The car current value is: " + result);
        return result;
    }

    /**
     * default constructor
     */
    public Car() {
    }

    /**
     * constructor
     * @param registrationNum
     * @param price
     * @param model
     * @param yearOfPurchase
     * @param numOfPassengers
     */
    public Car(int registrationNum, double price, String model, int yearOfPurchase, int numOfPassengers) {
        super(registrationNum, price, model, yearOfPurchase);
        this.numOfPassengers = numOfPassengers;
    }

    /**
     * getters and setters
     * @return
     */
    public int getNumOfPassengers() {
        return numOfPassengers;
    }

    public void setNumOfPassengers(int numOfPassengers) {
        this.numOfPassengers = numOfPassengers;
    }
}
