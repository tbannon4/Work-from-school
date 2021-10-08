package begining;

public class BankAccount 
{
	//private instance variable
	private double balence;
	public BankAccount(double balence)
	{
		this.balence = balence;
	}
	//get method
	public double getBalence()
	//no void so it gets returned
	{
		return balence;
	}
	public void deposit(double money)
	//void means nothing is returned
	{
		balence = balence + money;
	}
	public void withdrawl(double money)
	{
		if(money > balence)
		//Boolean: binary variable, having no possible values called "true" and "false"
		{
			System.out.println("Insuffucient Funds");
		}
		else
		{
		balence = balence - money;
		}
		// an if statement is a branch that will run either set of code IF a statement is true/false
	}	

}
