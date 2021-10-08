package firstpackage;

public class GradeCalculatorRunner 
{

	public static void main(String[] args)
	{	//type object        java keyword constructor (Uppercase)
		GradeCalculator gc = new GradeCalculator(59, false);
		//type object  object . method
		String grade = gc.getGrade();
		System.out.println("Grade = " + grade);
		
		gc.setIsCurved(false);
		grade = gc.getGrade();
		System.out.println("Grade = " + grade);
		
		gc.setGrade(75);
		grade = gc.setGrade();
		System.out.println("Grade = " + grade);
	}

}
