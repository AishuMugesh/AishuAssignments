package homeassignment.wk4day1;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class FindSecondLargest {
	

	public static void main(String[] args) {
		
		// Here is the input
				int[] data = {3,2,11,4,6,7,2,3,3,6,7};
				int len = 0;
				//       output= 7;

				 //a) Create a empty Set Using TreeSet
				Set<Integer> ss = new TreeSet<>();
				 //b) Declare for loop iterator from 0 to data.length and add into Set 
				for (int i = 0; i < data.length; i++) {
					ss.add(data[i]);
				}
				System.out.println("Original Set :" +ss);
				//* c) converted Set into List
				List<Integer> numList = new ArrayList<>(ss);
				len = numList.size();
				 //* d) Print the second last element from List
				System.out.println("Second Largest Number in List :" +numList.get(len-2));
 }

}
