package com.opps2.inheritance;

public class RecipeRunner {

	public static void main(String[] args) {
		Recipe1 recipe1 = new Recipe1();
		recipe1.execute();
		RecipeWithMicrowave recipeWithMicrowave = new RecipeWithMicrowave();
		recipeWithMicrowave.execute();

	}

}
