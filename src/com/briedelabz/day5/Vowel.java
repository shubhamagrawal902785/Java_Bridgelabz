package com.briedelabz.day5;
import java.util.Scanner;
public class Vowel {
	

	

		public static void main(String[] args) {

			Scanner sc = new Scanner(System.in);
	        System.out.println("Enter the Alphabet");
	        char aplhabet = sc.next().charAt(0);

	        if (aplhabet == 'a' || aplhabet == 'e'|| aplhabet == 'i' || aplhabet == 'o' || aplhabet == 'u' || aplhabet == 'A' || aplhabet == 'E'|| aplhabet == 'I' || aplhabet == 'O' || aplhabet == 'U'){
	            System.out.println("The alphabet is vowel");
	        }else
	            System.out.println("The number is consonant");
		
	        sc.close();
		}

	}

