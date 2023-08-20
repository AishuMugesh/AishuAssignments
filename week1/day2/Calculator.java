package week1.day2;

public class Calculator {
	
	private int add2Numbers (int num1,int num2) {
	return num1+num2;
	}
	
	public double mult2Numbers (double num1,int num2) {
	return num1*num2;
	}
	
	public void subNumbers() {
		int num1=50;
		int num2=25;
		System.out.println(+num1-num2);
	}
	
	public static class MyCalculator
	{
		public static void main(String[] args) {		
		Calculator calc = new Calculator();
		System.out.println("Output for AddNumber Method:" +calc.add2Numbers(24,25));
		System.out.println("Output for MultiplyNumber Method :" + calc.mult2Numbers(20.1,10));
		calc.subNumbers();
		//System.out.println(calc.subNumbers());
		}
		
	}

}

