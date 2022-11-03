package com.briedelabz.day2;
import java.util.Scanner;
public class Reversenumber {
	

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.println("Enter the number");
	        int n = sc.nextInt();
	        int reminder = 0;
	        int reverse = 0;

	        for(;n != 0;){
	            reminder = n % 10;
	            reverse =reverse * 10 + reminder;
	            n = n / 10;
	        }
	        System.out.println(reverse);
	    }
	
}
