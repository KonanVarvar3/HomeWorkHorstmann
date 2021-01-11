package com.horstmann.part1.ex14;

import java.util.ArrayList;
import java.util.Scanner;

public class MagicSquare {
    //Ex14

    public boolean isMagic(int[][] array) {

        int checkSide = 0;

        for (int i = 0; i < array.length; i++) {
            int row = 0;
            int col = 0;
            for (int j = 0; j < array.length; j++) {
                if (i == 0) {
                    checkSide += array[i][j];
                }
                row += array[i][j];
                col += array[j][i];
            }
            if (row != checkSide || col != checkSide) {
                return false;
            }
        }

        int diagonal1 = 0;
        int i = 0;
        for (int j = 0; j < array.length; j++) {
            diagonal1 += array[j][i];
        }
        if (diagonal1 != checkSide) {
            return false;
        }

        int diagonal2 = 0;
        i = array.length - 1;
        for (int j = 0; j < array.length; j++) {
            diagonal2 += array[i - j][j];
        }
        if (diagonal2 != checkSide) {
            return false;
        }
        return true;
    }

    private void printArray(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public void Square() {
        Scanner in = new Scanner(System.in);
        ArrayList<String> al = new ArrayList<>();

        System.out.println("Enter matrix: ");

        while (true) {
            String str = in.nextLine();
            if (str.isEmpty()) {
                break;
            }
            al.add(str);
        }

        int[][] array = new int[al.size()][al.size()];

        for (int i = 0; i < al.size(); i++) {
            String[] input = al.get(i).split(" ");
            for (int j = 0; j < al.size(); j++) {
                array[i][j] = Integer.parseInt(input[j]);
            }
        }

        printArray(array);

        if (isMagic(array)) {
            System.out.println("Square is magic");
            return;
        }

        System.out.println("Square is not magic");
    }
}
