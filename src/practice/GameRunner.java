package practice;

public class GameRunner 
{

	public static void main(String[] args) 
	{
		Game game = new Game("Mario Kart ", 100);
		String name = game.getName();
		double price = game.getPrice();
		System.out.println("The game " + name + "is "+ price + " dollars");
		game.sale(15);
		double newPrice = game.getPrice();
		System.out.println(newPrice);
	}

}
