package homeassignment.wk4day1;

import java.util.HashSet;
import java.util.Set;

public class PrintUniqueCharacter {
	
	public static void main(String[] args) {
		
		String str = "Appu";
		char dup = ' ';
		char[] charArr = str.toCharArray();
		Set<Character> strSet = new HashSet<>();
		System.out.println("Original String: " +str);
		for (int i = 0; i <charArr.length; i++) {
		if(strSet.add(charArr[i])==false)
		{
			dup=charArr[i];
			System.out.println("Duplicate character " +dup);
		}
		}
		strSet.remove(dup);
		System.out.println("Set after removing duplicate character: " +strSet);
	}

}
