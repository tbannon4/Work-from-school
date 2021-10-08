package gas;

public class TripRunner 
{

	public static void main(String[] args) 
	{
		Trip trip = new Trip(12, 12);
		int miles = trip.getMiles();
		int gallons = trip.getGallons();
		System.out.println("The miles are " + miles);
		System.out.println("The Gallons are " + gallons);
		double mph = trip.getMPH();
		System.out.println("Your MPH is " + mph);
		
		
	}

}
