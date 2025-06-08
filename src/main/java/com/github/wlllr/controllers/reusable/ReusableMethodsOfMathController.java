package com.github.wlllr.controllers.reusable;

public final class ReusableMethodsOfMathController {
    // Nao quero criar instancia
    // Essa classe tem um metodo que verifica se uma entrada é numerica
    public static boolean verifyIfNullOrEmpty(String strNumber) {
        if (strNumber == null || strNumber.isEmpty()) return false;
        String number = strNumber.replace(",", ".");
        return number.matches("[-+]?[0-9]*\\.?[0-9]+");
    }

    public static void verifyIfNumeric(Boolean number) {
        if (number)
            throw new UnsupportedOperationException("Please set a numeric value");
    }

    public static double convertToDouble(String strNumber) throws UnsupportedOperationException {
        String number = strNumber.replace(",", ".");
        return Double.parseDouble(number);
    }

    public static double getSum(String firstNumber, String secondNumber) {
        return convertToDouble(firstNumber) + convertToDouble(secondNumber);
    }

    public static double getSubtraction(String firstNumber, String secondNumber) {
        return convertToDouble(firstNumber) - convertToDouble(secondNumber);
    }

    public static double getMultiplication(String firstNumber, String secondNumber) {
        return convertToDouble(firstNumber) * convertToDouble(secondNumber);
    }

    public static double getDivision(String firstNumber, String secondNumber) {
        return convertToDouble(firstNumber) / convertToDouble(secondNumber);
    }

    public static double getArithmeticMean(String firstNumber, String secondNumber) {
        return (convertToDouble(firstNumber) + convertToDouble(secondNumber)) / 2;
    }

    public static double getSquareRoot(String firstNumber) {
        return Math.sqrt(convertToDouble(firstNumber));
    }
}
