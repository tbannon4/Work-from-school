package begining;

public class MyTime 
{
	private int hours;
	private int minutes;
	public MyTime(int hours, int minutes)
	{
		this.hours = hours;
		this.minutes = minutes;
	}
	public void addMinutes(int minutes)
	{ 
		this.minutes += minutes;
		int excessHours = this.minutes / 60;
		this.hours +=excessHours;
		this.minutes %= 60;
	}
}
