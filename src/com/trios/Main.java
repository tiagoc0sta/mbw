package com.trios;

/**
 * main class for runnig program
 */
public class Main {

    /**
     * instanciate the objects in order to call them
     * @param args
     */
    public static void main(String[] args) {
	Car c1 = new Car(123456,40000,"Mazda", 2017,5);
    PickupTruck p1 = new PickupTruck(789456,50000,"Ram",2018,1000.0);
    Motorcycle m1 = new Motorcycle(1598,32000,"Harley", 2019,250.0);

    c1.currentCarPrice(c1,2021);
    p1.currentTruckPrice(p1,2022);
    m1.currentBikePrice(m1,2022);


    Showroom s1 = new Showroom("Toronto",80,100);
    s1.addToInventory(p1);
    s1.walkthrough();

    }
}
