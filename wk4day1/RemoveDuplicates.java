package homeassignment.wk4day1;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicates {
	public static void main(String[] args) {
		
//		Declare a String as "PayPal India"
         String str = "PayPal India";
         
//		Convert it into a character array
         char[] ch = str.toCharArray();
         
//		Declare a Set as charSet for Character
          Set<Character> charSet = new LinkedHashSet<>();
          
//		Declare a Set as dupCharSet for duplicate Character
          Set<Character> dupCharSet = new LinkedHashSet<>();
          String obj = " ";
          
          
//		Iterate character array and add it into charSet
              for (int i = 0; i < ch.length; i++) {

            	  //      if the character is already in the charSet then, add it to the dupCharSet
            	if(charSet.add(ch[i])==false)
            	{
            		dupCharSet.add(ch[i]);
            	}
             }
              
              
//		Check the dupCharSet elements and remove those in the charSet
             // charSet.remove(dupCharSet);
//		Iterate using charSet
//		Check the iterator variable isn't equals to an empty space
              for (Character chr : charSet) {			
				if(!chr.equals(obj))
				{
					charSet.add(chr);
					charSet.remove(dupCharSet);
				}
			}
//		print it
              System.out.println("Duplicate Char Set: " +dupCharSet);
              System.out.println("Chracter Set without Duplicate set: " +charSet);

	}

}
