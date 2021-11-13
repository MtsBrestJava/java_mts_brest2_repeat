package com.company;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListTest {
    public static void main(String[] args) throws InterruptedException {
        int length = 5000000;

        List<Integer> list = new LinkedList<Integer>();
        Thread.sleep(100);
        long oldTime = System.currentTimeMillis(); // TIME!
        for (int i = 0; i < length; i++) {
            list.add(i);
        }
        System.out.println("LinkedList fill: " + (System.currentTimeMillis() - oldTime));

        List<Integer> list2 = new ArrayList<Integer>();
        Thread.sleep(100);
        oldTime = System.currentTimeMillis();
        for (int i = 0; i < length; i++) {
            list2.add(i);
        }
        System.out.println("ArrayList fill: " + (System.currentTimeMillis() - oldTime));
    }
}
