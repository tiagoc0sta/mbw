package com.trios;

/**
 * super class where all vehicles are
 */
public class Vehicle {
    private int registrationNum;
    private double price;
    private String model;
    private int yearOfPurchase;
    //private static double vehicleCurrentPrice;

    /**
     * default constructor
     */
    public Vehicle() {
    }

    /**
     * constructor
     */
    public Vehicle(int registrationNum, double price, String model, int yearOfPurchase) {
        this.registrationNum = registrationNum;
        this.price = price;
        this.model = model;
        this.yearOfPurchase = yearOfPurchase;
    }

    /**
     * getters and setters
     * @return
     */
    public int getRegistrationNum() {
        return registrationNum;
    }

    public void setRegistrationNum(int registrationNum) {
        this.registrationNum = registrationNum;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYearOfPurchase() {
        return yearOfPurchase;
    }

    public void setYearOfPurchase(int yearOfPurchase) {
        this.yearOfPurchase = yearOfPurchase;
    }
}
