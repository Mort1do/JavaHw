package Hw11N5;

import java.util.ArrayList;
import java.util.LinkedList;

public class Tester {
    public static void main(String[] args) {
        ArrayList<Integer> integers = new ArrayList<>();
        LinkedList<Integer> integers1 = new LinkedList<>();
        for (int i = 0; i < 100; i++) {
            integers.add(i*10);
            integers1.add(i*10);
        }
        System.out.println("Adding to ArrayList: " + measureTime(() -> {
            integers.add(123);
        }) + " nanoseconds");
        System.out.println("Adding to LinkedList: " + measureTime(() -> {
            integers1.add(123);
        }) + " nanoseconds");
        System.out.println("\nRemoving from ArrayList: " + measureTime(() -> {
            integers.remove(1);
        }) + " nanoseconds");
        System.out.println("Removing from LinkedList: " + measureTime(() -> {
            integers1.remove(1);
        }) + " nanoseconds");
        System.out.println("\nSearching in ArrayList: " + measureTime(() -> {
            integers.indexOf(500);
        }) + " nanoseconds");
        System.out.println("Searching in LinkedList: " + measureTime(() -> {
            integers1.indexOf(500);
        }) + " nanoseconds");
    }

    public static long measureTime (Runnable code) {
        long startTime = System.nanoTime();
        code.run();
        return System.nanoTime() - startTime;
    }
}