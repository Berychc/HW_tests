package com.example.calkulator.demo.calculatorService;

import com.example.calkulator.demo.exceptions.DivisionError;
import com.example.calkulator.demo.exceptions.NoValuesException;

public interface CalculatorService {
    String welcome();

    int plus(Integer num1, Integer num2) throws NoValuesException, NoValuesException;

    int minus(Integer num1, Integer num2) throws NoValuesException;

    int multiply(Integer num1, Integer num2) throws NoValuesException;

    int divide(Integer num1, Integer num2) throws DivisionError, NoValuesException, DivisionError;
}
