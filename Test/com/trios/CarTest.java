package com.trios;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarTest {

    /**
     * instantiate the object in order to be tested
     */
    @BeforeEach
    void setUp() {
        Car c1 = new Car(123456, 40000, "Mazda", 2017, 5);
    }

    /**
     * test if the expected price is correct
     */
    @Test
    void currentCarPrice() {
        assertSame(40000, 2021);
    }
}

