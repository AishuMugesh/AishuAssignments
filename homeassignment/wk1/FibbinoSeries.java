package homeassignment.wk1;

public class FibbinoSeries {
	
	public static void main(String[] args) {
		
		int num1,num2,temp;
		num1=0;
		num2=1;
		temp=0;
		System.out.print(num1+" "+num2);
		//temp=num1+num2;
				
		for(int i=1;i<=11;i++)
		{
			temp=num1+num2;
			num1=num2;
			num2=temp;
			System.out.print(" "+ temp);
			
		}
	}

}
