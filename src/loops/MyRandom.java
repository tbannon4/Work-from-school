package loops;

public class MyRandom
{
	private double randDouble;
	private int randInt;
	public MyRandom()
	{
		randDouble = Math.random();
		randInt = (int)(Math.random() * 10) + 1;
	}
	public double getRandDouble()
	{
		return randDouble;
	}
	public int getRandInt()
	{
		return randInt;
	}
	public void print10()
	{
		int n = 0;
		while(n < 10)
		{
			randInt = (int)(Math.random() * 10);
			System.out.println(randInt);
			n++;
		}
	}
}
