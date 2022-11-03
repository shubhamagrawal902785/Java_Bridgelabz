package com.briedelabz.day5;
import java.util.Scanner;
public class Flipcoin {
	
	

	
		public static void main(String[] args) {


			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the no of flip coin");
			int flip = sc.nextInt();
			int head = 0;
			int tail = 0;


			for(int i = 0; i<flip; i++) {

				int coin = (int)(Math.random() *2);

				if(flip == 1) {
					System.out.println("The outpit is Head");
					head += 1;
				}else {
					System.out.println("The output is Tail");
					tail += 1;
				}

			}

			System.out.println("Total number of tails are " +tail);
			float p1 = (tail*100)/flip;
			System.out.println("The tail percentage is " +p1);
			System.out.println("Total Number of Heads are " +head);
			float p2 = (head*100)/flip;
			System.out.println("The head percentage is " +p2);

			sc.close();
		}

	

}
