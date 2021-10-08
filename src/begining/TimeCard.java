package begining;
// practice test

public class TimeCard 
{
	private String employee;
	private int hours;
	  
	public TimeCard(String employee)
	{
		this.employee = employee;
		this.hours = 0;
	}
	public String getEmployee()
	{
		return employee;
	}
	public int getHours()
	{
		return hours;
	}
	public void addTime(int time)
	{
		hours = hours + time;
	}
	
}
