package loops;

public class Thermostat
{
	private int temp;
	private boolean isHeat;
	
	public Thermostat(int temp, boolean isHeat)
	{
		this.temp = temp;
		this.isHeat = isHeat;
	}
	public int getTemp()
	{
		return temp;
	}
	public boolean getIsHeat()
	{
		return isHeat;
	}
	public void setTemp(int temp)
	{
		this.temp = temp;
	}
	public void setIsHeat(boolean isHeat)
	{
		this.isHeat = isHeat;
	}
	public boolean isOn3(int temp)
	{
		if(isHeat && temp < this.temp || !isHeat && temp > this.temp)
		{
			return true;
		}
		return false;
	}
	
	public boolean isOn2(int temp)
	{
		if(isHeat && temp < this.temp)
		{
			return true;
		}
		else if(isHeat && temp > this.temp)
		{
			return true;
		}
		return false;
	}
	public boolean isOn(int temp)
	{
		if(isHeat)
		{
			if(temp < this.temp)
			{
				return true;
			}
			else
			{
				return false;
			}
		}
			else
			{
				if(temp > this.temp)
				{
					return true;
				}
			}
		return false;
		}
		
	}

