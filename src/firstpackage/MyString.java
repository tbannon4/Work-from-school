package firstpackage;

public class MyString 

//String notes

//string is a list of characters
//str.length
//substring()

//substring(index) : gives you a fraction of a string

//substring(i , j)
//i = start
//j = up to but not included

//equals()

//str = Vacaville
//str.substring(4) start at the fourth letter and count until the end
//str.substring(4) = "ville"

//str = Vacaville
//str.substring(4 , 7) start at the fourth letter then continue but not include the 7th letter
//str.substring(4 , 7) = "vil"
{
	private String str;
	public MyString(String str)
	{
		this.str = str;
	}
	public String evensFirst()
	{
		String even = "";
		String odd = "";
		for(int index = 0; index < str.length(); index++)
		{
			String letter = str.substring(index, index + 1);
			if(index % 2 ==0)
			{
				even += letter;
			}
			else
			{
				odd += letter;
			}
		}
		return even + odd;
	}
	public int countDoubles()
	{
		int count = 0;
		for(int index = 0; index + 1 < str.length(); index++)
		{
			String first = str.substring(index,index + 1);
			String second = str.substring(index + 1, index + 2);
			if(first.equals(second))
			{
				count++;
			}
		}
		return count;
	}
	public String removeEs()
	{
		String noEs = "";
		for(int index = 0; index < str.length(); index++)
		{
			String letter = str.substring(index, index + 1);
			if(!letter.equals("e"))
			{
				noEs += letter;
			}
		}
		return noEs;
	}
	public int countEs()
	{
		int count = 0;
		for(int index = 0; index < str.length(); index++)
		{
			String letter = str.substring(index, index + 1); //same as list.get(index)
			if(letter.equals("e"))
			{
				count++;
			}
		}
		return count;
	}
}
