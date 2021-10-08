package gas;

public class Trip 
{
	private int miles;
	private int gallons;
	
	public Trip(int miles, int gallons)
	{
		this.miles = miles;
		this.gallons = gallons;
	}
	public int getMiles()
	{
		return miles;
	}
	public int getGallons()
	{
		return gallons;
	}
	public void setMiles(int miles)
	{
		this.miles = miles;
	}
	public void setGallons(int gallons)
	{
		this.gallons = gallons;
	}
	public double getMPH()
	{
		double mph = (double) miles / (double) gallons;
		return mph; 
	}
	@Override
	public String toString()
	{
		String str = "" + getMPH() + "\n";
		return str;
	}
}
