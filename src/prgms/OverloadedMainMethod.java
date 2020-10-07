package prgms;

public class OverloadedMainMethod {
	
	public static void addition(int a)
	{
		System.out.println("Main method 2");
	}
	
	public static void addition(int a, int b)
	{
		System.out.println("Main method 3");
	}
	
	public static void addition(double b, int a)
	{
		System.out.println("Main method 4");
	}
	
	public static void addition(char c, int a)
	{
		System.out.println("Main method 5");
	}
	
	public static void main(String[] args) {
		addition(5,6);
		System.out.println("main method 1");
		addition(7);
		addition(3.4,9);
		addition('c', 4);
	}
	
	public static void addition(short s, int a)
	{
		System.out.println("Main method 6");
	}
}
