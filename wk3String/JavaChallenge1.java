package homeassignment.wk3String;

public class JavaChallenge1 {
	public static void main(String[] args) {
		//Declare the String
		String text =  "luffy is still joyboy";
		
		// Convert it to Array suing split method
		String[] split = text.split(" ");
		int len = split.length; // Length of the given string array
		int len2;
		String last;
		//Locate the last word of the string and retrieve its length
		if(len>0)
			{
			last = split[len-1];
			System.out.println("Last Word of the Given Sentence is : " +last);
			len2 = last.length();
			System.out.println("Length : " +len2);
		}
	}

}
