package com.horstmann.part1.ex7;

import java.util.Scanner;

public class ComputeInt {

    //Ex7
    public void actionsWithNumbers() throws OutOfRangeException {

        Scanner scanner = new Scanner(System.in);

        int num1 = Math.toIntExact(Integer.toUnsignedLong(Integer.parseInt(scanner.nextLine())));
        int num2 = Math.toIntExact(Integer.toUnsignedLong(Integer.parseInt(scanner.nextLine())));

        if (Integer.toUnsignedLong(num1) < 0 || Integer.toUnsignedLong(num1) > 4294967295L ||
                Integer.toUnsignedLong(num2) < 0 || Integer.toUnsignedLong(num2) > 4294967295L) {
            System.out.println("Arguments of function < 0");
            return;
        }

        System.out.println("Sum = " + (Integer.toUnsignedLong(num1) + Integer.toUnsignedLong(num2)));
        System.out.println("Difference = " + (Integer.toUnsignedLong(num1) - Integer.toUnsignedLong(num2)));
        System.out.println("Product = " + (Integer.toUnsignedLong(num1) * Integer.toUnsignedLong(num2)));
        System.out.println("Quotient = " + (Integer.toUnsignedLong(num1) / Integer.toUnsignedLong(num2)));
        System.out.println("Remainder = " + (Integer.toUnsignedLong(num1) % Integer.toUnsignedLong(num2)));
    }
}
