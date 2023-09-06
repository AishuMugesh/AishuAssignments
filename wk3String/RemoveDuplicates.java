package homeassignment.wk3String;

public class RemoveDuplicates {
	
	public static void main(String[] args) {
		
		// Declare String with duplicate words
		String text = "We learn java basics as part of java sessions in java week1";
		//Split the String into array and iterate over it 
		String arr[] = text.split(" ");
		String txt1 = "";
		int i,j;
		System.out.println("Givern String is " +text);
		System.out.println("String after removing duplicate words : ");
		
		for (i=0;i<arr.length;i++)
		{
			for(j=i+1;j<arr.length;j++)
			{
		//Initialize another loop to check whether the word is there in the array
			if(arr[i].equals(arr[j]))
			{
				txt1 = text.replaceAll(arr[i],"");
				break;
			}			
			}		
		}
		System.out.print(txt1);
}
}
