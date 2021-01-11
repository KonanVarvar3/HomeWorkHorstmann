package com.horstmann.part1.ex1;

public class PrintNumbers {
    //Ex1
    public void printNumberDifferentForm(int number) {

        System.out.println(Integer.toBinaryString(number));
        System.out.println(Integer.toOctalString(number));
        System.out.println(Integer.toHexString(number));
        System.out.println(Float.toHexString(Integer.reverse(number)));
    }
}
