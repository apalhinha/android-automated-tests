package info.trustzone.androidautomatedtests;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by andre on 2017-12-21.
 * Calculator class test
 */
public class CalculatorTest {
    @Test
    public void multiply() throws Exception {
        Calculator calculator = new Calculator();
        assertEquals("Unable to multiply", 6, calculator.multiply(2, 3));
    }

    @Test
    public void divide() throws Exception {
        Calculator calculator = new Calculator();
        assertEquals("Should be 3", 3, calculator.divide(15, 5));
    }

    @Test
    public void divide_withBigNumbers() throws Exception {
        Calculator calculator = new Calculator();
        assertEquals("Doesn't work with big numbers", 1924, calculator.divide(15270788, 7937));
    }
}