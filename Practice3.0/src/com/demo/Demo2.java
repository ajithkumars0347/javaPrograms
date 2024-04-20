package com.demo;

import java.util.Arrays;

public class Demo2 {
		public static void main(String []args){
        int[] arr= {40,50,20,10,30,10,10,20};
        int reversed=removeDuplicates(arr);
        System.out.println();
        for(int i=0;i<=reversed-1;i++) {
        	System.out.print(arr[i]+" ");
        }
		}
		public static int removeDuplicates( int[] arr) {
			Arrays.sort(arr);
			for(int x:arr) {
				System.out.print(x+" ");
			}
			System.out.println();
			int j=0;
			for(int i=1;i<=arr.length-1;i++) {
				if(arr[i]!= arr[j]) {
					j++;
					arr[j]=arr[i];
				}
				
			}
			for(int x:arr) {
				System.out.print(x+" ");
			}
			return j+1;
			}
		}
