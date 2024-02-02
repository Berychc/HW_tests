package com.example.calkulator.demo.calculatorService;

import com.example.calkulator.demo.exceptions.DivisionError;
import com.example.calkulator.demo.exceptions.NoValuesException;
import org.springframework.stereotype.Service;

@Service
public class CalculatorServiceIml implements CalculatorService{

    @Override
    public String welcome() {
        return "Добро пожаловать в калькулятор!";
    }

    @Override
    public int plus(Integer num1, Integer num2) throws NoValuesException {
        if (num1 == null|| num2 == null) {
            throw new NoValuesException();
        }
        return num1 + num2;
    }

    @Override
    public int minus(Integer num1, Integer num2) throws NoValuesException {
        if (num1 == null|| num2 == null) {
            throw new NoValuesException();
        }
        return num1 - num2;
    }

    @Override
    public int multiply(Integer num1, Integer num2) throws NoValuesException {
        if (num1 == null|| num2 == null) {
            throw new NoValuesException();
        }
        return num1 * num2;
    }

    @Override
    public int divide(Integer num1, Integer num2) throws NoValuesException, DivisionError {
        if (num1 == null|| num2 == null) {
            throw new NoValuesException();
        }
        if (num2 == 0) {
            throw new DivisionError();
        }
        return num1 / num2;
    }
}