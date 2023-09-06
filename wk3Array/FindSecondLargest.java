package homeassignment.wk3Array;

import java.util.Arrays;

public class FindSecondLargest {
	
	public static void main(String[] args) {
		
	int[] data = {3,2,11,4,6,7};
	int len = data.length;
	// Arrange the array in ascending order
    Arrays.sort(data); /// 2,3,4,6,7,11
    //for(int i=0;i<len;i++)
    	//System.out.println(data[i]);
	// Pick the 2nd element from the last and print it
    System.out.println("First Largets Number in Array : " +data[len-1]);
    System.out.println("Second Largest Number in Array  : " +data[len-2] );
    }
}
