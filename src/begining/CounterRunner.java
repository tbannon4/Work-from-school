package begining;

public class CounterRunner {

	public static void main(String[] args) 
	{
		counter counter = new counter(5);
		int count = counter.getCount();
		System.out.println(count);
		counter.count();
		counter.count();
		counter.count();
		count = counter.getCount();
		System.out.println(count);
		counter.reset();
		count = counter.getCount();
		System.out.println(count);
	}

}
