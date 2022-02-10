package com.trios;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MotorcycleTest {

    /**
     * instantiate the object in order to be tested
     */
    @BeforeEach
    void setUp() {Motorcycle m1 = new Motorcycle(1598,32000,"Harley", 2019,250.0);
    }

    /**
     * test if the expected price is correct
     */
    @Test
    void currentBikePrice() {assertSame(19200, 2021); }
}