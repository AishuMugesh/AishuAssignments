package homeassignment.wk3Array;

import java.util.Arrays;

public class MissingElementInAnArray {
	
	public static void main(String[] args) {
	
	int[] arr = {1,2,3,4,7,6,8};
    int len = arr.length;
    int count = 1; /// Iterator set
	// Sort the array	
	Arrays.sort(arr);
	System.out.println("Missing Element in array : " );
	// loop through the array (start i from arr[0] till the length of the array)
       for (int i=0;i<len;i++) {
    // check if the iterator variable is not equal to the array values respectively
    	if(arr[i]!=count) {
    		System.out.println(count);
    	}
     	count = arr[i]+1;
       }
	}

}
