package firstpackage;

public class GradeCalculator 
{
//private instance variables
	private int grade;
	private boolean isCurved;
	//Constructor
	public GradeCalculator(int grade, boolean isCurved)
	{
		this.grade = grade;
		this.isCurved = isCurved;
	}
	public String getGrade()
	{
		if(isCurved)
		{
			return getCurvedGrade();
		}
		else
		{
			return getUncurvedGrade();
		}
	
		
	}
	public String getUncurvedGrade()
	{
		String LetterGrade = "F";
		if(grade >= 90)
		{
			LetterGrade = "A";
		}
		else if(grade >= 80)
		{
			LetterGrade = "B";
		}
		else if(grade >= 70)
		{
			LetterGrade = "C";
		}
		else if(grade >= 60)
		{
			LetterGrade = "D";
		}
		return LetterGrade;
	}
	public String getCurvedGrade()
	{
		String LetterGrade = "F";
		if(grade >= 74)
		{
			LetterGrade = "A";
		}
		else if(grade >= 57)
		{
			LetterGrade = "B";
		}
		else if(grade >= 43)
		{
			LetterGrade = "C";
		}
		else if(grade >= 30)
		{
			LetterGrade = "D";
		}
		return LetterGrade;
	}
		
	
}
