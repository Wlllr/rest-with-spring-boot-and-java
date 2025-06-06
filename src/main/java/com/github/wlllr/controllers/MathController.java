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

        if (!isNumeric(firstNumber) || !isNumeric(secondNumber)) throw new IllegalArgumentException();
        return convertToDouble(firstNumber) + convertToDouble(secondNumber);
    }

    private Double convertToDouble(String strNumber) throws IllegalArgumentException {
        if (strNumber == null || strNumber.isEmpty()) throw new IllegalArgumentException();
        String number = strNumber.replace(",", ".");
        return Double.parseDouble(number);
    }

    private boolean isNumeric(String strNumber) {
        if (strNumber == null || strNumber.isEmpty()) return false;
        String number = strNumber.replace(",", ".");
        return number.matches("[-+]?[0-9]*\\.?[0-9]+");
    }
}
