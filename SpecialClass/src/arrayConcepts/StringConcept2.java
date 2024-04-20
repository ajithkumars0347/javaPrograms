package arrayConcepts;

public class StringConcept2 {
public static void main(String[] args) {
	System.out.println("hi");
	String str="SAMSUNG ELECTRONICS";
    char ch='A';
    int count=2;
    for(int i=0;i<=str.length()-1;i++) {
    	if(ch==str.charAt(i)) {
    		for(int j=i;j<=str.length()-1;j++) {
    			if(str.charAt(j)==' ')
    				continue;
    		if(count==2) {
    			System.out.print(str.charAt(j));
    			count=0;
    		}
    		else {
    			count++;
    		}
    	}
    		return;
    		}
    }
}
}
