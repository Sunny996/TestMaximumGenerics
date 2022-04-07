package main;

import org.junit.Test;

import static org.junit.Assert.*;

public class TestDemo {
    MaximumNumber maximumNumber = new MaximumNumber();

    @Test
    public void testCase1() {
        assertEquals("Peach", maximumNumber.maximumTest("Peach", "Banana", "Apple"));
    }

    @Test
    public void testCase2() {
        assertEquals("Peach", maximumNumber.maximumTest("Apple", "Peach", "Banana"));
    }

    @Test
    public void testCase3() {
        assertEquals("Peach", maximumNumber.maximumTest("Apple", "Banana", "Peach"));
    }
}
