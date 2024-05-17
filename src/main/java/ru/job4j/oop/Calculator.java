package ru.job4j.oop;

public class Calculator {
    private static int x = 5;

    public static int sum(int y) {
        return x + y;
    }

    public int multiply(int a) {
        return x * a;
    }

    public int divide(int b) {
        return b / x;
    }

    public static int minus(int y) {
        return x - y;
    }

    public int sumAll(int c) {
        return sum(c) + minus(c) + multiply(c) + divide(c);
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int result = calculator.multiply(5);
        System.out.println(result);
        result = sum(10);
        System.out.println(result);
        result = minus(5);
        System.out.println(result);
        result = calculator.divide(20);
        System.out.println(result);
        result = calculator.sumAll(25);
        System.out.println(result);
    }
}