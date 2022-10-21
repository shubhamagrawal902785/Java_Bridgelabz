package com.briedelabz.day6;
import java.util.Random;
import java.util.Scanner;
public class Couponnumber {
	
	public static boolean isPresent(int array[], int randNum){
	        for (int i = 0; i<array.length; i++){
	            if(array[i] == randNum){
	                return true;
	            }
	        }
	        return false;
	    }

	    public static void uniqueNum(int coupArray []){
	        for (int i = 0; i<coupArray.length; i++){
	            System.out.println(coupArray[i]);
	        }
	    }

	    public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);
	        System.out.println("Enter the number of coupons you require");

	        int num = sc.nextInt();

	        int array [] = new int[num];

	        Random random = new Random();
	        int randNum = 0;
	        boolean check;

	        for (int i = 0; i<array.length; i++){
	            randNum = random.nextInt();
	            check = isPresent(array, randNum);

	            if (check == false){
	                array[i] = randNum;
	            }else {
	                i--;
	            }
	        }
	        uniqueNum(array);

	    }
	}


