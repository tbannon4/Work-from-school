package scoreClasses;

import java.util.Scanner;

public class ScoreListRunner 
{

	public static void main(String[] args) 
	{
		//creates a scanner object   takes things into console
		//also opens an input
		Scanner input = new Scanner(System.in);
		
		//makes a new score list object
		ScoreList sl = new ScoreList();
		
		//prints
		System.out.println("Enter a name and a grade. Enter -1 to stop. ");
		
		//creates a variable name and takes a string from the console to store in the variable create
		String name = input.next();
		
		//creates a variable name and takes an int from the console to store in the variable created
		int grade = input.nextInt();
		
		//while the grade is NOT = -1, run this loop
		while(grade != -1)
		{
			//creates a new score object using variables from earlier lines
			Score score = new Score(name, grade);
			
			//add score object to the sl object, the scorelist
			sl.add(score);
			
			//finds and returns the name scanned as the variable name
			name = input.next();
			
			//finds and returns the grade (an int) scanned and returns it as the variable name
			grade = input.nextInt();
		}
		//closes the input
		input.close();
		
		//prints the object
		System.out.println(sl);
	}

}
