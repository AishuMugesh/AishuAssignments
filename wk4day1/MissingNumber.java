package homeassignment.wk4day1;

import java.util.Set;
import java.util.TreeSet;

public class MissingNumber {
	public static void main(String[] args) {
		
		int[] arr = {1,8,2,7,3,4,2,7,6,8,9,10,10,9};
		//a) Remove the duplicates using Set
		Set<Integer> setNum = new TreeSet<>();
		int n1=1;
		for (int i = 0; i < arr.length; i++) {
			setNum.add(arr[i]);
		}
		 //b) Make sure the set is in the ascending order
		System.out.println("Set Value: " +setNum);
		 //* c) Iterate from the starting number and verify the next number is + 1
		for (Integer num : setNum) {			
			 //* d) If did not match, that is the number
			if (num!=n1)
			{
				System.out.println("Missing Number : " +n1);
     		}	
			n1=num+1;
		}
	}

}
