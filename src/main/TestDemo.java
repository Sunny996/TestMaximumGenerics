package main;

import org.junit.Test;

import static org.junit.Assert.*;

public class TestDemo {
    MaximumNumber maximumNumber = new MaximumNumber();

    @Test
    public void testCase1() {
        assertEquals(Integer.valueOf(10), maximumNumber.maximumTest(10, 5, 1));
        assertEquals(Float.valueOf(10), maximumNumber.maximumTest(10f, 5f, 1f));
        assertEquals("Peach", maximumNumber.maximumTest("Peach", "Banana", "Apple"));

    }

    @Test
    public void testCase2() {
        assertEquals(Integer.valueOf(10), maximumNumber.maximumTest(5, 10, 1));
        assertEquals(Float.valueOf(10), maximumNumber.maximumTest(5f, 10f, 1f));
        assertEquals("Peach", maximumNumber.maximumTest("Apple", "Peach", "Banana"));
    }

    @Test
    public void testCase3() {
        assertEquals(Integer.valueOf(10), maximumNumber.maximumTest(1, 5, 10));
        assertEquals(Float.valueOf(10), maximumNumber.maximumTest(1f, 5f, 10f));
        assertEquals("Peach", maximumNumber.maximumTest("Apple", "Banana", "Peach"));
    }
}
