package com.horstmann.part1.ex10;

import java.util.Random;

public class RandomStringLettersDigits {
    //Ex10

    public void randString() {
        char[] symbols = "1234567890abcdefghijklmnopqrstuvwxyz".toCharArray();
        StringBuilder sb = new StringBuilder(36);
        Random random = new Random();

        for (int i = 0; i < 36; i++) {
            char c = symbols[random.nextInt(symbols.length)];
            sb.append(c);
        }

        String str = sb.toString();
        System.out.println(str);
    }
}
