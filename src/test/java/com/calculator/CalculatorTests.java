package com.calculator;

import org.junit.*;

public class CalculatorTests {
    private Calculator calculator;

    @Before
    public void init(){
        calculator = new Calculator();
    }

    @Test
    public void testAdd(){
        int a = 5;
        int b = 6;
        int expected = 11;
        int result = calculator.add(a,b);
        Assert.assertEquals(expected,result);
    }

    @Test
    public void testSubtract(){
        int a = 5;
        int b = 6;
        int expected = -1;
        int result = calculator.subtract(a,b);
        Assert.assertEquals(expected,result);
    }

    @Test
    public void testMultiply(){
        int a = 5;
        int b = 6;
        int expected = 30;
        int result = calculator.multiply(a,b);
        Assert.assertEquals(expected,result);
    }

    @Test
    public void testDivide(){
        int a = 10;
        int b = 2;
        double expected = 5.0;
        double result = calculator.divide(a,b);
        Assert.assertEquals(expected,result,0.00005);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testDividebyZero(){
        int a = 5;
        int b = 0;
        calculator.divide(a,b);
    }
}
