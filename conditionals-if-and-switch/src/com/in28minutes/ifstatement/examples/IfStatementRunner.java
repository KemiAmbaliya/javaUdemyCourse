package com.in28minutes.ifstatement.examples;

import javax.management.loading.PrivateClassLoader;

public class IfStatementRunner {

	public static void main(String[] args) {
		puzzle1();
		

	}
	private static void puzzle1() {
		int k =15;
		if(k>20) {
			System.out.println(1);
		}
		else if (k>10) {
			System.out.println(2);
		}
		else if (k>20) {
			System.out.println(3);
		}
		else {
			System.out.println(4);
		}
	}

}
