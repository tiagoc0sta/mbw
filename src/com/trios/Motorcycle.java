package com.trios;
/**
 * class motorcycle that extends from vehicle class
 */
public class Motorcycle extends Vehicle {
    private double topSpeed;

    public static double currentBikePrice(Motorcycle c, int currentYear){
        int usedYears = currentYear - c.getYearOfPurchase(); // calculating the used years
        double usedYearsDoub = usedYears; //converting to double
        double result = (c.getPrice()-20.0/100.0*usedYearsDoub* c.getPrice());
        System.out.println("The bike current value is: " + result);
        return result;
    }

    /**
     * default constructor
     */
    public Motorcycle() {
    }

    /**
     * constructor
     * @param registrationNum
     * @param price
     * @param model
     * @param yearOfPurchase
     * @param topSpeed
     */
    public Motorcycle(int registrationNum, double price, String model, int yearOfPurchase, double topSpeed) {
        super(registrationNum, price, model, yearOfPurchase);
        this.topSpeed = topSpeed;
    }

    /**
     * getters and setters
     * @return
     */
    public double getTopSpeed() {
        return topSpeed;
    }

    public void setTopSpeed(double topSpeed) {
        this.topSpeed = topSpeed;
    }
}
