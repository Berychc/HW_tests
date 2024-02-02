package com.example.calkulator.demo.exceptions;

public class DivisionError extends Exception {

    public DivisionError() {
        super("Делить на ноль нельзя!");
    }
}
