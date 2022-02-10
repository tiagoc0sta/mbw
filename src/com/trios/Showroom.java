package com.trios;

import java.util.ArrayList;

/**
 * showroom class where vehicles will be inserted
 */
public class Showroom {
    private String showroomName;
    private ArrayList<Vehicle> inventory;
    private int vehiclesInShowroom;
    private int showroomLimit;

    /**
     * add vehicle to inventory method, check if its full before
     * @param newVehicle
     * @return
     */
    public String addToInventory(Vehicle newVehicle){
        if(getVehiclesInShowroom() < getShowroomLimit()){
            this.inventory.add(newVehicle);
            vehiclesInShowroom ++;
            if(getVehiclesInShowroom() >= 98){
                System.out.println("Low invetory" + getVehiclesInShowroom());
                return"Low invetory";
            }else {
                System.out.println("Inventory updated" + getVehiclesInShowroom());
                return"Inventory updated";
            }
        }else{
            System.out.println("Inventory overflow" + getVehiclesInShowroom());
            return"Inventory overflow";
        }
    }

    /**
     * walkthough method runs along the inventory and prints its size and all vehicles names
     * @return
     */
    public String walkthrough(){
        System.out.println("Car details: ");
        inventory.forEach((n) -> System.out.println(n.getModel()));
        System.out.println("Total cars in Showroom: "+ inventory.size());
        return "showroom details";

    }


    /**
     * default constructor
     */
    public Showroom() {
    }

    /**
     * constructor
     * @param showroomName
     */
    public Showroom(String showroomName) {
        this.showroomName = showroomName;
        this.inventory = new ArrayList<Vehicle>();

    }

    /**
     * constructor
     * @param showroomName
     */
    public Showroom(String showroomName, int vehiclesInShowroom, int showroomLimit) {
        this.showroomName = showroomName;
        this.vehiclesInShowroom = vehiclesInShowroom;
        this.showroomLimit = showroomLimit;
    }

    /**
     * getters and setters
     * @return
     */
    public String getShowroomName() {
        return showroomName;
    }

    public void setShowroomName(String showroomName) {
        this.showroomName = showroomName;
    }

    public ArrayList<Vehicle> getInventory() {
        return inventory;
    }

    public void setInventory(ArrayList<Vehicle> inventory) {
        this.inventory = inventory;
    }

    public int getVehiclesInShowroom() {
        return vehiclesInShowroom;
    }

    public void setVehiclesInShowroom(int vehiclesInShowroom) {
        this.vehiclesInShowroom = vehiclesInShowroom;
    }

    public int getShowroomLimit() {
        return showroomLimit;
    }

    public void setShowroomLimit(int showroomLimit) {
        this.showroomLimit = showroomLimit;
    }
}
