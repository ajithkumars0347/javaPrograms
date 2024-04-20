package arrayConcepts;

public class FindingTargetIndex {
    public static void main(String[] args) {
		int[] arr= {1,3,3,4,5};
		int target=4;
		for(int i=0;i<=arr.length-2;i++) {
			for(int j=i+1;j<=arr.length-1;j++) {
				if(arr[i]+arr[j]==target) {
					System.out.println(i+"-"+j);
				}
			}
	}
		}
    
}
