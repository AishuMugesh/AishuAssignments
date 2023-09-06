package homeassignment.wk3;

public class Students {
	
	public void getStudentInfo(int id)
	{
		System.out.println("Student ID : " +id);
		
	}
	
	public void getStudentInfo(int id,String name)
	{
		System.out.println("Student ID :" +id +" and Name : " +name);
	}
	
	public void getStudentInfo(String email,long phoneNumber)
	{
		System.out.println("Student Email Id : " +email +" and Phone Number : " +phoneNumber);
	}
	
	public static void main(String[] args) {
		Students ss = new Students();
		System.out.println("/** Sample for Method Overloading **/");
		ss.getStudentInfo(1234);
		ss.getStudentInfo(1110,"Maria");
		ss.getStudentInfo("Maria.john@testmail.com",978889887l);
	}
}
