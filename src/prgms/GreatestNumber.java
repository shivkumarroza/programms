package prgms;

public class GreatestNumber {
	public static void main(String[] args) {
		greatNumber(0, 0, 0);
		
	}
	
	public static void greatNumber(int a, int b, int c)
	{
		if(a>c && a>b)
		{
				System.out.println("a is greater");
				
		}
		else if(b>c)
		{
			System.out.println("B is greater");
		}
		else if (c==a)
			System.out.println(" a and c are equal, b is not equal");
		else if (c==b)
			System.out.println("c and b are equal, a is not equal");
		else
			System.out.println("C is greater");
	}

}
