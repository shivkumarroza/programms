package prgms;

import java.util.Scanner;

public class ScannerClassExample {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("\nEnter User Details");
		System.out.println("\nEnter name");
		String name=scan.nextLine();
		System.out.println("\nAge");
		int age=scan.nextInt();
		System.out.println("\nphone number");
		long phone = scan.nextLong();
		System.out.println("\nenter your Gender");
		char gender = scan.next().charAt(0);
		scan.close();
		
		System.out.println("\nFinal user details are");
		System.out.println("\nName is : "+name);
		System.out.println("\nage is : "+age);
		System.out.println("\nphone number is : "+phone);
		System.out.println("\ngender is : "+gender);
		
		
	}

}
