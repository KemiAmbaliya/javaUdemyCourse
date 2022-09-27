package com.primitivedatatypes;

import java.math.BigDecimal;

public class SimpleInterest {

	public static void main(String[] args) {
	SimpleInterestJava calculator = new SimpleInterestJava("4500.00","7.5");
	BigDecimal totalValue = 
			calculator.calculateTotalValue(5);
	System.out.println(totalValue);

	}

}
