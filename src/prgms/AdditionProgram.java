package prgms;

public class AdditionProgram {

	public static double addition(double a, double b, double c)
	{
		return a+b;
		
	}
	
	public static double addition(double a, double b, double c, double d)
	{
		return a+b;
		
	}
	public static double addition(double a, double b)
	{
		return a+b;
		
	}
	
	
	public static double addition(double a, int b)
	{
		return a+b;
		
	}
	
	public static double addition(int a, double b)
	{
		return a+b;
		
	}
	
	public static double addition(double a)
	{
		return a;
		
	}
	
	public static void main(String[] args) {
		System.out.println(addition(1, 2.0));
		System.out.println(addition(1.0, 5.6));
		System.out.println(addition(2.3, 0));
		System.out.println(addition(4.5, 5.6, 6.8));
		
	}
	
}


