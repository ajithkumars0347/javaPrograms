package arrayConcepts;

public class DecimalToBinary {
public static void main(String[] args) {
	int dec=10;
	while(dec!=0) {
		int rem=dec%2;
		System.out.print(rem);
		dec=dec/2;
	}
}
}
