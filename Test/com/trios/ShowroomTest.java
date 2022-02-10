package com.trios;

import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.*;

class ShowroomTest {

    /**
     * instantiate the object in order to be tested
     */
    @BeforeEach
    void setUp() {
        Car c1 = new Car(123456,40000,"Mazda", 2017,5);
        PickupTruck p1 = new PickupTruck(789456,50000,"Ram",2018,1000.0);
        Motorcycle m1 = new Motorcycle(1598,32000,"Harley", 2019,250.0);
    }



    @Test
        void addToInventoryLow() {
            Showroom s1 = new Showroom("Toronto",98,100);
            assertSame("Low inventory", s1.addToInventory(c1));
        }

    @Test
        void addToInventoryOverflow() {
        Showroom s1 = new Showroom("Toronto",100,100);
        assertSame("Overflow inventory", s1.addToInventory(c1));
        }

    @Test
        void addToInventoryupdated() {
        Showroom s1 = new Showroom("Toronto",70,100);
        assertSame("Updated inventory", s1.addToInventory(c1));
        }


}