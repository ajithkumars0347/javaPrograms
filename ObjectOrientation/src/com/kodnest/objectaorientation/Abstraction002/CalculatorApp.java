package com.kodnest.objectaorientation.Abstraction002;

public class CalculatorApp {
public static void main(String[] args) {
	CasioCalculator calculator=new CasioCalculator();
calculator.acceptCalculator(new Calculator1());
calculator.acceptCalculator(new Calculator2());
calculator.acceptCalculator(new Calculator3());
}
}
