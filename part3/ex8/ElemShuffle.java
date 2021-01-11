package com.horstmann.part3.ex8;

import java.util.*;

public class ElemShuffle {

    private String str;

    public ElemShuffle(String str) {
        this.str = str;
    }

    public String getStr() {
        return str;
    }

    public void luckySort(ArrayList<String> strings, Comparator<String> comp) {

        while (true) {
            for (int i = 0; i < strings.size(); i++) {

                if (i + 1 == strings.size()) {
                    break;
                }
                if (comp.compare(strings.get(i), strings.get(i + 1)) < 0) {
                    return;
                }

            }
            Collections.shuffle(strings);
        }
    }


}
