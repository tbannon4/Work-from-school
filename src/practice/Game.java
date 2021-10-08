package practice;

public class Game 
{
	public String name;
	public double price;
	public Game(String name, double price)
	{
		this.name = name;
		this.price = price;
	}
	public String getName()
	{
		return name;
	}
	public double getPrice()
	{
		return price;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public void setPrice(double price)
	{
		this.price = price;
	}
	public void sale(int discount)
	{
		price -= price * discount / 100;
		
		/*double sale = discount / 100;
		double takenOff = this.price * sale;
		double newPrice = this.price - takenOff;
		*/
	}
}
