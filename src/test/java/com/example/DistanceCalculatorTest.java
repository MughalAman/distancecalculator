package com.example;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class DistanceCalculatorTest {
    @Test
    public void testCalculateDistance() {
        DistanceCalculator calculator = new DistanceCalculator();
        assertEquals(5.0, calculator.calculateDistance(0, 0, 3, 4), 0.001);
    }
}
