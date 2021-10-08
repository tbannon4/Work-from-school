package gas;

import java.util.Scanner;

public class GasMileageRunner
{

	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		GasMileage gm = new GasMileage();
		
		int miles = 0;
		int gallons = 0;
		
		System.out.println("Enter miles and gallons");
		
		miles = input.nextInt();
		gallons = input.nextInt();
		
		
		while(miles != -1)
		{
			Trip trip = new Trip(miles, gallons);
			double firstMPH = trip.getMPH();
			System.out.println(firstMPH);
			gm.addTrip(trip);
			miles = input.nextInt();
			if(miles == -1)
			{
				input.close();
			}
			else
			{
			gallons = input.nextInt();
			}
			
		}
		System.out.println(gm);
		gm.clearTrips();
		
		
		
		//System.out.println(gm);

		
	}

}
