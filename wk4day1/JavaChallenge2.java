package homeassignment.wk4day1;

public class JavaChallenge2 {
	
	public static void main(String[] args) {
		
		int n=64;
		int temp = 0 ;
		int sqroot = n/2;
		do
		{
			temp=sqroot;
			sqroot=(temp+(n/temp))/2;
		}
		while ((temp-sqroot)!=0);
			
				System.out.println("Square root of given nmber is : " +sqroot);
		
	}

}
