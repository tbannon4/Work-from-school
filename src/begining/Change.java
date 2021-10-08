package begining;

public class Change
{
	//# of cents
	private int change;
	
	public Change(int change)
	{
		this.change = change;
	}
	public int dollars()
	{
		int dollars = change / 100;
		change %= 100;
		return dollars;
	}
	public int quarters()
	{
		int quarters = change /100;
		change %= 25;
		return quarters;
	}
	public int dimes()
	{
		int dimes = change / 100;
		change %= 10;
		return dimes;
	}
	public int nickles()
	{
		int nickles = change / 100;
		change %= 5;
		return nickles;
	}
	public int pennies()
	{
		return change;
	}
	public void setChange(int change)
	{
		this.change = change;
	}
	@Override
	public String toString()
	{
		String str = "";
		str += " Your change is ";
		str += dollars() + " dollars, ";
		str += quarters() + " quarters, ";
		str += dimes() + " dimes, ";
		str += nickles() + " nickles, and ";
		str += pennies() + " pennies. ";
		return str;
	}
	
	
	
	
}
