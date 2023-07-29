package com.kodnest.pattern.level7.assignments25patterns;

public class Pattern15 {
public static void main(String[] args) {
	  int rows = 6; 
	        for (int i = 0; i < rows; i++) {
	            char ch = 'A';
	            for (int j = 0; j < rows - i; j++) {
	                System.out.print(ch);
	                ch++;
	            }

	            for (int j = 0; j < 2 * i; j++) {
	                System.out.print(" ");
	            }

	            ch--;
	            for (int j = 0; j < rows - i; j++) {
	                System.out.print(ch);
	                ch--;
	            }

	            System.out.println(); // Move to the next line for the next row
	        }
	    }
	}
