package main;

import org.junit.Test;

import static org.junit.Assert.*;

public class TestDemo {
    MaximumNumber maximumNumberInt1 = new MaximumNumber(10, 5, 1);
    MaximumNumber maximumNumberFloat1 = new MaximumNumber(10f, 5f, 1f);
    MaximumNumber maximumNumberString1 = new MaximumNumber("Peach", "Banana", "Apple");

    MaximumNumber maximumNumberInt2 = new MaximumNumber(5, 10, 1);
    MaximumNumber maximumNumberFloat2 = new MaximumNumber(5f, 10f, 1f);
    MaximumNumber maximumNumberString2 = new MaximumNumber("Apple", "Peach", "Banana");

    MaximumNumber maximumNumberInt3 = new MaximumNumber(1, 5, 10);
    MaximumNumber maximumNumberFloat3 = new MaximumNumber(1f, 5f, 10f);
    MaximumNumber maximumNumberString3 = new MaximumNumber("Apple", "Banana", "Peach");



    @Test
    public void testCase1() {
        assertEquals(Integer.valueOf(10), maximumNumberInt1.maximumTest());
        assertEquals(Float.valueOf(10), maximumNumberFloat1.maximumTest());
        assertEquals("Peach", maximumNumberString1.maximumTest());

    }

    @Test
    public void testCase2() {
        assertEquals(Integer.valueOf(10), maximumNumberInt2.maximumTest());
        assertEquals(Float.valueOf(10), maximumNumberFloat2.maximumTest());
        assertEquals("Peach", maximumNumberString2.maximumTest());
    }

    @Test
    public void testCase3() {
        assertEquals(Integer.valueOf(10), maximumNumberInt3.maximumTest());
        assertEquals(Float.valueOf(10), maximumNumberFloat3.maximumTest());
        assertEquals("Peach", maximumNumberString3.maximumTest());
    }
}
