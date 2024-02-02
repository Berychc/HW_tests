package com.example.calkulator.demo;

import com.example.calkulator.demo.calculatorService.CalculatorService;
import com.example.calkulator.demo.calculatorService.CalculatorServiceIml;
import com.example.calkulator.demo.exceptions.DivisionError;
import com.example.calkulator.demo.exceptions.NoValuesException;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CalculatorTest {

    @Test
    public void testPlus() throws NoValuesException {
        CalculatorService calculatorService = new CalculatorServiceIml();
        assertEquals(5, calculatorService.plus(2, 3));
        assertEquals(-1, calculatorService.plus(-2, 1));
    }

    @Test
    public void testMinus() throws NoValuesException {
        CalculatorService calculatorService = new CalculatorServiceIml();
        assertEquals(1, calculatorService.minus(4, 3));
        assertEquals(-5, calculatorService.minus(5, 10));
    }

    @Test
    public void testMultiply() throws NoValuesException {
        CalculatorService calculatorService = new CalculatorServiceIml();
        assertEquals(6, calculatorService.multiply(2, 3));
        assertEquals(-10, calculatorService.multiply(5, -2));
    }

    @Test
    public void testDivide() throws DivisionError, NoValuesException {
        CalculatorService calculatorService = new CalculatorServiceIml();
        assertEquals(2, calculatorService.divide(6, 3));
        assertEquals(-2, calculatorService.divide(10, -5));
    }

    @Test
    public void testDivideZero() {
        CalculatorService calculatorService = new CalculatorServiceIml();
        assertThrows(DivisionError.class, () -> {
            calculatorService.divide(5, 0);
        });
    }

}
