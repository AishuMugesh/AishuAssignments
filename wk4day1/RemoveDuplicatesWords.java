package homeassignment.wk4day1;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicatesWords {
	public static void main(String[] args) {
		// * a) Use the declared String text as input
	String text = "We learn java basics as part of java sessions in java week1";
    // *Output= We learn java basics as part of sessions in week1
    // c) Create a empty Set 
		Set<String> strSet = new LinkedHashSet<>();
   //b) Split the String based on white spaces and save as String Array ,Then iterate the Array	
	String[] splitStr = text.split(" ");
		for (int i = 0; i < splitStr.length; i++) {
		strSet.add(splitStr[i]);
	}
 //e) Print the Set values which is having unique words
      System.out.println("Set value without duplicates: " +strSet);
	}

}
