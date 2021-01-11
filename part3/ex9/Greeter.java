package com.horstmann.part3.ex9;

public class Greeter implements Runnable {

    private int n;
    private String target;

    public Greeter(int n, String target) {
        this.n = n;
        this.target = target;
    }

    @Override
    public void run() {
        for (int i = 0; i < n; i++) {
            System.out.println("Hello, " + target);
        }
    }

    /*public static void main(String[] args) {
        Thread thread = new Thread(new Greeter(2,"World"));
        Thread thread2 = new Thread(new Greeter(3,"Cat"));

        thread.start();
        thread2.start();
    }*/
}
