package com.primitivedatatypes;
import java.math.BigDecimal;

public class SimpleInterestJava {
	BigDecimal principal;
	BigDecimal interest;
	public SimpleInterestJava(String principal,String interest) {
		this.principal = new BigDecimal(principal);
		this.interest= new BigDecimal(interest).divide(new BigDecimal(100));
	}
	public BigDecimal calculateTotalValue(int noOfYears) {
		BigDecimal noOfYearsBigDecimal = new BigDecimal(noOfYears);
		BigDecimal totalValue = principal.add(principal.add(principal.multiply(interest).multiply(noOfYearsBigDecimal)));
		return totalValue;
	}

}
