package com.gopal.Gk;

public class MyChar {
	private char ch;
	public MyChar(char ch) {
		this.ch =ch;
	}
	public boolean isVowel() {
		if(ch=='a' || ch=='e' || ch == 'i'|| ch == 'o'|| ch == 'u')
			return true;
	
		return false;
	}
	public boolean isDigit() {
		if(ch >= 48 && ch <=57)//between '0' and '9'
		return true;
		
		return false;
	}
	public boolean isAlphabet() {
		if(ch >= 65 && ch <=90)//between 'a' and 'z'
		return true;
		
		return false;
	}
	public boolean isConsonant() {
		//Alphabet and it is not vowel
		//![a,e,i,o,u]
		if (isAlphabet() && !isVowel()) 
			return true;
			return false;
	
	}
	public static void printLowerCaseAlphabets() {
		//'a' to 'z'
		for (char ch= 'a'; ch<='z'; ch++) {
			System.out.println(ch);
		}}
		public static void printUpperCaseAlphabets() {
			//'a' to 'z'
			for (char ch= 'A'; ch<='Z'; ch++) {
				System.out.println(ch);
			}
		
		
	}

}
