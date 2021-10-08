package firstpackage;

import java.util.Scanner;

import numberLists.AnotherNumberList;

public class AllRunner 
{

	public static void main(String[] args) 
	{
		AnotherNumberList anl = new AnotherNumberList();
		Scanner input = new Scanner(System.in);
		System.out.println("Enter some numbers. Enter 99 to stop, ");
		int num = input.nextInt();
		while(num !=999)
		{
			anl.add(num);
			num = input.nextInt();
		}
		System.out.println(anl);

	}

}
