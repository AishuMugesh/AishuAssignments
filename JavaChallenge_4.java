package homeassignment.wk5;

public class JavaChallenge_4 {
	
	public static void main(String[] args) {
		
		int num[] = {4,1,2,1,2};
		int len = num.length;
		int count = 0;
		
		for (int i = 0; i < len; i++) {
			
			for (int j = 0; j < len ; j++) {
				
				if(num[i]==num[j])
				{
					count++;
				}
			}
			if(count==1)
			{
				System.out.println("Single Number in given array is " +num[i]);
			}
		}
	}

}
