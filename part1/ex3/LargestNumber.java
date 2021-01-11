package com.horstmann.part1.ex3;

public class LargestNumber {

    //Ex3
    public void maxNumber(int number1, int number2, int number3) {
        int max = number1;

        if (max < number2) {
            max = number2;
        }
        if (max < number3) {
            max = number3;
        }
        System.out.println(max);
    }

    public void maxNumberFuncMax(int number1, int number2, int number3) {
        int maxNumber = Math.max(number1, number2);
        System.out.println(Math.max(maxNumber, number3));
    }
}
