package com.trios;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PickupTruckTest {

    /**
     * instantiate the object in order to be tested
     */
    @BeforeEach
    void setUp() {PickupTruck p1 = new PickupTruck(789456,50000,"Ram",2018,1000.0);
    }

    /**
     * test if the expected price is correct
     */
    @Test
    void currentTruckPrice() {assertSame(36500, 2021);
    }
}