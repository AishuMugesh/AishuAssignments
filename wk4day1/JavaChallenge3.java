package homeassignment.wk4day1;

public class JavaChallenge3 {
	
	public static void main(String[] args) {
		
		String text = "A man, a plan, a canal: Panama";
		//String text = "race a car";
		//converting all uppercase letters into lowercase letters 
		String lcText = text.toLowerCase();
		//removing all non-alphanumeric characters,
		String origText = lcText.replaceAll("[^a-zA-Z0-9_-]", "");
		String reverseTxt = "";
		System.out.println("Text after removing space and special characters:" +origText);
		char[] ch = origText.toCharArray();
		for (int i = ch.length -1; i >=0; i--) {
			//System.out.println(ch[i]);
			reverseTxt=reverseTxt+ch[i];			
		}
		System.out.println("Text after revresion : " +reverseTxt);
		if(origText.equals(reverseTxt))
			System.out.println("Given sentence : "+ text + " is a Palindrome");
		else
			System.out.println("Given sentence is not a Palindrome");
	}

}
