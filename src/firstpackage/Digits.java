package firstpackage;

public class Digits 
{
	private int num;
	public Digits(int num)
	{
		this.num = num;
	}
	public void printDigits()
	{
		String str = "";
		while(num > 0)
		{
			int digit = num % 10;
			num /= 10;
			str += digit + " ";
		}
		System.out.println(str);
	}
	//assume that num has 4 digits
	/*public void printDigits()
	{
		//get the last digit
		int digit1 = num % 10;
		//remove the last digit
		num /= 10;
		int digit2 = num % 10;
		num /=10;
		int digit3 = num % 10;
		num /=10;
		int digit4 = num % 10;
		num /=10;
		System.out.println(digit1 + " " +
							digit2 + " " +
							digit3 + " " +
							digit4);
	} */
}
