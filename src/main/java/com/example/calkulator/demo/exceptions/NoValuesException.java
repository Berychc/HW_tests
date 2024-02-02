package com.example.calkulator.demo.exceptions;

public class NoValuesException extends Exception {
    public NoValuesException() {

        super("Оба параметра должны быть указаны");
    }
}
