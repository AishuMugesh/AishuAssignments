package homeassignment.wk3;

public class AxisBank extends BankInfo{
	
	public void deposit()
	{
		System.out.println("Deposit Amt : 70,000 // from Axis Bank Class");
	}
public static void main(String[] args) {

	AxisBank ab = new AxisBank();
	System.out.println("/**Sample for Method Overriding **/");
	System.out.println("Methods called from BankInfo class");
	ab.saving();
	ab.fixed();
	System.out.println("/** Deposit Method called using AxisBank class object **/");
	ab.deposit();
	BankInfo bi = new BankInfo();
	System.out.println("/** Deposit Method called using BankInfo class object **/");
	bi.deposit();
	
}
}
