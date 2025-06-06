package com.github.wlllr.controllers;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/math")
public class MathController {

    @RequestMapping("/sum/{firstNumber}/{secondNumber}")
    public Double sum(
            @PathVariable("firstNumber") String firstNumber,
            @PathVariable("secondNumber") String secondNumber) throws Exception {

        if (!isNumeric(firstNumber) || !isNumeric(secondNumber))
            throw new UnsupportedOperationException("Please set a numeric value");
        return convertToDouble(firstNumber) + convertToDouble(secondNumber);
    }

    @RequestMapping("/subtraction/{firstNumber}/{secondNumber}")
    public Double subtraction(
            @PathVariable("firstNumber") String firstNumber,
            @PathVariable("secondNumber") String secondNumber) throws Exception {

        if (!isNumeric(firstNumber) || !isNumeric(secondNumber))
            throw new UnsupportedOperationException("Please set a numeric value");
        return convertToDouble(firstNumber) - convertToDouble(secondNumber);
    }

    @RequestMapping("/multiplication/{firstNumber}/{secondNumber}")
    public Double multiplication(
            @PathVariable("firstNumber") String firstNumber,
            @PathVariable("secondNumber") String secondNumber
    ) throws Exception {
        if (!isNumeric(firstNumber) || !isNumeric(secondNumber))
            throw new UnsupportedOperationException("Please set a numeric value");
        return convertToDouble(firstNumber) * convertToDouble(secondNumber);
    }

    @RequestMapping("/division/{firstNumber}/{secondNumber}")
    public Double division(
            @PathVariable("firstNumber") String firstNumber,
            @PathVariable("secondNumber") String secondNumber
    ) throws Exception {
        if (!isNumeric(firstNumber) || !isNumeric(secondNumber))
            throw new UnsupportedOperationException("Please set a numeric value");

        return convertToDouble(firstNumber) / convertToDouble(secondNumber);
    }

    @RequestMapping("/arithmetic/{firstNumber}/{secondNumber}")
    public Double arithmeticMean(
            @PathVariable("firstNumber") String firstNumber,
            @PathVariable("secondNumber") String secondNumber
    ) throws Exception {
        if (!isNumeric(firstNumber) || !isNumeric(secondNumber))
            throw new UnsupportedOperationException("Please set a numeric value");

        return (convertToDouble(firstNumber) + convertToDouble(secondNumber)) / 2;
    }

    @RequestMapping("/squareRoot/{firstNumber}")
    public Double squareRoot(
            @PathVariable("firstNumber") String firstNumber
    ) throws Exception {
        if (!isNumeric(firstNumber))
            throw new UnsupportedOperationException("Please set a numeric value");

        return Math.pow(convertToDouble(firstNumber), 2);
    }

    private Double convertToDouble(String strNumber) throws IllegalArgumentException {
        if (strNumber == null || strNumber.isEmpty())
            throw new UnsupportedOperationException("Please set a numeric value");
        String number = strNumber.replace(",", ".");
        return Double.parseDouble(number);
    }

    private boolean isNumeric(String strNumber) {
        if (strNumber == null || strNumber.isEmpty()) return false;
        String number = strNumber.replace(",", ".");
        return number.matches("[-+]?[0-9]*\\.?[0-9]+");
    }
}
