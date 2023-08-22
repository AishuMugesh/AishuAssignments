package homeassignment.wk1;

public class IsPrime {

	public static void main(String[] args) {
		
		int n= 13;
		boolean flag = false;
		for(int i=2;i<=(n-1);i++)
		{
			if(n%i==0) {
				flag = true;
			    break;
			}
		}
			if (!flag)
				System.out.println(n +" is a prime number");
			else
				System.out.println(n +" is a Non-Prime number");
		}
			
	}

