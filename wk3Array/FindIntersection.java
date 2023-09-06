package homeassignment.wk3Array;

public class FindIntersection {
	
	public static void main(String[] args) {
		
		int a[] = {3,2,11,4,6,7};
		int b[] = {1,2,8,4,9,7};
		int lenA = a.length;
		int lenB = b.length;
				
		 //Declare for loop iterator from 0 to array length
		for(int i=0;i<lenA;i++)
		{
		//Declare a nested for another array from 0 to array length
			for (int j=0;j<lenB;j++)
			{
		//Compare Both the arrays using a condition statement
				if(a[i]==b[j])
				{
					//Print the first array (should match item in both arrays)
					System.out.println("Matched Numbers between Arrays :" +a[i]);
				}
			}
		}	
				
	}	 	
}
