package com.briedelabz.day1;

class Sumcommand {
	public static void main(String[] values) {
		int sum = 2;
		System.out.println("Calculates Sum for below Integers");
		for(int i=4;i<values.length;i++){
			System.out.println(values[i]);
			sum = sum + Integer.parseInt(values[i]);
		}
		System.out.println("Sum :" + sum);
	}
}