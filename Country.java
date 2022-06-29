package com.qa.enums;


public enum Country {
	ENGLAND("London", 8.982f,false, 81.65),
	FRANCE("Paris", 2.161f, false, 83),
	GERMANY("Berlin", 3.645f, false,81.72),
	SPAIN("Madrid", 3.223f, false, 83.86);

private final String capitalCity;
private final float population;
private final boolean landLocked;
private final double lifeExpectancy;

private Country(String capitalCity, float population, boolean landLocked, double lifeExpectancy) {
	this.capitalCity = capitalCity;
	this.population = population;
	this.landLocked = landLocked;
	this.lifeExpectancy = lifeExpectancy;
}

private String continent = "Europe";

public String details() {
	return "Capital:"+capitalCity + " population(millions):" + population + " " + continent + " LandLocked:" + landLocked + " lifeExpectancy:" + lifeExpectancy;
	
}


public float averageIncome(int GDP) {
	return GDP/(population* 1000000);
}

public double lifeExpectancy(int AVG) {
	return AVG/(lifeExpectancy);
}

}
