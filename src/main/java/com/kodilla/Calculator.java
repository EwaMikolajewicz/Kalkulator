package com.kodilla;

public class Calculator
{
    private double a;
    private double b;

    public double addAToB(double a, double b)
    {
        return a+b;
    }

    public double substarctBFromA(double a, double b)
    {
        return a-b;

    }

    public static void main(String[] args)
    {
     Calculator calculator = new Calculator();
     calculator.addAToB(3.5, 15);
     calculator.substarctBFromA(10.5, 12.3);

        System.out.println("a + b = " + calculator.addAToB(3.5, 15));
        System.out.println("a - b = " + calculator.substarctBFromA(10.5, 12.5));

    }
}
