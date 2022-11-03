package com.briedelabz.day3;


import java.util.Arrays;

public class Smallestnumber {
    public static void main(String[] args) {
        int [] a = {3,6,8,2,4,5,7,1};

        Arrays.sort(a);

        System.out.println("The largest element is "+ a[a.length-2]);
    }
}

