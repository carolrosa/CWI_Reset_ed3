package com.company;

public class EnhancedFor {

    public static void main (String[] args) {

        int[] array = {1,2,3,4,5};

        for (int i : array) {
            if (i==5) {
                System.out.println(i);
            }
        }
    }
}
