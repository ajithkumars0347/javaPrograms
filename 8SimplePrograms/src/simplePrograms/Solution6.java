package simplePrograms;

import java.util.Scanner;

public class Solution6 {
Scanner scan=new Scanner(System.in);
int count=0;
public void range() {
System.out.println("enter the range");
int num=scan.nextInt();
for(int i=3;i<=num;i++) {
 int res=checkPrime(i);
 if(res!=0) {
	 System.out.println(res);
	 count++;
}
}
System.out.println("count of prime number are"+count);
}
public int checkPrime(int num)
{ 
	for(int i=2;i<=num/2;i++) {
	     if(num%i==0) {
	     return 0;
	     }
	     
	}	
	return num;
		
		}
}

