package sumOfNaturalNumbers;
import java.util.Scanner;
public class SumOfNaturalNumbers {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter a number");
		int sum=0;
		int n=scan.nextInt();
		for(int i=1;i<=n;i++) {
			sum=sum+i;
		}
		System.out.println(sum);

	}

}
