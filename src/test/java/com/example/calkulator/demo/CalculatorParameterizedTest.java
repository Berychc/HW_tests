package com.example.calkulator.demo;

import com.example.calkulator.demo.calculatorService.CalculatorServiceIml;
import com.example.calkulator.demo.exceptions.DivisionError;
import com.example.calkulator.demo.exceptions.NoValuesException;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorParameterizedTest {

    @ParameterizedTest
    @CsvSource({"2, 3, 5", "5, 7, 12", "10, 3, 13"})
    public void testPlus(int num1, int num2, int expected) throws NoValuesException {
        assertEquals(expected, new CalculatorServiceIml().plus(num1, num2));
    }

    @ParameterizedTest
    @CsvSource({"5, 2, 3", "10, 7, 3", "10, 10, 0"})
    public void testMinus(int num1, int num2, int expected) throws NoValuesException {
        assertEquals(expected, new CalculatorServiceIml().minus(num1, num2));
    }

    @ParameterizedTest
    @CsvSource({"2, 3, 6", "5, 7, 35", "4, 4, 16" })
    public void testMultiply(int num1, int num2, int expected) throws NoValuesException {
        assertEquals(expected, new CalculatorServiceIml().multiply(num1, num2));
    }

    @ParameterizedTest
    @CsvSource({"6, 3, 2", "49, 7, 7", "100, 10, 10" })
    public void testDivide(int num1, int num2, int expected) throws DivisionError, NoValuesException {
        assertEquals(expected, new CalculatorServiceIml().divide(num1, num2));
    }
}
