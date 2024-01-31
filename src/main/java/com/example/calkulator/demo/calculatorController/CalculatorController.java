package com.example.calkulator.demo.calculatorController;

import com.example.calkulator.demo.calculatorService.CalculatorService;
import com.example.calkulator.demo.exceptions.DivisionError;
import com.example.calkulator.demo.exceptions.NoValuesException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/calculator")
public class CalculatorController {

    private final CalculatorService calkulatorService;

    public CalculatorController(CalculatorService calkulatorService) {
        this.calkulatorService = calkulatorService;
    }

    @GetMapping
    public String welcome() {
        return calkulatorService.welcome();
    }

    @GetMapping("/plus")
    public String plus(@RequestParam("num1") Integer num1, @RequestParam("num2") Integer num2) throws NoValuesException {
        return num1 + " + " + num2 + " = " + calkulatorService.plus(num1, num2);
    }

    @GetMapping("/minus")
    public String minus(@RequestParam("num1") int num1, @RequestParam("num2") int num2) throws NoValuesException {
        return num1 + " + " + num2 + " = " + calkulatorService.minus(num1, num2);
    }

    @GetMapping("/multiply")
    public String multiply(@RequestParam("num1") int num1, @RequestParam("num2") int num2) throws NoValuesException {
        return num1 + " + " + num2 + " = " + calkulatorService.multiply(num1, num2);
    }

    @GetMapping("/divide")
    public String divide(@RequestParam("num1") int num1, @RequestParam("num2") int num2) throws DivisionError, NoValuesException {
        return num1 + " + " + num2 + " = " + calkulatorService.divide(num1, num2);
    }
}
