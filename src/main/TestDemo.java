package main;
import org.junit.Test;

import static org.junit.Assert.*;

public class TestDemo {
    MaximumNumber maximumNumber = new MaximumNumber();

    @Test
    public void testCase1(){
        assertEquals(10,maximumNumber.maximumTest(10,5,1));
    }
    @Test
    public void testCase2(){
        assertEquals(10,maximumNumber.maximumTest(5,10,1));
    }
    @Test
    public void testCase3(){
        assertEquals(10,maximumNumber.maximumTest(1,5,10));
    }
}
