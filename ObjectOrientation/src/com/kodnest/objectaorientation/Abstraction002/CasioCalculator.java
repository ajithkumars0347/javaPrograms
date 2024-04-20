package com.kodnest.objectaorientation.Abstraction002;

public class CasioCalculator {
public void acceptCalculator(Calculator ref) {
	ref.add();
	ref.subtraction();
	ref.multi();
	int res=ref.div();
	System.out.println(res);
}
}
