package arrayConcepts;

public class BinaryToDecimal {
public static void main(String[] args) {
	System.out.println("hi");
	int bin=11010;
	int val=0;
	int pow=0;
	while(bin!=0) {
		int rem=bin%10;
		val=val+rem*(int)Math.pow(2,pow);
		pow++;
		bin=bin/10;
	}
	System.out.println(val);
}
}
