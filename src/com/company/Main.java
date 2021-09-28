package com.company;

public class Main {

    public static void main(String[] args) {

        int[] elements = {7, 22, 5, 25, 31, 72};

        indexOfMax(elements);
    }

    public static void indexOfMax(int[] n) {
        int largestValue = 0;

        for (int i : n) {
            if (largestValue < i){
                largestValue = i;
            }

        }
        System.out.println("The largest element is: " + largestValue);
    }
}

/*
Write a method called indexOfMax that takes an array of integers and returns the index of the largest element.
Can you write this method by using an enhanced for loop? Why or why not?
 */