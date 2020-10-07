package prgms;

public class Length_of_Digit {
	public static int digitLength(int num)
	{
		int temp=0;
		if(num!=10)
		{
			num=num%10;
			temp++;
		}else if(num!=10)
		{
			num=num%10;
			temp++;
		}else if(num!=10)
		{
			num=num%10;
			temp++;
		}else if(num!=10)
		{
			num=num%10;
			temp++;
		}else if(num==10)
		{
			num=num%10;
			temp++;
		}
		return temp;
	}

	public static void main(String[] args) {
		System.out.println("Enter the digit between 1 and 5");
		int length=digitLength(10);
		System.out.println("digits length is : "+length);
	}
}

