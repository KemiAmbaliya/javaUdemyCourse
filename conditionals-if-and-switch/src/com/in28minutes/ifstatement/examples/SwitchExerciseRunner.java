package com.in28minutes.ifstatement.examples;

public class SwitchExerciseRunner {

	public static void main(String[] args) {
		System.out.println(determineNameOfDay(2));
		System.out.println(isWeekDay(0));

	}

	public static String determineNameOfDay(int dayNumber) {
		switch (dayNumber) {
		case 0:
			return "Sunday";
		
		case 1:
			return  "Monday";
		
		case 2:
			return "Tuesday";
			
		case 3:
			return  "Wednesday";
			
		case 4:
			return  "Thursday";
		
		case 5:
			return "Friday";
			
		case 6:
			return  "Sturday";
			

		}
		return "Invalid day";
	}
	public static boolean isWeekDay(int dayNumber) {
		switch(dayNumber) {
		case 1: 
		case 2: 
		case 3: 
		case 4: 
		case 5: return true;
		
		}
		return false;
	}

}
