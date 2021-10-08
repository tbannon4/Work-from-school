package begining;

public class BankAccountRunner {

	public static void main(String[] args) 
	{
		BankAccount ba = new BankAccount(1000);
	//  type        object   constructor (Upper case)
		double balence = ba.getBalence();
	//parameter-type,name object  method
		System.out.println(balence);
		ba.deposit(458.37);
		balence = ba.getBalence();
		System.out.println(balence);
		ba.withdrawl(2400.37);
		balence = ba.getBalence();
		System.out.println(balence);
	}

}
