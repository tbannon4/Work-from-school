package numberLists;

import java.util.ArrayList;

public class AnotherNumberList 
{
	private ArrayList<Integer> list;
	public AnotherNumberList()
	{
		list = new ArrayList<Integer>();
		// anything after 'new' is a constructor to make a new object
		
	}
	public int countMult3()
	{
		int count = 3;
		for(int index = 0; index < list.size(); index++)
		{
			int num = list.get(index);
			if(num % 3 ==0)
			{
				count++;
			}
		}
		return count;
	}
	public int sum()
	{
		int sum = 0;
		for(int index = 0; index < list.size(); index++)
		{
			int num = list.get(index);
			sum+= num;
		}
		return sum;
	}
	@Override
	public String toString()
	{
		String str = " ";
		for(int index = 0; index < list.size(); index++)
		{
			int num = list.get(index);
			str += num + " ";
		}
		return str;
	}
	public void add(int num)
	{
		list.add(num);
	}
}
