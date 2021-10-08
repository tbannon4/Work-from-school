package scoreClasses;

public class Score 
{
	private String name;
	private int grade;
	public Score(String name, int grade)
	{
		this.name = name;
		this.grade = grade;
	}
	public String getName()
	{
		return name;
	}
	public int getGrade()
	{
		return grade;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public void setGrade(int grade)
	{
		this.grade = grade;
	}
	@Override
	public String toString()
	{
		return name + " : " + grade;
	}
}
