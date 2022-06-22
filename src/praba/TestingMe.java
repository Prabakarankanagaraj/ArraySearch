package praba;

import java.util.Scanner;

public class TestingMe {
	public static void main(String[] args) {
		Scanner inputs=new Scanner(System.in);
		System.out.println("Enter two numbers are:");
		int num1=inputs.nextInt();
		int num2=inputs.nextInt();
//		System.out.println("Enter second Numbers are :");
//		int num2=inputs.nextInt();
		System.out.println(" Addition of two numbers are :"+(num1+num2));
		System.out.println("Subtraction of two numbers umbers are :"+(num1-num2));
		System.out.println("Multiplication of two numbers are :"+(num1*num2));
		System.out.println("Division of two numbers are :"+(num1/num2));
		inputs.close();
	}

}
