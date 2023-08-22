package homeassignment.wk1;

public class TwoWheeler {
	
		// Declare Two Wheeler details with respective data types and its value
		
		int noOfWheels = 2 ;
		short noOfMirrors = 2;
		long chassisNumber = 12347687283090l;
		boolean isPunctured = false;
		String bikeName = "Royal Enfield";
		double runningKM = 201.22d;

	public static void main(String[] args) {
	
	   TwoWheeler tw = new TwoWheeler();
       System.out.println("No Of Wheels in Two Wheeler : " +tw.noOfWheels);
       System.out.println("No Of Mirrors in Two Wheeler : " +tw.noOfMirrors);
       System.out.println("Chassis Number of Two Wheeler : " +tw.chassisNumber);
       System.out.println("Is Bike Punctured ?? : " +tw.isPunctured);
       System.out.println("Bike Name : " +tw.bikeName);
       System.out.println("Running KM of Bike : " +tw.runningKM);
		
	}
}

