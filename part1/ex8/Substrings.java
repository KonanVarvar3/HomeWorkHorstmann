package com.horstmann.part1.ex8;

public class Substrings {

    //Ex8
    public void subStrings(String str) {

        String sub;

        for (int i = 0; i < str.length(); i++) {
            for (int j = 1; j <= str.length() - i; j++) {
                sub = str.substring(i, i + j);
                System.out.println(sub);
            }
        }
    }
}
