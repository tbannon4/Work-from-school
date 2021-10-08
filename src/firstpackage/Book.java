package firstpackage;

public class Book 
{
	//instance variable
	private String title;
	private int bookNum;
	private String student;
	//Constructor
	public Book(String title, int bookNum, String student)
	{
		this.title = title;
		this.bookNum = bookNum;
		this.student = student;
	}
	//set method
	public void setStudent(String student)
	{
		this.student = student;
	}
	//get methods
	public String getTitle()
	// no void - return
	{
		return title;
	}
	public int getbookNum()
	// no void - return
	{
		return bookNum; 
	}
	public String getstudent()
	{
		return student;
	}
	
}
