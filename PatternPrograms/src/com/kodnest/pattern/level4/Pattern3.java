package com.kodnest.pattern.level4;

public class Pattern3 {

	public static void main(String[] args) {
     for(int i=1;i<=5;i++) {
    	 for(int j=1;j<=i;j++) {
    		 if(j<=i) {
    			 System.out.print("#");
    		 }
    		 }
    		 for(int k=1;k<=5;k++) {
       		  System.out.print("*");
    	 }
    	 System.out.println();
     }

	}

}
