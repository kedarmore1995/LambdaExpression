package com.assignment;

public class MathOperation {
    public static void main(String[] args) {
        IMathFunction add = (x, y) -> x + y;
        IMathFunction subtract = (x, y) -> x - y;
        IMathFunction divide = (x, y) -> x / y ;

        System.out.println("Sum is = " + add.calculate(8,5));
        System.out.println("Multiplication is = " + subtract.calculate(8,5));
        System.out.println("Division is = " + divide.calculate(10,5));
    }
    interface IMathFunction{
    int calculate(int a, int b);
    }
}
