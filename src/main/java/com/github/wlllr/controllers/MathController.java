package com.github.wlllr.controllers;

import com.github.wlllr.controllers.reusable.ReusableMethodsOfMathController;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static com.github.wlllr.controllers.reusable.ReusableMethodsOfMathController.*;


@RestController
@RequestMapping("/math")
public class MathController {

    @RequestMapping("/sum/{firstNumber}/{secondNumber}")
    public Double sum(
            @PathVariable("firstNumber") String firstNumber,
            @PathVariable("secondNumber") String secondNumber) throws Exception {

        verifyIfNumeric(!verifyIfNullOrEmpty(firstNumber) || !verifyIfNullOrEmpty(secondNumber));
        return ReusableMethodsOfMathController.getSum(firstNumber, secondNumber);
    }

    @RequestMapping("/subtraction/{firstNumber}/{secondNumber}")
    public Double subtraction(
            @PathVariable("firstNumber") String firstNumber,
            @PathVariable("secondNumber") String secondNumber
        ) throws Exception {

        verifyIfNumeric(!verifyIfNullOrEmpty(firstNumber) || !verifyIfNullOrEmpty(secondNumber));
        return getSubtraction(firstNumber, secondNumber);
    }

    @RequestMapping("/multiplication/{firstNumber}/{secondNumber}")
    public Double multiplication(
            @PathVariable("firstNumber") String firstNumber,
            @PathVariable("secondNumber") String secondNumber
    ) throws Exception {
        verifyIfNumeric(!verifyIfNullOrEmpty(firstNumber) || !verifyIfNullOrEmpty(secondNumber));
        return getMultiplication(firstNumber, secondNumber);
    }

    @RequestMapping("/division/{firstNumber}/{secondNumber}")
    public Double division(
            @PathVariable("firstNumber") String firstNumber,
            @PathVariable("secondNumber") String secondNumber
    ) throws Exception {
        verifyIfNumeric(!verifyIfNullOrEmpty(firstNumber) || !verifyIfNullOrEmpty(secondNumber));
        return getDivision(firstNumber, secondNumber);
    }

    @RequestMapping("/arithmetic/{firstNumber}/{secondNumber}")
    public Double arithmeticMean(
            @PathVariable("firstNumber") String firstNumber,
            @PathVariable("secondNumber") String secondNumber
    ) throws Exception {
        verifyIfNumeric(!verifyIfNullOrEmpty(firstNumber) || !verifyIfNullOrEmpty(secondNumber));
        return getArithmeticMean(firstNumber, secondNumber);
    }

    @RequestMapping("/squareRoot/{firstNumber}")
    public Double squareRoot(
            @PathVariable("firstNumber") String firstNumber
    ) throws Exception {
        verifyIfNumeric(!verifyIfNullOrEmpty(firstNumber));
        return getSquareRoot(firstNumber);
    }

}
