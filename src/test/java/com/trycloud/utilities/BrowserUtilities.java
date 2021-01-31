package com.trycloud.utilities;

public class BrowserUtilities {
    public static void sleep(int second) {
        second *= 1000;
        try {
            Thread.sleep(second);

        } catch (InterruptedException e) {
            System.out.println("Something happened in sleep method");
        }
    }
}
