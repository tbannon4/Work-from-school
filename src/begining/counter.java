package begining;

public class counter 
{
	//instance variable; private Type name
	private int count;
	//Constructor
	public counter(int count)
	{
	this.count = count; 
	}
	//method
	public int getCount()
	{
			return count;
	}
	public void count()
	{
		count = count +1;
	}
	public void reset()
	{
		count = 0;
	}
} 

