package firstpackage;

public class MyStringRunner
{

	public static void main(String[] args) 
	{
		MyString ms = new MyString("bookeeper");
		int numE = ms.countEs();
		System.out.println("There are " + numE + " e's.");
		String noEs = ms.removeEs();
		System.out.println(noEs);
		int doubles = ms.countDoubles();
		System.out.println("There are " + doubles + " double letters");
		String evensfirst = ms.evensFirst();
		System.out.println(evensfirst);
	}

}
