package com.briedelabz.day2;
import java.util.Scanner;
public class Monthprint {
	

		    public static void main(String[] args) {

	        Scanner Sc = new Scanner(System.in);
	        System.out.println("Enter the month in 1 To 12");
	        int num = Sc.nextInt();

	        switch(num ) {
	            case 1:
	                System.out.println(num + " is January");
	                break;

	            case 2:
	                System.out.println(num + " is February");
	                break;

	            case 3:
	                System.out.println(num + " is March");
	                break;

	            case 4:
	                System.out.println(num + " is April");
	                break;

	            case 5:
	                System.out.println(num + " is May");
	                break;

	            case 6:
	                System.out.println(num + " is June");
	                break;

	            case 7:
	                System.out.println(num + " is July");
	                break;

	            case 8:
	                System.out.println(num + " is August");
	                break;

	            case 9:
	                System.out.println(num + " is September");
	                break;

	            case 10:
	                System.out.println(num + " is October");
	                break;

	            case 11:
	                System.out.println(num + " is November");
	                break;

	            case 12:
	                System.out.println(num + " is December");
	                break;

	            default:
	                System.out.println("not valid number");
	                break;
	        }
	    }
	
}
