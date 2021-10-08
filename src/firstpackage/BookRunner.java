package firstpackage;

public class BookRunner 
{

	public static void main(String[] args) 
	{
		Book book = new Book("Animal Farm", 123456, "Obama");
		// three variables because we wrote it with three variables
		String title = book.getTitle();
		int bookNum = book.getbookNum();
		String student = book.getstudent();
		System.out.println("The book " + title + " has number " + bookNum + " and is checked out to " + student);
		//                 Literal String    
		book.setStudent("Jeff Bezos");
		student = book.getStudent();
		System.out.println("The book " + title + " has number " + bookNum + " and is checked out to " + student);
		
	}

}
