package com.horstmann.part3.ex4and5;

import java.util.ArrayList;
import java.util.Collections;

public class IntSequence {


    private static ArrayList<Integer> sequence = new ArrayList<>();

    public static ArrayList<Integer> of(int... nums) {

        for (int i = 0; i < nums.length; i++) {
            sequence.add(nums[i]);
        }
        Collections.sort(sequence);
        return sequence;
    }

    //Ex5
    public static void constant(int num) {

        ISequence constSeq;
        constSeq = (number) -> System.out.print(num);

        while (true) {
            constSeq.print(num);
        }

    }
}
