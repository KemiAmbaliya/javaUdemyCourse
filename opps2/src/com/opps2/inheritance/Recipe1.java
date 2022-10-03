package com.opps2.inheritance;

public class Recipe1 extends AbstractRecipe{
	@Override
	void getReady() {
		System.out.println("Get the raw materials");
		System.out.println("Get the materials");
		
	}
	@Override
	void doTheDish() {
		System.out.println("do the dish");
		
		
	}
	@Override
	void cleanup() {
		System.out.println("Cleanup the utensils");
		
	}
	
}
