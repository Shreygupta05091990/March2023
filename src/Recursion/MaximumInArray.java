package Recursion;

public class MaximumInArray {
	
	
	
public static void main(String[] args) {
	
	int[] arr = {20 ,2 ,33 ,78 ,110};
    int maximum =  	max(arr,0);
    System.out.println("Maximium in the array is " +  maximum );
	
	
}

private static int max(int[] arr, int idx) {
	
	if (idx > arr.length-1) {
		return 0;
	}
	
	int misa = max(arr,idx +1) ;  // misa =  maximum in smaller array 
	if (arr[idx]> misa) {
		return arr[idx];
		
	}else 
		return misa;
	
}

}
