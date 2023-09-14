package homeassignment.wk4day1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortingUsingCollection {
	public static void main(String[] args) {
		
		String[] text = {"Wipro", "HCL" , "CTS", "Aspire Systems"};
		List<String> sortList = new ArrayList<>();
		String revList = "";
		for (int i = 0; i < text.length; i++) {
			sortList.add(text[i]);
		}
		Collections.sort(sortList);
		System.out.println("List sorted using Collection :" +sortList);
		System.out.println("Reverse order of list: ");
		for (int i = sortList.size()-1 ; i >=0; i--) {
			revList = sortList.get(i);	
			System.out.print(""+revList+"||");
		}
	}

}
