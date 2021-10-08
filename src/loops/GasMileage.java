package loops;

public class GasMileage 
{
	private String model;
	private int gallons;
	private int miles;
	
	public GasMileage(String model)
	{
		this.model = model;
		this.gallons = 0;
		this.miles = 0;
	}
	public void fillTank(int gallons, int miles)
	{
		this.gallons += gallons;
		this.miles += miles; 
	}
	public int milesPerGallon()
	{
		if(gallons > 0)
		{
			gallons = miles / gallons;
		}
		else
		{
			System.out.println(" (Can't devide by zero!) ");
		}
		return gallons;
	}
}
