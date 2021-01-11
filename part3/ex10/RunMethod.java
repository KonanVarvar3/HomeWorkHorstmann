package com.horstmann.part3.ex10;

import com.horstmann.part3.ex9.Greeter;

import java.util.TreeSet;

public class RunMethod {

    public static void runTogether(Runnable... tasks) {

        for (int i = 0; i < tasks.length; i++) {
            Thread thread = new Thread(tasks[i]);
            thread.start();
        }
    }

    public static void runInOrder(Runnable... tasks) {

        for (int i = 0; i < tasks.length; i++) {
            Thread thread = new Thread(tasks[i]);
            thread.run();
        }
    }

}
