package arrayPrograms;

import java.util.Scanner;

public class Copy {
public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
	System.out.println("enter the size of the array..");
	int[] arr=new int[scanner.nextInt()];
	System.out.println("enter "+arr.length+" elements...");
	for(int i=0;i<=arr.length-1;i++) {
		arr[i]=scanner.nextInt();
	}
	int[] arr2=new int[arr.length];
	for(int i=0;i<=arr2.length-1;i++) {
		arr2[i]=arr[i];
	}
	System.out.println("first array...");
	for(int x:arr) {
		System.out.print(x+" ");
	}
	System.out.println();
	System.out.println("second array...");
	for(int x:arr2) {
		System.out.print(x+" ");
	}
}
}
