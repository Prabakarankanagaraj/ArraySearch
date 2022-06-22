package praba;

import java.util.Scanner;

public class userinput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		System.out.println("Enter Your Name :");
		String name=s.next();
		System.out.println("Enter Your Rollno :");
		int Rollno=s.nextInt();
		System.out.println("Enter Your College Nmae :");
		String Collegename=s.next();
		System.out.println("Enetr Your Place :");
		String Place=s.next();
		System.out.println("Enter Your Company Nmae :");
		String Companyname=s.next();
		System.out.println(name);
		System.out.println(Rollno);
		System.out.println(Collegename);
		System.out.println(Place);
		System.out.println(Companyname);
        
	}

}
