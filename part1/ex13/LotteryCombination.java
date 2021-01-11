package com.horstmann.part1.ex13;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class LotteryCombination {

    //Ex13
    public void lotteryList() {
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> lottery = new ArrayList<>();

        for (int i = 1; i < 50; i++) {
            list.add(i);
        }

        for (int i = 0; i < 6; ) {
            Random random = new Random();
            int number = random.nextInt(48) + 1;

            if (list.contains(number)) {
                Integer obj = number;
                list.remove(obj);
                lottery.add(number);
                i++;
            }
        }
        Collections.sort(lottery);
        System.out.println(lottery.toString());
    }
}
