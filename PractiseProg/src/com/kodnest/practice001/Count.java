package com.kodnest.practice001;

public class Count {
public int counting( int n) {
    int digiCount=0;
	while(n!=0) {
		digiCount++;
	 n=n/10;
  }
	return digiCount;
}
}
