package gas;

import java.util.ArrayList;

public class GasMileage 
{
	private ArrayList<Trip> gasmileage;
	public GasMileage()
	{
		gasmileage = new ArrayList<Trip>();
	}
	public void addTrip(Trip trip)
	{
		gasmileage.add(trip);
	}
	public double gasMileage()
	{
		double mph = 0;
		for(int index = 0; index < gasmileage.size(); index++)
		{
			Trip trip = gasmileage.get(index);
			double totalMiles = trip.getMiles();
			double totalGallons = trip.getGallons();
			mph = totalMiles / totalGallons;
		}
		double totalMPH = (double) mph;
		return totalMPH;
	}
	public void clearTrips()
	{
		int index = 0;
		while(index < gasmileage.size())
		{
			gasmileage.remove(index);
		}
	}
	@Override
	public String toString()
	{
		String str = "";
		for(int index = 0; index < gasmileage.size(); index++)
		{
			Trip totalMPH = gasmileage.get(index);
			str += totalMPH + "\n";
		}
		return str;
	}

}