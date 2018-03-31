package com.anagram;

import java.util.Scanner;

public class Operators {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.println("Enter value:");
		double meal_Cost = in.nextDouble();
		int tip_percent = in.nextInt();
		int tax_percent = in.nextInt();
	int	Total_cost = (int) Math.round((meal_Cost + (meal_Cost * tip_percent / 100) + (meal_Cost * tax_percent / 100)));
		System.out.println("The total meal cost is "+  Total_cost   + " dollars.");

	}

}
