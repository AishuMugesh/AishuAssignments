package homeassignment.wk3String;

public class Palindrome {
	
	public static void main(String[] args) {
		
		String str = "madam";
		String rev = "";
		int len = str.length();
		//Reverse string from char array -- Add the char to Reverse string 
		for (int i=len-1;i>=0;i--)
		{
			rev=rev+str.charAt(i);
		}
		if(str.equals(rev))
		{	
		  System.out.println("Given string * " +str +" * is a Palindrome ");
	    }
		else 
		{
			System.out.println("Given String is not a Palindrome");
		}
	}
}
