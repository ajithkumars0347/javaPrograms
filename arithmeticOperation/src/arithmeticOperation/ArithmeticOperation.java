package arithmeticOperation;

public class ArithmeticOperation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sub=subtractNumbers(20, 5);
		System.out.println(sub);
		int mul=multiplyNumbers(4, 5);
		System.out.println(mul);
		double dub=divideNumbers(20, 4);
		System.out.println(dub);
		int rem=findRemainder(10, 3);
		System.out.println(rem);
	}
		public static int subtractNumbers(int num1, int num2) {
			return num1-num2;
		}
		public static int multiplyNumbers(int num1, int num2) {
			return num1*num2;
		}
		public static double divideNumbers(int num1, int num2) {
		return num1/num2;
		}
		public static int findRemainder(int num1, int num2) {
			return num1%num2;
		}
	}

