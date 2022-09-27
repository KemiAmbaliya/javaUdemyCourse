package com.in28minutes.ifstatement.examples;

import java.util.Scanner;

public class MenuRunner {
	public static void main(String[] args) {
		//Type obj = new Type(argument)
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter Number1: ");
		int number1= scanner.nextInt();
		System.out.print("Enter Number2: ");
		int number2= scanner.nextInt();
		System.out.println("choices available are ");
		System.out.print("1- Add");
		System.out.print("2- substract");
		System.out.print("3- divide");
		System.out.print("4- multiplication");
		
		System.out.print("Enter choice: ");
		int choice = scanner.nextInt();
		
		System.out.println("your choices are");
		System.out.println("number1 " + number1);
		System.out.println("number2 " + number2);
		System.out.println("choice " + choice);
		
		performOperationUsingSwitch(number1, number2, choice);
		
		
}

	private static void performOperationUsingSwitch(int number1, int number2, int choice) {
		switch(choice) {
		case 1 : System.out.println("Result " + (number1 +number2));
		break;
		case 2 : System.out.println("Result " + (number1 -number2));
		break;
		case 3 : System.out.println("Result " + (number1 /number2));
		break;
		case 4 : System.out.println("Result " + (number1 *number2));
		break;
		default:System.out.println("Invalid Operation");
		break;
		}
		if(choice==1) {
			System.out.println("Result " + (number1 +number2));
		}else if(choice==2) {
			System.out.println("Result " + (number1 - number2));
		}else if(choice==3) {
			System.out.println("Result " + (number1 / number2));
		}else if(choice==4) {
			System.out.println("Result " + (number1 * number2));
		}
	}
	
	
}
