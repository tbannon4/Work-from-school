package maths;

public class MyMath 
{
	private int num;
	public MyMath(int num)
	{
		this.num = num;
	}
	public long power(int exp)
	{
		long res = 1;
		while(exp > 0)
		{
			res *=num;
			exp--; //exp++ 1    adds one
		}
		return res;
	}
	public double times(double val)
	{
		double product = (double) num * val;
		return product;
	}
	public double doubleDiv(int val)
	{
		double div = (double) num / val;
		return div;
	}
	public void divBy(int val)
	{
		num = num / val;
	}
	public int plus(int val)
	{
		int sum = num + val;
		return sum;
	}
	public int getNum()
	{
		return num;
	}
	public void setNum(int num)
	{
		this.num = num;
	}
}
