package com.assignment;

public class ShowResult {
    public static void main(String[] args) {
        AMathFunction add = (x, y) -> x + y;
        AMathFunction.printResult(5,5,"addition",add);
        AMathFunction subtract = (x, y) -> x - y;
        AMathFunction.printResult(5,5,"subtraction",subtract);
        AMathFunction divide = (x, y) -> x / y ;
        AMathFunction.printResult(5,5,"division",divide);
    }
    interface AMathFunction{
        int calculate (int a, int b);

        static void printResult(int a, int b, String function, AMathFunction fObj){
            System.out.println("Result of "+function+" is "+fObj.calculate(a, b));
        }
    }
}
