package homeassignment.wk3String;

public class ChangeOddIndexToUpperCase {
	
	public static void main(String[] args) {
	
	//Declare String Input as Follow
	  String test = "changeme";
	 
	 //Convert the String to character array
	  
	  char arr[]=test.toCharArray();
	 System.out.println("Converted Odd Index array value to Upper Case : ");
	 //Traverse through each character (using loop)
	  for(int i=0;i<arr.length;i++)
	  {
	  //find the odd index within the loop (use mod operator)
		  if(i%2!=0)
		  {
	//within the loop, change the character to uppercase, if the index is odd else don't change
		arr[i]= Character.toUpperCase(arr[i]);
		}
		  System.out.print(arr[i]);
	  }	 
	  
	}
}
