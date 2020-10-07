package prgms;

public class SwitchExample {
	public static void main(String[] args) {
		char grade='F';
		
		switch(grade)
		{
		case 'D': System.out.println("Distinction");
					break;
		case 'C': System.out.println("First class");
					break;
		case 'A': System.out.println("Third class");
					break;	
		default : System.out.println("Worst student ever");
		}
	}
}



