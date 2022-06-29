package com.qa.enums;

public class CountryRunner {


	public static void main(String[] args) {
		Country england = Country.ENGLAND;
		System.out.println(england.details());
System.out.println(england.averageIncome(503000000*1000));

	}
}


