package homeassignment.wk3String;

public class ReverseEvenWords {
public static void main(String[] args) {
	//Declare String as below
	String test = "I am a software tester";
	System.out.println("Original Text : " +test);
	//split the words and have it in an array
	String arr[] = test.split(" ");
	String val = "";
	//Traverse through each word (using loop)
	for (int i=0;i<arr.length;i++)
{
	//find the odd index within the loop (use mod operator)
	if(i%2!=0)
		//Using StringBuilder Class - Retrieve the even words(odd index) > reverse the word
		val = val+new StringBuilder(arr[i]).reverse()+" ";
	else
		val = val+arr[i]+" ";
}	
	System.out.println("Reversed Even Words: " +val);
}
}

