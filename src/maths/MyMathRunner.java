package maths;

public class MyMathRunner
{

	public static void main(String[] args) 
	{
		MyMath mymath = new MyMath(16);
		long power = mymath.power(8);
		System.out.println(" 16 ^ 8 = " + power);
		/* int num = mymath.getNum();
		mymath.setNum(12);
		int sum = mymath.plus(5);
		System.out.println(sum); 
		double div = mymath.doubleDiv(5);
		System.out.println(num);
		double product = mymath.times(7.3);
		System.out.println(product); */
		
	}

}
