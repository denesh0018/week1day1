package week1day1assignment1;

public class TwoWheeler {

	int noOfWheels = 2;
	short noOfMirrors = 2;
	long chassisNumber=56789009876l;
	boolean isPunctured= false;
	double runningKm=15.26;
	public static String bikeName="BAJAJ";
	
			public static void main(String[] args) {
		// TODO Auto-generated method stub
		TwoWheeler obj =new TwoWheeler();
			System.out.println(obj.noOfWheels);
			System.out.println(obj.noOfMirrors);
			System.out.println(obj.chassisNumber);
			System.out.println(obj.isPunctured);
			System.out.println("BikeName="+TwoWheeler.bikeName);
			System.out.println(obj.runningKm);
	}

}
