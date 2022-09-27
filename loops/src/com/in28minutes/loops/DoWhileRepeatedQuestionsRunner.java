package com.in28minutes.loops;

import java.util.Scanner;

public class DoWhileRepeatedQuestionsRunner {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int number = -1;
		do {
			if(number != -1) {
			System.out.println("cube is " + (number * number * number));}
			System.out.println("Enter a number: ");
			number = scanner.nextInt();
			
		} while (number >= 0);
		System.out.println("Thank you! Have Fun!");
	}

}
