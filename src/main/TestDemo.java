package main;

import org.junit.Test;

import static org.junit.Assert.*;

public class TestDemo {
    MaximumNumber maximumNumber = new MaximumNumber();

    @Test
    public void testCase1() {
        assertEquals(Float.valueOf(10), maximumNumber.maximumTest(10f, 5f, 1f));
    }

    @Test
    public void testCase2() {
        assertEquals(Float.valueOf(10), maximumNumber.maximumTest(5f, 10f, 1f));
    }

    @Test
    public void testCase3() {
        assertEquals(Float.valueOf(10), maximumNumber.maximumTest(1f, 5f, 10f));
    }
}
