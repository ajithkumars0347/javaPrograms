package arrayConcepts;

public class StringConcepts {
  public static void main(String[] args) {
	String str="hello world!";
	char ch='y';
	char[] chArr=str.toCharArray();
	for(int i=0;i<=chArr.length-1;i++) {
		if(chArr[i]==ch) {
			for(int j=i+1;j<=chArr.length-1;j++) {
				System.out.print(chArr[j]);
			}
			return;
		}
			}
	for(char x:chArr) {
		System.out.print(x );
	}
}
}
